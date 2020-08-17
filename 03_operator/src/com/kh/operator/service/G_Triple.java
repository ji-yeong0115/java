package com.kh.operator.service;
import java.util.Scanner;

public class G_Triple {
	// 삼항 연산자 : 조건식 ? 식1 : 식2; -> 조건식이 true인 경우 식1 수행, false인 경우 식2 수행
	// 조건식의 결과는 반드시 true 또는 false -> 비교/논리 연산의 결과가 대부분
	
	public void example1() {
		// 정수(정수 == 양의 정수, 음의 정수 0)를 입력 받아 양수인지 아닌지 검사하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		String result = (input > 0) ? "양수이다." : "양수가 아니다.";
		
		System.out.println(input + "은/는 " + result);
		
	}
	
	public void example2() {
		// 정수를 입력 받앙 양수, 0, 음수 검사하기
		// 삼항 연산자 중첩 사용
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		String result = (input > 0) ? "양수이다." : ((input < 0) ? "음수이다." : "0이다.");
		
		System.out.println(input + "은/는 " + result);
		
	}
}
