package com.kh.book.model.service;

import static com.kh.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import com.kh.book.model.dao.BookDAO;
import com.kh.book.model.vo.ApplyBook;
import com.kh.book.model.vo.Book;

public class BookService {
	

	/** 도서 삽입 Service
	 * @param book
	 * @return result
	 * @throws Exception
	 */
	public int insertBook(Book book) throws Exception{
		
		Connection conn = getConnection();
		
		int result = new BookDAO().insertBook(book, conn);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		return result;
	}
	
	/** 전체 도서 목록 조회 Service
	 * @return list
	 * @throws Exception
	 */
	public List<Book> selectBook() throws Exception{
		
		Connection conn = getConnection();
		
		List<Book> list = new BookDAO().selectAll(conn);
		
		close(conn);
		
		return list;
	}
	
	/** 요정 도서 목록 조회 Service
	 * @return list
	 * @throws Exception
	 */
	public List<ApplyBook> selectApply() throws Exception{
		
		Connection conn = getConnection();
		
		List<ApplyBook> list = new BookDAO().selectApply(conn);
		
		close(conn);
		
		return list;
	}
	
	/** 도서 유무 확인 Service
	 * @param name
	 * @return check
	 * @throws Exception
	 */
	public int checkBook(String name) throws Exception{
		
		Connection conn = getConnection();
		int check = new BookDAO().checkBook(name, conn);
		
		close(conn);
		
		return check;
	}

	/** 도서 정보 수정 Service
	 * @param name
	 * @param sel
	 * @param upStr
	 * @return result
	 * @throws Exception
	 */
	public int updateBook(String name, int sel, String upStr) 
						throws Exception{
		
		Connection conn = getConnection();
		
		String selStr = (sel == 1) ? "Code" : 
					(sel == 2) ? "Name" : "Writer";
		
		int result = new BookDAO().updateBook
							(name, selStr, upStr, conn);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		return result;
	}
	
	/** 게시글 삭제 Service
	 * @param name
	 * @return result
	 * @throws Exception
	 */
	public int deleteBook(String name) throws Exception{
		
		Connection conn = getConnection();
		
		int result = new BookDAO().deleteBook(name, conn);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		
		return result;
	}


	/** 도서 대출 Service
	 * @param name
	 * @return result
	 * @throws Exception
	 */
	public int loanBook(String name) throws Exception{
		
		Connection conn = getConnection();
		
		int result = new BookDAO().loanBook(name, conn);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		return result;
	}

	/** 도서 요청 Service
	 * @param book
	 * @return result
	 * @throws Exception
	 */
	public int applyBook(Book book) throws Exception {
		
		Connection conn = getConnection();
		
		int result = new BookDAO().applyBook(book, conn);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		return result;
	}





}
