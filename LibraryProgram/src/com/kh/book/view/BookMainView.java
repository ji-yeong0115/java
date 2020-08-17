package com.kh.book.view;

import java.util.Scanner;

import com.kh.member.contorller.MemberController;
import com.kh.member.view.MemMainView;

public class BookMainView {
	
	
	private Scanner sc = new Scanner(System.in);
	

	public void insertBook() {
		System.out.print("\n --- [새로 삽입할 도서 정보 입력] --- \n\n");
	}
	
	public void selectBook() {
		
		System.out.print("\n --- [전체 도서 조회 결과] --- \n\n");
	}
	
	public void updateBook() {
		
		System.out.print("\n --- [수정한 도서 정보 입력] ---\n\n");
	}
	
	public void deleteBook() {
		
		System.out.print("\n --- [삭제할 도서 이름 입력] --- \n\n");
	}
	
	public void loanBook() {
		
		System.out.print("\n --- [대출할 도서 이름 입력] --- \n\n");
	}
	
	public void applyBook() {
		
		System.out.print("\n --- [신청한 도서 정보 입력] --- \n\n");
	}
	
	public void selectApply() {
		
		System.out.print("\n --- [요청된 도서 목록 조회 결과] --- \n\n");
	}

}
