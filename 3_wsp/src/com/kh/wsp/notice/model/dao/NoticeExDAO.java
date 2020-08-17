package com.kh.wsp.notice.model.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kh.wsp.notice.model.vo.Notice;
import com.kh.wsp.notice.model.vo.NoticeEx;

public class NoticeExDAO {
	
	private Properties prop;
	
	public NoticeExDAO() throws Exception{
		
		String fileName
			= NoticeExDAO.class.getResource
				("/com/kh/wsp/sql/notice/noticeEx-query.properties").getPath();
		prop = new Properties();
		prop.load(new FileReader(fileName));
	
	}

	/** 공지사항 목록 조회 DAO
	 * @param conn
	 * @return list
	 * @throws Exception
	 */
	public List<NoticeEx> selectList(Connection conn) throws Exception{
		
		Statement stmt = null;
		ResultSet rset = null;
		List<NoticeEx> list = null;
		
		String query = prop.getProperty("selectList");
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			list = new ArrayList<NoticeEx>();
			
			while(rset.next()) {
				list.add(new NoticeEx(rset.getInt("NOTICE_NO"),
						rset.getString("NOTICE_TITLE"),
						rset.getString("MEMBER_ID"),
						rset.getInt("READ_COUNT"),
						rset.getDate("NOTICE_MODIFY_DT")));

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

	/** 공지사항 작성 DAO
	 * @param conn
	 * @param notice
	 * @return result
	 * @throws Exception
	 */
	public int insertNotice(Connection conn, NoticeEx notice) throws Exception{
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("insertNotice");
		
		try {
			pstmt = conn.prepareStatement(query);
			
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

	/** 게시글 조회 DAO
	 * @param conn
	 * @param noticeNo
	 * @return notice
	 * @throws Exception
	 */
	public NoticeEx selectNotice(Connection conn, int noticeNo) throws Exception{
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = prop.getProperty("selectNotice");
		NoticeEx notice = null;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, noticeNo);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				notice = new NoticeEx(
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

	/** 조회수 증가 DAO
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

}
