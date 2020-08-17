package com.kh.book.view;

import java.util.List;
import java.util.Scanner;

import com.kh.book.model.vo.ApplyBook;
import com.kh.book.model.vo.Book;
import com.kh.member.model.vo.Member;

public class BookSubView {
	
	private Scanner sc = new Scanner(System.in);
	private BookMainView bMain = new BookMainView();
	
	/** 도서 이름 입력 View
	 * @return bName
	 */

	public String inputBName() {
		
		System.out.print("도서 이름 입력 : ");
		String name = sc.nextLine();
		
		return name;
	}
	
	/**
	 * 삽입할 도서 정보 입력 View
	 * @return
	 */
	public Book insertBook() {
		
		System.out.print("도서 코드 : ");
		String bCode = sc.nextLine();
		
		System.out.print("도서 이름 : ");
		String bName = sc.nextLine();
		
		System.out.print("저자 이름 : ");
		String writer = sc.nextLine();
		
		System.out.print("대출 여부 : ");
		char loan = sc.nextLine().charAt(0);
		
		return new Book(bCode, bName, writer, loan);
	}
	
	/** 
	 * 도서 전체 목록 출력 View
	 * @param list
	 */
	public void selectAll(List<Book> list) {
		
		System.out.printf("%-14s %-40s %-20s %-10s\n",
				"도서 코드", "도서 이름", "도서 저자", "대출여부");
		
		System.out.println("------------------------------------"
				+ "--------------------------------");
		
		for(Book b : list) {
			
			System.out.printf("%-10s %-40s %-15s %-15c\n",
				b.getbCode(), b.getbName(), b.getWriter(), b.getLoan());
		}
		
	}

	/** 요청 도서 목록 출력 View
	 * @param list
	 */
	public void selectApply(List<ApplyBook> list) {
		
		System.out.printf("%-24s %s\n", "BNAME", "WIRTER");
		
		System.out.println("-------------------------"
				+ "--------------------------------");
		
		for(ApplyBook b : list) {
			
			System.out.printf("%-30s %s\n",
					b.getApplyBName(), b.getApplyWriter());
		}
		
	}	

	/** 도서 수정할 내용 선택 View
	 * @return sel
	 */
	public int updateBook() {
		
		int sel = 0;
		
		while(true) {
			
			System.out.println("1. 도서 코드 수정");
			System.out.println("2. 도서 이름 수정");
			System.out.println("3. 도서 저자 수정");
			System.out.println("4. 대출 여부 수정");
			System.out.println("0. 메뉴로 이동");
			
			System.out.print("메뉴 선택 : ");
			
			sel = sc.nextInt();
			sc.nextLine();
			
			switch(sel) {
			case 1: case 2: case 3: return sel;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
		}
	}
	

	/** 삭제 여부 입력용 View
	 * @return del
	 */
	public char deleteBook() {
		
		System.out.print("정말로 삭제 하시겠습니까?(Y/N) : ");
		
		return sc.nextLine().toUpperCase().charAt(0);
	}

	/** 수정할 코드 입력받는 View
	 * @return upStr
	 */
	public String updateCode() {
		
		System.out.print("코드 입력 : ");
		
		return sc.nextLine();
	}

	/** 수정할 제목 입력받는 View
	 * @return upStr
	 */
	public String updateName() {
		
		System.out.print("제목 입력 : ");
		return sc.nextLine();
	}

	/** 수정할 저자 입력 받는 View
	 * @return upStr
	 */
	public String updateWriter() {
		
		System.out.print("저자 입력 :");
		return sc.nextLine();
	}

	/** 요정 도서 입력받는 View
	 * @return
	 */
	public Book applyBook() {
		
		System.out.print("도서 이름 : ");
		String bName = sc.nextLine();
		
		System.out.print("저자 이름 : ");
		String writer = sc.nextLine();
		
		return new Book(bName, writer);
	}



}
