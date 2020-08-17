package com.kh.object.practice.model.service;
import com.kh.object.practice.model.vo.Book;

public class BookService {
	
	public void practice() {
		
		// 1) 기본 생성자를 이용하여 첫 번째 Book 객체 생성
		Book book1 = new Book();
		
		// 2) 매개변수 생성자를 이용하여 두 번째 Book 객체 생성
		Book book2 = new Book("자바의 정석", 30000, 0.2, "남궁성");
		
		// 3) 객체가 가진 필드 값 출력 확인
		System.out.println(book1.selctBook());
		System.out.println(book2.selctBook());
		
		// 4) 첫 번째 객체가 가진 값을 setter를 이용하여 수정
		book1.setTitle("C언어");
		book1.setPrice(30000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("홍길동");
		
		System.out.println("============================");

		// 5) 수정된 내용 출력 확인
		System.out.println("수정된 결과 확인");
		
		System.out.println(book1.selctBook());
		
		System.out.println("============================");
		
		// 6) 각 객체의 할인율을 적용한 책 가격을 계산해서 출력
		// 할인된 가격 = 가격 - (가격 * 할인율)
		int sum1 = (int)(book1.getPrice() - (book1.getPrice() * book1.getDiscountRate()));
		int sum2 = (int)(book2.getPrice() - (book2.getPrice() * book2.getDiscountRate()));
		
		System.out.println("도서명  = " + book1.getTitle());
		System.out.println("할인된 가격 = " + sum1 + "원");
		System.out.println("도서명  = " + book2.getTitle());
		System.out.println("할인된 가격 = " + sum2 + "원");
	}
}
