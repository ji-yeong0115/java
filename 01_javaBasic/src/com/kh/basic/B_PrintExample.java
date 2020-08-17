package com.kh.basic;

public class B_PrintExample {
	public void printValue() {
		// 여러가지 형태의 값을 출력하는  메소드(기능)
		
		// 문자열 출력(" ")
		System.out.println("문자열 출력");
		System.out.print("오늘도 화이팅"); // 다음 줄을 이어서 출력
		System.out.println(); // 줄 바꿈 역할(enter)
		System.out.println("쉬는시간");
		
		// 숫자 출력 : 문자열처럼 " " 사용하지 않아도 된다.
		System.out.println("-----숫자 출력-----");
		System.out.println(123); // 정수
		System.out.println(1.23); // 실수
		
		// 숫자는 직접적으로 연산 가능
		System.out.println(2+3);
		System.out.println(3.14-0.14); // 실수 연산의 결과값은 똑같이 실수
		
		// 자바는 문자열 끼리도 더하기가 가능
		System.out.println("-----문자열 더하기-----");
		System.out.println("아..." + "배고파");
		
		// 숫자 + 문자열 
		// 문자열은 더해지는 대상이 문자열이 아닌 경우 다 문자로 바꿔버림
		System.out.println("-----숫자 + 문자열-----");
		System.out.println(5 + 10 + "Hello"); // 15 + Hello -> "15" + "Hello" == "15Hello"
		
		// 문자열 + 숫자
		System.out.println("-----문자열 + 숫자-----");
		System.out.println("Hello" + 5 + 10);
		// "Hello" + 5 + 10 -> "Hello" + "5" + 10 == "Hello5" + 10
		// "Hello5" + 10 -> "Hello5" + "10" == "Hello510"
		
	}

}
