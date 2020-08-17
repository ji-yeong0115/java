package com.kh.wsp.notice.model.service;

import static com.kh.wsp.common.DBCP.getConnection;

import java.sql.Connection;
import java.util.List;

import com.kh.wsp.notice.model.dao.NoticeExDAO;
import com.kh.wsp.notice.model.vo.Notice;
import com.kh.wsp.notice.model.vo.NoticeEx;

public class NoticeExService {
	
	private NoticeExDAO dao;
	
	public NoticeExService() throws Exception{
		dao = new NoticeExDAO();
	}

	/** 공지사항 목록 조회 Service
	 * @return list
	 * @throws Exception
	 */
	public List<NoticeEx> selectList() throws Exception{
		
		Connection conn = getConnection();
		
		List<NoticeEx> list = dao.selectList(conn);
		
		conn.close();
		
		return list;
	}

	/** 공지사항 작성 Service
	 * @param notice
	 * @return result
	 * @throws Exception
	 */
	public int insertNotice(NoticeEx notice) throws Exception{
		
		Connection conn = getConnection();
		
		int noticeNo = dao.selectNextNo(conn);
		
		int result = 0;
		
		if(noticeNo>0) {
			notice.setNoticeContent
				(replaceParameter(notice.getNoticeContent()));
			
			notice.setNoticeContent
			(notice.getNoticeContent().
					replaceAll("\r\n", "<br>"));
		
			notice.setNoticeNo(noticeNo);
			result = dao.insertNotice(conn, notice);
			
			if(result>0) {
				conn.commit();
			}else {
				conn.rollback();
			}
		}
		
		
		return result;
	}
	
	private String replaceParameter(String param) {
		String result = param;
		if(param != null) {
			result = result.replaceAll("&", "&amp;");
			result = result.replaceAll("<", "&lt;");
			result = result.replaceAll(">", "&gt;");
			result = result.replaceAll("\"", "&quot;");
		}
		
		return result;
	}

	public NoticeEx selectNotice(int noticeNo) throws Exception{
Connection conn = getConnection();
		
		NoticeEx notice = dao.selectNotice(conn, noticeNo);
		
		
		if(notice != null) {
			int result = dao.increaseCount(conn, noticeNo);
			
			if(result>0) {
				conn.commit();
				
				notice.setReadCount(notice.getReadCount()+1);
				
			}else {
				conn.rollback();
			}
		}
		
		
		conn.close();
		return notice;
	}

}
