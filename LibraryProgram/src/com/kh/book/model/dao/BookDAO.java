package com.kh.book.model.dao;

import static com.kh.common.JDBCTemplate.*;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

import com.kh.book.model.vo.ApplyBook;
import com.kh.book.model.vo.Book;

public class BookDAO {
	
	private Properties prop = null;
	
	public BookDAO() {
		try {
			
			prop = new Properties();
			prop.load(new FileReader("book.properties"));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * 도서 삽입 DAO
	 * @param book
	 * @param conn
	 * @return result 
	 * @throws Exception
	 */
	public int insertBook(Book book, Connection conn) throws Exception{
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertBook");
		
		try {
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, book.getbCode());
			pstmt.setString(2, book.getbName());
			pstmt.setString(3, book.getWriter());
			pstmt.setString(4, book.getLoan() + "");
			
			result = pstmt.executeUpdate();
			
		}finally {
			close(pstmt);
		}
		
		return result;
	}
	
	/** 전체 도서 목록 조회 DAO
	 * @param conn
	 * @return list
	 * @throws Exception
	 */
	public List<Book> selectAll(Connection conn) throws Exception{
		
		Statement stmt = null;
		ResultSet rset = null;
		
		List<Book> list = null;
		
		String query = prop.getProperty("selectAll");
		
		try {
			
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			list = new ArrayList<Book>();
			Book book = null;
			
			while(rset.next()) {
				
				String bCode = rset.getString("BOOK_CODE");
				String bName = rset.getString("BNAME");
				String writer = rset.getString("WRITER");
				char loan = rset.getString("LOAN_YN").charAt(0);
				
				book = new Book(bCode, bName, writer, loan);
				
				list.add(book);
			}
			
		}finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}
	
	/** 요청 도서 목록 조회 DAO
	 * @param conn
	 * @return list
	 * @throws Exception
	 */
	public List<ApplyBook> selectApply(Connection conn) 
							throws Exception {
		
		Statement stmt = null;
		ResultSet rset = null;
		
		List<ApplyBook> list = null;
		
		String query = prop.getProperty("selectApply");
		
		try {
			
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			list = new ArrayList<ApplyBook>();
			ApplyBook applyBook = null;
			
			while(rset.next()) {
				
				String applyBName = rset.getString("BNAME");
				String applyWriter = rset.getString("WRITER");
				
				applyBook = new ApplyBook(applyBName, applyWriter);
				
				list.add(applyBook);
			}
			
		}finally{
			close(rset);
			close(stmt);
		}
		
		return list;
	}
	
	/** 도서 정보 수정 DAO
	 * @param name
	 * @param selStr
	 * @param upStr
	 * @param conn
	 * @return result
	 * @throws Exception
	 */
	public int updateBook(String name, String selStr, String upStr, Connection conn)
					throws Exception {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("update" + selStr);
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, upStr);
			pstmt.setString(2, name);
			
			result = pstmt.executeUpdate();
			
		}finally{
			close(pstmt);
		}
					
		return result;
	}
	
	/** 도서 유무 확인 DAO
	 * @param name
	 * @param conn
	 * @return check
	 * @throws Exception
	 */
	public int checkBook(String name, Connection conn) throws Exception {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int check = 0;
		
		
		String query = prop.getProperty("checkBook");
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
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

	/** 게시글 삭제 DAO
	 * @param name
	 * @param conn
	 * @return result
	 * @throws Exception
	 */
	public int deleteBook(String name, Connection conn) throws Exception{
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("deleteBook");
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			
			result = pstmt.executeUpdate();
			
		}finally{
			close(pstmt);
		}
		
		return result;
	}

	/** 도서 대출 DAO
	 * @param name
	 * @param conn
	 * @return result
	 * @throws Exception
	 */
	public int loanBook(String name, Connection conn)
				throws Exception {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("loanBook");
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			
			result = pstmt.executeUpdate();
			
		}finally {
			close(pstmt);
		}
				
		return result;
	}


	/** 도서 요청 DAO
	 * @param book
	 * @param conn
	 * @return result 
	 * @throws Exception
	 */
	public int applyBook(Book book, Connection conn) 
						throws Exception {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("applyBook");
		
		try {
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, book.getbName());
			pstmt.setString(2, book.getWriter());
			
			result = pstmt.executeUpdate();
			
		}finally {
			close(pstmt);
		}

		return result;
	}


}
