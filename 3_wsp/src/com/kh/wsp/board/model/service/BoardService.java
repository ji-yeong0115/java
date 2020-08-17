package com.kh.wsp.board.model.service;

import static com.kh.wsp.common.DBCP.getConnection;

import java.io.File;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.kh.wsp.board.model.dao.BoardDAO;
import com.kh.wsp.board.model.vo.Attachment;
import com.kh.wsp.board.model.vo.Board;
import com.kh.wsp.board.model.vo.Page;

public class BoardService {
	
	private BoardDAO dao;
	
	public BoardService() throws Exception{
		dao = new BoardDAO();
	}

	/** 페이징 처리 정보 생성 Service
	 * @param currentPage
	 * @param boardType
	 * @return pInfo
	 * @throws Exception
	 */
	public Page getPageInfo(String currentPage, int boardType) throws Exception{
		
		Connection conn = getConnection();
		
		// currentPage가 null인 겅우 1, 아닌 경우 정수형으로 파싱
		int cp = currentPage == null ? 1 : Integer.parseInt(currentPage);
		
		// DB에서 전체 게시글 수 조회
		int listCount = dao.getListCount(conn, boardType);
		
		return new Page(cp, listCount, boardType);
	}

	/** 게시글 목록 조회 Service
	 * @param pInfo
	 * @return bList
	 * @throws Exception
	 */
	public List<Board> selectList(Page pInfo) throws Exception{
	
		Connection conn = getConnection();
		List<Board> bList = dao.selectList(conn, pInfo);
		
		conn.close();
		
		return bList;
	}

	/** 게시글(글 + 파일) 등록 Service
	 * @param board
	 * @param fList
	 * @return result
	 * @throws Exception
	 */
	public int insertBoard(Board board, List<Attachment> fList) throws Exception{
		
		Connection conn = getConnection();
		
		int result = 0;
	
		// 1. 다음 게시글 번호 얻어오기
		int boardNo = dao.selectNextNo(conn);
		
		if(boardNo > 0) {
			// 2. 게시글의 글 부분(Board)만 insert
			
			// 얻어온 다음 글 번호 세팅
			board.setBoardNo(boardNo);
			
			board.setBoardContent(replaceParameter(board.getBoardContent())); // 크로스 사이트 스크립팅 방지
			board.setBoardContent(board.getBoardContent().replace("\r\n", "<br>")); // 개행문자 처리
			
			// 게시글 DB 삽입
			result = dao.insertBoard(conn, board);
			
			// 3. 게시글의 파일부분 (Attachment)만 Insert
			// 게시글 삽입 성공 + 
			if(result > 0 && !fList.isEmpty()) {
				result = 0; // result 재활용
				
				// fList에 저장된 파일 정보를 하나씩 DB에 삽입
				for(Attachment at : fList) {
					// 게시글 번호를 파일 정보레 세팅
					at.setParentBoardNo(boardNo);
					
					result = dao.insertAttachment(conn, at);
					
					// 반복 삽입 중 한 번이라도 실패하는 경우 break
					if(result == 0) break;
				}
			}
		}
		
		// 4. 트랜잭션 처리 및 파일 삭제
		if(result > 0) {
			// 모두 삽입 성공 시 게시글 번호를 반환하여 
			// 게시글 상세 조회 화면으로 바로 이동하게함
			result = boardNo;
			conn.commit();
			
		}else {
			// 삽입 과정 중 실패한 경우
			// 서버에 미리 저장되어 있는 업로드 파일들을 삭제
			for(Attachment at : fList) {
				String filePath = at.getFilePath();
				String fileName = at.getFileChangeName();
				
				File deleteFile = new File(filePath + fileName);
				deleteFile.delete();
			}
			conn.rollback();
		}
		
		conn.close();

		return result;
	}
	
	
	
	
	// 크로스 사이트 스크립트 방지 메소드
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

	/** 썸네일 목록 조회 Service
	 * @param pInfo
	 * @return fList
	 * @throws Exception
	 */
	public List<Attachment> selectFileList(Page pInfo) throws Exception{
		
		Connection conn = getConnection();
		List<Attachment> fList = dao.selectFileList(conn, pInfo);
		
		return fList;
	}

	/** 게시글 상세조회 Service
	 * @param boardNo
	 * @return board
	 * @throws Exception
	 */
	public Board selectBoard(int boardNo) throws Exception{
		
		Connection conn = getConnection();
		
		Board board = dao.selectBoard(conn, boardNo);
		
		conn.close();
		
		return board;
	}

	/** 게시글 포함된 이미지 조회 Service
	 * @param boardNo
	 * @return fList
	 * @throws Exception
	 */
	public List<Attachment> selectFiles(int boardNo) throws Exception{
		
		Connection conn = getConnection();
		
		List<Attachment> fList = dao.selectFiles(conn, boardNo);
		
		conn.close();
		
		return fList;
	}

	/** 게시글 삭제 Service
	 * @param boardNo
	 * @return result
	 * @throws Exception
	 */
	public int deleteBoard(int boardNo) throws Exception{
		
		Connection conn = getConnection();
		
		int result = dao.deleteBoard(conn, boardNo);
		
		if(result>0) {
			conn.commit();
		}else {
			conn.rollback();
		}
		
		conn.close();
		
		return result;
	}

	/** 게시글 수정 화면 구성 Service
	 * @param boardNo
	 * @return board
	 * @throws Exception
	 */
	public Board updateView(int boardNo) throws Exception{
		
		Connection conn = getConnection();
		Board board = dao.updateView(conn, boardNo);
		
		board.setBoardContent(board.getBoardContent().replace("<br>", "\r\n"));
		
		conn.close();
		
		return board;
	}

	/** 게시글 수정 Service
	 * @param board
	 * @param fList
	 * @return result
	 * @throws Exception
	 */
	public int updateBoard(Board board, List<Attachment> fList) throws Exception{
		
		Connection conn = getConnection();
		int result = 0;
		
		// 크로스 사이트 스크립트 방지 + 개행문자 처리
		board.setBoardContent(replaceParameter(board.getBoardContent())); // 크로스 사이트 스크립팅 방지
		board.setBoardContent(board.getBoardContent().replace("\r\n", "<br>")); // 개행문자 처리
		
		// 게시글 수정 DAO 호출
		result = dao.updateBoard(conn, board);
		
		// 서버에서 삭제되어야 될 파일 정보를 모아두는 List
		List<Attachment> deleteFiles = new ArrayList<Attachment>();
		if(result>0 && !fList.isEmpty()) {
			result = 0; // result 재사용
			
			// 기존 해당 게시글에 포함되었던 파일 정보를 DB로부터 얻어옴
			List<Attachment> oldList = dao.selectFiles(conn, board.getBoardNo());
			
			boolean flag = false;
			
			for(Attachment newFile : fList) {
				// 새로운 파일목록의 요소(newFile)에 순차적으로 접근
				flag = false; // flag 초기화
				
				for(Attachment oldFile : oldList) {
					// 기존 파일목록의 요소(oldList)에 순차적으로 접근
					
					if(newFile.getFileLevel() == oldFile.getFileLevel()) {
						// 새로운 파일의 레벤이 기존 파일 중에 중복되는 레벨이 있을 경우
						flag = true;
						deleteFiles.add(oldFile);
						newFile.setFileNo(oldFile.getFileNo());
					}
					
					newFile.setParentBoardNo(board.getBoardNo());
				}
				
				// flag 상태에 따라 알맞은 dao 호출
				if(flag) { // update 상황
					result = dao.updateAttachment(conn, newFile);
				}else { // insert 상황
					result = dao.insertAttachment(conn, newFile);
				}
				
				if(result == 0) break;
			}
		}
		
		// 트랜잭션 처리 + 삭제 처리
		List<Attachment> tempList = null;
		
		// service의 모든 동작이 성공적으로 진행된 경우
		// deleteFiles에 담긴 기존 파일을 삭제해야되고,
		
		// service 동작 중 오류 또는 실패 발생 시
		// fList에 담긴 새로운 파일을 삭제해야함
		
		if(result > 0) {
			result = board.getBoardNo();
			
			// 수정 완료 후 해당 게시글 상세 보기를 위해 result에 글번호를 저장하여 반환
			conn.commit();
			tempList = deleteFiles;
			
		}else {
			conn.rollback();
			tempList = fList;
		}
		
		// 서버에 저장된 파일 삭제
		for(Attachment at : tempList) {
			String filePath = at.getFilePath();
			String fileName = at.getFileChangeName();
			
			File deleteFile = new File(filePath + fileName);
			deleteFile.delete();
		}
		
		conn.close();
		
		return result;
	}


}
