package com.kh.control.chap02.service;
import java.util.Scanner;

public class A_For {
	/*
	 * for문 
	 * 
	 * [표현식]
	 * for(초기식 ; 조건식 ; 증감식){
	 * 		반복 수행할 코드;
	 * }
	 * 
	 * 초기식 : for문 내에서 반복제어를 위해 사용할 변수를 선언
	 * 조건식 : 반복문이 반복을 수행하기 위한 조건을 작성하는 부분
	 *  - 조건식이 true이면 반복
	 *  - 조건식이 false이면 반복 종료
	 *  - 조건식은 매 반복 시작 시 마다 검사를 진행
	 * 증감심 : 초기식을 증가 또는 감소 시켜 변화를 주는 식
	 *  - 매 반복 종료 시 초기식을 증가 또는 감소 시킴
	 * 
	 */
	
	public void example1() {
		// 1부터 5까지 출력하기
		
		// 초기식 ; 조건식 ; 증감식
		for(int i = 1 ; i <= 10 ; i+=2) {
			System.out.println(i);
		}
	}

	public void example2() {
		// 5 ~ 1
		
		for(int i = 5 ; i >= 1 ; i--) {
			System.out.println(i);
		}	
	}
	
	public void example3() {
		// 1부터 50까지의 홀수 모두 출력
		
		for(int i=1; i<=50 ; i+=2) {
			System.out.println(i); // syso ctrl + space
			
		}
	}

	public void example4() {
		// 구구단 7단 출력
		
		int dan = 7;
		
		for(int i=1; i<10; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}
	}

	public void example5() {
		// 정수를 하나 입력 받아 해닫 수가 2 ~ 9 사이 수인지 검사하여 
		// 맞을 경우 해당 단의 구구단 출력하기 아닐 경우 "2~9 사이의 수를 입력하세요." 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int dan = sc.nextInt();
		sc.nextLine();
		
		if(dan >= 2 && dan <= 9) {
			for(int i=1; i<10; i++) {
				System.out.printf("%d X %d = %d \n", dan, i , (dan * i));
			}
			
		}else {
			System.out.println("2~9 사이의 수를 입력하세요.");
		}
		
	}

	public void example6() {
		// 1에서 100까지의 합
		
		int sum = 0; // 1~100까지의 숫자의 합을 저장할 변수 sum 선언, 선언과 동시에 초기화
		
		for(int i=1; i<101; i++) {
			sum +=i;
		}
		System.out.println(sum);
	
	}

	public void example7() {
		// 1부터 입력받은 정수까지의 합
		// 단, 입력하는 수는 1을 초과한 수 이여야 한다.
		// 1 이하 수 입력 시 "잘못 입력하셨습니다." 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int inputNum = sc.nextInt();
		sc.nextLine();
		
		int sum=0;
		
		if(inputNum > 1) {
			for(int i=1; i <= inputNum; i++) {
				sum += i;
			}
			System.out.println("합계 : " + sum);
			
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}

	public void example8() {
		//중첩 for문(이중 for문)
		// 1부터 5까지 출력되는 문장을 5줄 출력하기
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println(); // 줄 바꿈
		}
		
	}

	public void example9() {
		// 0분 0초 ~ 9분 59초
		
		for(int min=0; min<10; min++) { // 분
			for(int sec=0; sec<60; sec++){ // 초
				System.out.printf("%2d분 %2d초\n", min, sec);
			}
		}
	}

	public void example10() {
		//구구단 모두 출력하기
		
		// 2~9단 반복하는 for 문
		for(int dan=1; dan<=9; dan++) {
			
			// 해당 단에 곱해지는 수(1~9)를 반복하는 for문
			for(int su=1; su<=9; su++) {
				System.out.printf("%2d X%2d = %2d  ", dan, su, dan * su);
			}
			System.out.println();
		}
	}

	public void example11() {
		// 별 찍기(*)
		// *****
		// *****
		// *****
		// *****
		// *****
		
		 // 0 1 2 3 4 5 -> 5회 반복
		for(int i=0; i<5; i++) { // 행
			for (int j=0; j<5; j++) { //열
				System.out.print("*");
			}
			System.out.println(); // 줄 바꿈 
		}
	}

	public void example12() {
		// *
		// **
		// ***
		// ****
		
		for(int i=0; i<4; i++) { //행
			for(int j=0; j<=i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}
}
