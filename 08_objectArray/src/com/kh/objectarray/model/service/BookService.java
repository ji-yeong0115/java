package com.kh.objectarray.model.service;
import java.util.Scanner;
import com.kh.objectarray.model.vo.Book;

public class BookService {
	// Book 객체 5개를 매개변수 있는 생성자를 이용하여 생성 후 책 제목을 입력 받아 
	// 해당 책이 있는지 검색하여 있으면 Book 객체의 필드정보 출력
	// 없으면 "해당하는 책이 없스니다."출력

	// 필드에 스캐너 객체를 선언하여 클래스 내부에서 모두 사용 가능
	private Scanner sc = new Scanner(System.in);
	
	public void serchBookV1() {
		
		// 첵 5권 객체 생성
		Book book1 = new Book("자바의 정석", 30000, 0.2, "남궁성");
		Book book2 = new Book("c언어의 정석", 50000, 0.1, "김철수");
		Book book3 = new Book("와 자바 재밌다", 100000, 0.05, "백동현");
		Book book4 = new Book("어린왕자", 10000, 10, "생택쥐베리");
		Book book5 = new Book("해리포터", 12000, 0.3, "조앤K롤링");
		
		// 검색할 책 제목 입력 받기
		System.out.print("검색할 책 제목을 입력하세요 : ");
		String title = sc.nextLine();
		
		if(book1.getTitle().equals(title)) {
			// book1의 제목과 입력받은 제목이 같을 경우
			System.out.println(book1.selectBook());
			
		}else if(book2.getTitle().equals(title)) {
			System.out.println(book2.selectBook());
			
		}else if(book3.getTitle().equals(title)) {
			System.out.println(book3.selectBook());
		}
		else if(book4.getTitle().equals(title)) {
			System.out.println(book4.selectBook());
		}
		else if(book5.getTitle().equals(title)) {
			System.out.println(book5.selectBook());
		}else{	
			System.out.println("해당하는 책이 없습니다.");
		}
	}
	
	// 객체 배열을 이용하여 책 검색하기
	public void serchBookV2() {
		
		Book[] books = new Book[5];
		
		books[0] = new Book("자바의 정석", 30000, 0.2, "남궁성");
		books[1] = new Book("c언어의 정석", 50000, 0.1, "김철수");
		books[2] = new Book("와 자바 재밌다", 100000, 0.05, "백동현");
		books[3] = new Book("어린왕자", 10000, 10, "생택쥐베리");
		books[4] = new Book("해리포터", 12000, 0.3, "조앤K롤링");
		
		/* 선언, 할당, 초기화를 동시
		 * 
		 * Book[] books = {
		 * 		new Book("자바의 정석", 30000, 0.2, "남궁성"),
		 * 		new Book("c언어의 정석", 50000, 0.1, "김철수"),
		 * 		new Book("와 자바 재밌다", 100000, 0.05, "백동현"),
		 *  	new Book("어린왕자", 10000, 10, "생택쥐베리"),
		 *  	new Book("해리포터", 12000, 0.3, "조앤K롤링")
		 * };
		 * 
		 */
		
		// 책 제목 입력 받기
		System.out.print("검색할 책 제목을 입력하세요 : ");
		String title = sc.nextLine();
		
		boolean flag = true;
		
		for(int i=0; i<books.length; i++) {
			if(books[i].getTitle().equals(title)) {
				// book의 i번째 인덱스 요소의 Title이 입력받은 값과 같다면
				System.out.println(books[i].selectBook());
				flag = false; // 검색이 된 경우
				break;
			}
		}
		if(flag) {
			System.out.println("해당되는 책이 없습니다.");
		}
	}
}
