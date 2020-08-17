package com.kh.wsp.reply.model.service;

import com.kh.wsp.reply.model.dao.ReplyDAO;
import com.kh.wsp.reply.model.vo.Reply;

import static com.kh.wsp.common.DBCP.getConnection;

import java.sql.Connection;
import java.util.List;

public class ReplyService {
	
	private ReplyDAO dao;

	public ReplyService() throws Exception{
		dao = new ReplyDAO();
	}

	/** 댓글 목록 조회 Service
	 * @param boardNo
	 * @return rList
	 * @throws Exception
	 */
	public List<Reply> selectList(int boardNo) throws Exception{
		
		Connection conn = getConnection();
		
		List<Reply> rList = dao.selectList(conn, boardNo);
		
		conn.close();
		
		return rList;
	}

	/** 댓글 등록 Service
	 * @param reply
	 * @return result
	 * @throws Exception
	 */
	public int insertReply(Reply reply) throws Exception{
		
		// 크로스 사이트 스크립팅 방지
		reply.setReplyContent(
				replaceParameter(reply.getReplyContent()));

		// 개행문자 처리 \r\n -> <br>
		reply.setReplyContent(
				reply.getReplyContent().replaceAll("\n", "<br>"));
		
		Connection conn = getConnection();
		
		int result = dao.insertReply(conn, reply);
		
		if(result>0) {
			conn.commit();
		}else {
			conn.rollback();
		}
		
		conn.close();
		
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

	/** 댓글 삭제 Service
	 * @param replyNo
	 * @return result
	 * @throws Exception
	 */
	public int deleteReply(int replyNo) throws Exception{
		
		Connection conn = getConnection();
		
		int result = dao.deleteReply(conn, replyNo);
		
		if(result>0) conn.commit();
		else		 conn.rollback();
		
		conn.close();
		
		return result;
	}
}
