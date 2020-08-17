package com.kh.board.model.service;

import static com.kh.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import com.kh.board.model.dao.BoardDAO;
import com.kh.board.model.vo.Board;
import com.kh.member.model.vo.Member;

public class BoardService {


	/**
	 * 회원 로그인용 Service
	 * @param inputLogin
	 * @return loginMember
	 * @throws Exception
	 */
	public Member login(Member inputLogin) throws Exception{
		
		// 커넥션 생성 --> import static으로 탬플릿 부터 추가
		Connection conn = getConnection();
		
		// DAO 알맞은 메소드 호풀 후 결과를 반환받기
		Member loginMember = new BoardDAO().login(inputLogin, conn);
		
		// DML이 아니므로 트랜잭션 처리 없이 커넥션 닫고, 조회결과 반환
		close(conn);
		
		return loginMember;
	}


	/**
	 * 게시글 삽입용 Service
	 * @param board
	 * @return result
	 * @throws Exception
	 */
	public int insertBoard(Board board) throws Exception{
		
		// 커넥션 생성
		Connection conn = getConnection();
		
		// 커넥션, 전달받은 board dao를 전달하여
		// DB 삽입 진행 후 결과를 반환 받아 저장
		int result = new BoardDAO().insertBoard(board, conn);
		
		// 트랜잭션 처리
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		// 커넥션 닫기
		close(conn);
		
		// 삽입 결과 반환
		return result;
	}


	/**
	 * 전체 게시글 목록 조회용 Service
	 * @return list
	 * @throws Exception
	 */
	public List<Board> selectAll() throws Exception {
		
		// 커넥션 생성
		Connection conn = getConnection();
		
		// 전체 조회 결과를 반환받아 저장
		List<Board> list = new BoardDAO().selectAll(conn);
		
		// 커넥션 반환
		close(conn);
		
		return list;
	}


	/**
	 * 게시글 상세 조회용 Service
	 * @param no
	 * @return board
	 * @throws Exception
	 */
	public Board selectOne(int no) throws Exception {
		
		Connection conn = getConnection();
		
		Board board = new BoardDAO().selectOne(no, conn);
		
		close(conn);
		return board;
	}


	/**
	 * 게시글 유무 확인용 Service
	 * @param no
	 * @return check
	 * @throws Exception
	 */
	public int checkBoard(int no) throws Exception {
		
		Connection conn = getConnection();
		int check = new BoardDAO().checkBoard(no, conn);
		
		close(conn);
		
		return check;
	}

	/** 
	 * 작성자 조회 Service
	 * @param no
	 * @return writer
	 * @throws Exception
	 */
	public String selectWriter(int no) throws Exception{
		
		Connection conn = getConnection();
		
		String writer = new BoardDAO().selectWriter(no, conn);
		
		close(conn);
		
		return writer;
	}


	/**
	 * 게시글 삭제용 Service
	 * @param no
	 * @return result
	 * @throws Exception
	 */
	public int deleteBoard(int no) throws Exception{
		
		Connection conn = getConnection();
		
		int result = new BoardDAO().deleteBoard(no, conn);
		
		if(result > 0) {
			commit(conn);
		}
		else{
			rollback(conn);	
		}
		
		close(conn);
		
		return result;
	}


	/**
	 * 게시글 수정용 Service
	 * @param no
	 * @param sel
	 * @param upStr
	 * @return result
	 * @throws Exception
	 */
	public int updateBoard(int no, int sel, String upStr) throws Exception{

		Connection conn = getConnection();
		
		String selStr = (sel == 1) ? "Title" : "Content";
		
		int result = new BoardDAO().updateBoard(no, selStr, upStr, conn);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		
		return result;
	}


	

}
