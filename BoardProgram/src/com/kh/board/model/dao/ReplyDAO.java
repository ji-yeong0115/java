package com.kh.board.model.dao;

import static com.kh.common.JDBCTemplate.*;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kh.board.model.vo.Reply;

public class ReplyDAO {
	
	private Properties prop = null;
	
	
	public ReplyDAO() throws Exception{

		prop = new Properties();
		prop.load(new FileReader("reply_query.properties"));
	}
	

	/**
	 * 댓글 삽입용 DAO
	 * @param reply
	 * @param conn
	 * @return result
	 * @throws Exception
	 */
	public int insertReply(Reply reply, Connection conn) throws Exception{
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertReply");
		
		try {
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, reply.getReplyContent());
			pstmt.setInt(2, reply.getBoardNo());
			pstmt.setString(3, reply.getReplyWriter());
			
			result = pstmt.executeUpdate();
			
		}finally {
			close(pstmt);
		}
		
		return result;
	}


	/**
	 * 댓글 조회용 DAO
	 * @param no
	 * @param conn
	 * @return rList
	 * @throws Exception
	 */
	public List<Reply> selectReply(int no, Connection conn) throws Exception{
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		List<Reply> rList = null;
		
		String query = prop.getProperty("selectReply");
		
		try {
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, no);

			rset = pstmt.executeQuery();
			
			rList = new ArrayList<Reply>();
			Reply r = null;
			
			while(rset.next()) {
				r = new Reply(	rset.getInt(1), 
								rset.getString(2), 
								rset.getDate(3), 
								rset.getString(4)	);
				
				rList.add(r);
			}
			
			
		}finally {
			
			close(rset);
			close(pstmt);
			
		}
		
		return rList;
	}




	/**
	 * 댓글 상세 조회용 DAO
	 * @param rNo
	 * @param conn
	 * @return reply
	 * @throws Exception
	 */
	public Reply selectReplyOne(int rNo, Connection conn) throws Exception{
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		Reply reply = null;
		
		String query = prop.getProperty("selectReplyOne");
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, rNo);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				
				int replyNo = rset.getInt("REPLY_NO");
				String replyContent = rset.getString("REPLY_CONTENT");
				Date createDate = rset.getDate("CREATE_DATE");
				String replyWriter = rset.getString("REPLY_WRITER");
				
				reply = new Reply(replyNo, replyContent, createDate, replyWriter);
			}
			
		}finally {
			close(rset);
			close(pstmt);
		}
	
		return reply;
	}


	/**
	 * 댓글 수정용
	 * @param rNo
	 * @param upStr
	 * @param conn
	 * @return
	 * @throws Exception
	 */
	public int updateReply(int rNo, String upStr, Connection conn) 
							throws Exception{
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("updateReply");
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, upStr);
			pstmt.setInt(2, rNo);
			
			result = pstmt.executeUpdate();
			
		}finally {
			close(pstmt);
		}
		
		return result;
	}


	/**
	 * 작성자 조회용 DAO
	 * @param rNo
	 * @param conn
	 * @return writer
	 * @throws Exception
	 */
	public String selectWriter(int rNo, Connection conn) throws Exception{
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String writer = null;
		
		String query = prop.getProperty("selectWriter");
		
		try {
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, rNo);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				writer = rset.getString("REPLY_WRITER");
			}
			
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return writer;
	}

	/** 댓글 유무 확인용 DAO
	 * @param rNo
	 * @param conn
	 * @return check
	 * @throws Exception
	 */
	public int checkReply(int rNo, Connection conn) throws Exception{
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int check = 0;
		
		String query = prop.getProperty("checkReply");
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, rNo);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				check = rset.getInt(1);
			}
			
		}finally{
			close(rset);
			close(pstmt);
		}
		
		return check;
	}

	/**
	 * 댓글 삭제용 DAO
	 * @param rNo
	 * @param conn
	 * @return result
	 * @throws Exception
	 */
	public int deleteReply(int rNo, Connection conn) throws Exception{
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("deleteReply");
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, rNo);
			
			result = pstmt.executeUpdate();
			
		}finally {
			close(pstmt);
		}
		
		return result;
	}





}
