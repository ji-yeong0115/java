package com.kh.wsp.notice.model.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kh.wsp.notice.model.vo.Notice;

import jdk.nashorn.internal.ir.SetSplitState;

public class NoticeDAO {
	
	private Properties prop;
	
	public NoticeDAO() throws Exception{
		
		String fileName 
			= NoticeDAO.class.getResource
				("/com/kh/wsp/sql/notice/notice-query.properties").getPath();
	
		prop = new Properties();
		prop.load(new FileReader(fileName));
		
	}

	/** 공지사항 목록 조회 DAO
	 * @param conn
	 * @return list
	 * @throws Exception
	 */
	public List<Notice> selectList(Connection conn) throws Exception{
		
		Statement stmt = null;
		ResultSet rset = null;
		
		List<Notice> list = null;
		
		String query = prop.getProperty("selectList");
		
		try {
			
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			list = new ArrayList<Notice>();
			
			while(rset.next()) {
				Notice notice = new Notice(rset.getInt("NOTICE_NO"),
						rset.getString("NOTICE_TITLE"),
						rset.getString("MEMBER_ID"),
						rset.getInt("READ_COUNT"),
						rset.getDate("NOTICE_MODIFY_DT"));
				
				notice.setReplyCount(rset.getInt("REPLY_COUNT"));
				
				list.add(notice);

			}

		}finally {
			rset.close();
			stmt.close();
		}
		
		return list;
	}

	public int selectNextNo(Connection conn) throws Exception{
		
		Statement stmt = null;
		ResultSet rset = null;
		int noticeNo = 0;
		
		String query = prop.getProperty("selectNextNo");
		
		try {
			
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) noticeNo = rset.getInt(1);
			
		}finally {
			rset.close();
			stmt.close();
		}
	
		return noticeNo;
	}

	/** 공지사항 글 작성 DAO
	 * @param conn
	 * @param notice
	 * @return result
	 * @throws Exception
	 */
	public int insertNotice(Connection conn, Notice notice) throws Exception{
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertNotice");
		
		try {
			pstmt =conn.prepareStatement(query);
			
			pstmt.setInt(1, notice.getNoticeNo());
			pstmt.setString(2, notice.getNoticeTitle());
			pstmt.setString(3, notice.getNoticeContent());
			pstmt.setString(4, notice.getMemberId());
			
			result = pstmt.executeUpdate();
			
		}finally {
			pstmt.close();
		}
		
		return result;
	}

	/** 공지사항 상세 조회 DAO
	 * @param conn
	 * @param noticeNo
	 * @return notice
	 * @throws Exception
	 */
	public Notice selectNotice(Connection conn, int noticeNo) throws Exception{
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = prop.getProperty("selectNotice");
		Notice notice = null;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, noticeNo);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				notice = new Notice(
						noticeNo, 
						rset.getString("NOTICE_TITLE"), 
						rset.getString("NOTICE_CONTENT"), 
						rset.getString("MEMBER_ID"), 
						rset.getInt("READ_COUNT"), 
						rset.getDate("NOTICE_MODIFY_DT"));
			}
			
		}finally {
			rset.close();
			pstmt.close();
		}
		
		return notice;
	}

	/** 조회 수 증가 DAO
	 * @param conn
	 * @param noticeNo
	 * @return result
	 * @throws Exception
	 */
	public int increaseCount(Connection conn, int noticeNo) throws Exception{
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("increaseCount");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, noticeNo);
			
			result = pstmt.executeUpdate();
			
		}finally{
			pstmt.close();
		}
		
		return result;
	}

	/** 공지사항 수정 DAO
	 * @param conn
	 * @param notice
	 * @return result
	 * @throws Exception
	 */
	public int updateNotice(Connection conn, Notice notice) throws Exception{
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("updateNotice");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, notice.getNoticeTitle());
			pstmt.setString(2, notice.getNoticeContent());
			pstmt.setInt(3, notice.getNoticeNo());
			
			result = pstmt.executeUpdate();
			
		}finally {
			pstmt.close();
		}
		
		return result;
	}

	/** 공지사항 삭제 DAO
	 * @param conn
	 * @param noticeNo
	 * @return result
	 * @throws Exception
	 */
	public int deleteNotice(Connection conn, int noticeNo) throws Exception{
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("deleteNotice");
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, noticeNo);
			
			result = pstmt.executeUpdate();
			
		}finally {
			pstmt.close();
		}
		
		return result;
	}

}
