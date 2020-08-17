package com.kh.board.model.service;

import static com.kh.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import com.kh.board.model.dao.ReplyDAO;
import com.kh.board.model.vo.Reply;

public class ReplyService {

	/**
	 * 댓글 삽입 용 Service
	 * @param reply
	 * @return result
	 * @throws Exception
	 */
	public int insertReply(Reply reply) throws Exception{
		
		Connection conn = getConnection();
		
		int result = new ReplyDAO().insertReply(reply, conn);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		return result;
	}

	/**
	 * 댓글 조회용 Service
	 * @param no
	 * @return rList
	 * @throws Exception
	 */
	public List<Reply> selectReply(int no) throws Exception{
		
		Connection conn = getConnection();
		
		List<Reply> rList = new ReplyDAO().selectReply(no, conn);
		
		close(conn);
		
		return rList;
	}

	/** 
	 * 댓글 상세 조회용 Service
	 * @param rNo
	 * @return reply
	 * @throws Exception
	 */
	public Reply selectReplyOne(int rNo) throws Exception{
		
		Connection conn = getConnection();
		
		Reply reply = new ReplyDAO().selectReplyOne(rNo, conn);
		
		close(conn);
		
		return reply;
	}

	/**
	 * 댓글 수정용 Service
	 * @param rNo
	 * @param upStr
	 * @return result
	 * @throws Exception
	 */
	public int updateReply(int rNo, String upStr) throws Exception{
		
		Connection conn = getConnection();
		
		int result = new ReplyDAO().updateReply(rNo, upStr, conn);
		
		return result;
	}

	/**
	 * 작성자 조회 Service
	 * @param rNo
	 * @return writer
	 * @throws Exception
	 */
	public String selectWriter(int rNo) throws Exception{
		
		Connection conn = getConnection();
		
		String writer = new ReplyDAO().selectWriter(rNo, conn);
		
		close(conn);
		
		return writer;
	}

	/**
	 * 댓글 유무 확인용 Service
	 * @param rNo
	 * @return check
	 * @throws Exception
	 */
	public int checkReply(int rNo) throws Exception{
		
		Connection conn = getConnection();
		int check = new ReplyDAO().checkReply(rNo, conn);
		
		close(conn);
		
		return check;
	}
	
	
	/**
	 * 댓글 삭제용 Service
	 * @param rNo
	 * @return result
	 * @throws Exception
	 */
	public int deleteReply(int rNo) throws Exception{
		
		Connection conn = getConnection();
		
		int result = new ReplyDAO().deleteReply(rNo, conn);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		return result;
	}

}
