package com.kh.book.controller;

import java.util.List;

import com.kh.book.model.service.BookService;
import com.kh.book.model.vo.ApplyBook;
import com.kh.book.model.vo.Book;
import com.kh.book.view.BookMainView;
import com.kh.book.view.BookSubView;
import com.kh.member.view.MemSubView;

public class BookController {
	
	private BookMainView bMain = new BookMainView();
	private BookService bService = new BookService();
	private BookSubView bSub = new BookSubView();
	private MemSubView mSub = new MemSubView();
	
	/**
	 * 도서 DB 삽입
	 */
	public void insertBook() {
		
		bMain.insertBook();
		
		Book book = bSub.insertBook();
		
		try {
			int result = bService.insertBook(book);
			
			if(result > 0) {
				mSub.displaySuccess("도서 추가 성공");
			}else {
				mSub.displayFail("도서 추가 실패");
			}
					
		}catch(Exception e) {
			e.printStackTrace();
			mSub.displayError("도서 추가 과정에서 오류 발생");
		}
	}
	
	/**
	 * 전체 도서 목록 조회
	 */
	public void selectBook() {
		
		bMain.selectBook();
		
		try {
			
			List<Book> list = bService.selectBook();
			
			if(!list.isEmpty()) {
				bSub.selectAll(list);
			}else {
				mSub.displayFail("조회 결과 없음");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			mSub.displayError("도서 목록 조회 과정에서 오류 발생");
		}
		
	}
	
	/**
	 * 요정 도서 목록 조회
	 */
	public void selectApply() {
		
		bMain.selectApply();
		
		try {
			
			List<ApplyBook> list = bService.selectApply();
			
			if(!list.isEmpty()) {
				bSub.selectApply(list);
			}else {
				mSub.displayFail("조회 결과가 없습니다.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			mSub.displayError("요청 도서 목록 조회 과정에서 오류 발생");
		}
	}	

	/**
	 * 도서 수정
	 */
	public void updateBook() {
		
		bMain.updateBook();
		
		String name = bSub.inputBName();
		
		try {
			
			int check = bService.checkBook(name);
			
			if(check > 0) {
				
				int sel = bSub.updateBook();
				
				String upStr = null;
				
				switch(sel) {
				case 1:
					upStr = bSub.updateCode(); break;
				case 2:
					upStr = bSub.updateName(); break;
				case 3:
					upStr = bSub.updateWriter(); break;
				case 0: return;
				}
				
				int result = bService.updateBook(name, sel, upStr);
				
				if(result > 0) {
					mSub.displaySuccess("도서 정보 수정 성공");
				}else {
					mSub.displayFail("도서 정보 수정 실패");
				}
			}else {
				mSub.displayFail("해당 도서가 존재하지 않습니다.");
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
			mSub.displayError("도서 정보 수정 과정에서 오류 발생");
		}
		
	}
	
	/**
	 * 도서 삭제
	 */
	public void deleteBook() {
		
		
		String name = bSub.inputBName();
		
		try {
			
			int check = bService.checkBook(name);
			
			if(check > 0) {
				
				char del = bSub.deleteBook();
				
				if(del == 'N') {
					return;
				}else if(del == 'Y') {
					
					int result = bService.deleteBook(name);
					
					if(result > 0) mSub.displaySuccess("도서 삭제 성공");
					else mSub.displayFail("도서 삭제 실패");
				}else {
					mSub.displayFail("Y 또는 N만 입력해주세요.");
				}
			}else {
				mSub.displayFail("해당하는 도서가 존재하지 않음");
			}
		}catch(Exception e) {
			e.printStackTrace();
			mSub.displayError("도서 삭제 과정에서 오류 발생");
		}
		
	}

	/**
	 * 도서 대출 여부 수정
	 */
	public void loanBook() {
		
		bMain.loanBook();
		
		String name = bSub.inputBName();
		
		try {
			
			int check = bService.checkBook(name);
			
			if(check > 0) {
				
				int result = bService.loanBook(name);
				
				if(result > 0) mSub.displaySuccess("도서 대출 성공");
				else mSub.displayFail("도서 대출 실패");
			}else {
				mSub.displayFail("도서 대출 불가능");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			mSub.displayError("도서 대출 과정에서 오류 발생");
		}
		
	}

	/**
	 * 도서 요청
	 */
	public void applyBook() {
		
		bMain.applyBook();
		
		Book book = bSub.applyBook();
		
		try {
			
			int result = bService.applyBook(book);
			
			if(result > 0) mSub.displaySuccess("도서 요청 성공");
			else mSub.displayFail("도서 요청 실패");
			
		}catch(Exception e) {
			e.printStackTrace();
			mSub.displayError("도서 요청 과정에서 오류 발생");
		}
		
		
	}

		
		
}


