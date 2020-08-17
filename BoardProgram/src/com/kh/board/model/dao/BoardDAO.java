package com.kh.board.model.dao;

import static com.kh.common.JDBCTemplate.*;

import java.io.Closeable;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kh.board.model.vo.Board;
import com.kh.member.model.vo.Member;

public class BoardDAO {

	private Properties prop = null;
	
	public BoardDAO() {
		try {
			
			prop = new Properties();
			prop.load(new FileReader("query.properties"));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 회원 로그인용 DAO
	 * @param inputLogin
	 * @param conn
	 * @return loginMember
	 * @throws Exception
	 */
	public Member login(Member inputLogin, Connection conn) throws Exception {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member loginMember = null;
		
		// query.properties에 SQL 작성 후 얻어오기
		String query = prop.getProperty("loginMember");
		
		try {
			
			// DB 연결 준비
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, inputLogin.getMemberId());
			pstmt.setString(2, inputLogin.getMemberPwd());
			
			// SQL 수행 후 결과 저장
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				
	            String memberId = rset.getString("MEMBER_ID");
	            String memberPwd = rset.getString("MEMBER_PWD");
	            String memberName = rset.getString("MEMBER_NAME");
	            char gender = rset.getString("GENDER").charAt(0);
	            String email = rset.getString("EMAIL");
	            String phone = rset.getString("PHONE");
	            int age = rset.getInt("AGE");
	            String address = rset.getString("ADDRESS");
	            Date enrollDate = rset.getDate("ENROLL_DATE");
	            
	            loginMember = new Member(memberId, memberPwd, memberName, gender, 
	            		email, phone, age, address, enrollDate);
			}
		}finally{
			
			// 사용한 DB 자원 반환
			close(rset);
			close(pstmt);
			
		}
		
		return loginMember;
	}


	/**
	 * 게시글 삽입용 DAO
	 * @param board
	 * @param conn
	 * @return result
	 * @throws Exception
	 */
	public int insertBoard(Board board, Connection conn) throws Exception{
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertBoard");
		
		try {
			
			// DB에 SQL 전달 준비
			pstmt= conn.prepareStatement(query);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getWriter());
			
			result = pstmt.executeUpdate();
			
		}finally {
			
			// 사용한 DB 자원 반환
			close(pstmt);
		}
		
		return result;
	}

	/**
	 * 전체 게시글 목록 조회용 DAO
	 * @param conn
	 * @return list
	 * @throws Exception
	 */
	public List<Board> selectAll(Connection conn) throws Exception{
		
		Statement stmt = null;
		ResultSet rset = null;
		
		List<Board> list = null;
		
		String query = prop.getProperty("selectAll");
		
		try {
			
			// SQL 수행 후 결과 반환
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			list = new ArrayList<Board>();
			Board board = null; // 행 데이터 참조용 임시 변수
			
			while(rset.next()) {
				
				int boardNo = rset.getInt("BOARD_NO");
				String title = rset.getString("TITLE");
				Date createDate = rset.getDate("CREATE_DATE");
				String writer = rset.getString("WRITER");
				
				board = new Board(boardNo, title, createDate, writer);
			
				list.add(board);
			
			}
			
		}finally{
			close(rset);
			close(stmt);
		}
		
		return list;
	}

	/**
	 * 게시글 상세 조회용 DAO
	 * @param no
	 * @param conn
	 * @return board
	 * @throws Exception
	 */
	public Board selectOne(int no, Connection conn) throws Exception{
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		Board board = null;
		
		String query = prop.getProperty("selectOne");
		
		try {
			
			// SQL 수행 및 결과 반환
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, no);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				
				int boardNo = rset.getInt("BOARD_NO");
				String content = rset.getString("CONTENT");
				String title = rset.getString("TITLE");
				Date createDate = rset.getDate("CREATE_DATE");
				String writer = rset.getString("WRITER");
			
				board = new Board(boardNo, title, content, createDate, writer);
				
			}
			
		}finally {
			
			close(rset);
			close(pstmt);
		}
		
		return board;
	}

	/**
	 * 게시글 유무 확인용 DAO
	 * @param no
	 * @param conn
	 * @return check
	 * @throws Exception
	 */
	public int checkBoard(int no, Connection conn) throws Exception{
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int check = 0;
		
		String query = prop.getProperty("checkBoard");
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, no);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				check = rset.getInt(1);
			}
			
		}finally {
			
			close(rset);
			close(pstmt);
		}
		
		return check;
	}

	
	/**
	 * 작성자 조회용 DAO
	 * @param no
	 * @param conn
	 * @return writer
	 * @throws Exception
	 */
	public String selectWriter(int no, Connection conn) throws Exception{
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String writer = null;
		
		String query = prop.getProperty("selectWriter");
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, no);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				writer = rset.getString("WRITER");
			}
			
		}finally {
			
			close(rset);
			close(pstmt);
		}
		
		return writer;
	}


	/**
	 * 게시글 삭제용 DAO
	 * @param no
	 * @param conn
	 * @return result
	 * @throws Exception
	 */
	public int deleteBoard(int no, Connection conn) throws Exception{
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("deleteBoard");
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, no);
			
			result = pstmt.executeUpdate();
			
		}finally {
			close(pstmt);
		}
		
		return result;
	}

	/**
	 * 게시글 수정용 DAO
	 * @param no
	 * @param selStr
	 * @param upStr
	 * @param conn
	 * @return result
	 * @throws Exception
	 */
	public int updateBoard(int no, String selStr, String upStr, Connection conn)
								throws Exception {
		
		PreparedStatement pstmt = null;
		int result = 0;
			
			String query = prop.getProperty("update" + selStr);
			
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, upStr);
				pstmt.setInt(2, no);
				
				result = pstmt.executeUpdate();
				
			}finally {
				close(pstmt);
			}

		

		return result;
	}

}
