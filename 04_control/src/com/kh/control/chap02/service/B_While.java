package com.kh.control.chap02.service;
import java.util.Scanner;

public class B_While {
	// while문 : for문과 달리 반복 횟수가 정해져 있지 않고 특정 조건이 false가 될 때까지 반복하는 용도로 사용
	
	/* 
	 * [표현식]
	 * 
	 * (초기식)
	 *  while(조건식){
	 * 		수행될 문장;
	 * 		(증감식 or 분기문)
	 * }
	 * 
	 *  - 조건식 확인 -> 조건식이 true이면 while 내부 코드 수행
	 *  -> while문 처음으로 돌아가 조건식 확인 (반복)
	 *  -> 조건식이 false가 되면 while문을 빠져 나옴
	 *
	 */
	
	public void example1() {
		// 1부터 5까지 출력 (while)
		
		int i=1; // 초기식
		while(i<=5) { // 조건식
			System.out.println(i);
			i++; // 증감식
		}
	}

	public void example2() {
		// 10부터 1까지 출력 (while)
		
		int i=10;
		while(i>=1) {
			System.out.printf("%2d",i);
			i--;
		}
	}

	public void example3() {
		// 입력되는 모든 수의 합 (0입력시 합계 종료)
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; // 합계를 저장하기 위한 변수 선언 및 0으로 초기화
		
		// 0으로 초기화 하는 이유? 0이 int형의 기본 값
		// 입력되는 값을 저장하기 위한 변수 선언 및 초기화
		int input = 0;
		
		boolean flag = true;
		
		while(flag) {
			
			System.out.print("입력 : ");
			input = sc.nextInt();
			sc.nextLine();
			
			if(input==0) { //입력된 값이 0인 경우
				// while문 정지 : while문의 조건식을 false로 변환 -> flag 변수를 false로 변환
				flag = false;
			}else {
				sum += input;
			}
		}
		System.out.println("합계 : " + sum);
		
	}

	public void example4() {
		// 중첩 while문
		// 입력되는 수 만큼의 가로 세로 길이의 "*"로 채워진 사각형 출력하기
		// while문을 중첩해서 사용하는 것은 권장하지 않는다. 사용해야할 경우 종료 조건을 명확하게 할 것
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("양수 입력 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		int i=0; // 초기식
		
		while(i<input) { // 행 조건식
			
			int j=0; // 초기식2
			while(j<input) { // 열 조건식
				System.out.print("*");
				j++;
			}
			System.out.println(); // 줄 바꿈
			i++; // 증감식
		}
	}

	public void example5() {
		// 키보드로 문자열을 입력받아 그대로 출력하기 반복
		// 단 "exit" 입력 시 종료
		
		Scanner sc = new Scanner(System.in);
		
		// String str2 = ""; // 빈 문자열(공백)
		
		// 참조형 변수의 기본 값 -> 참조하고 있는 값이 없다. ("비어있다"와는 다른 의미)
		String str = null;
		
		do { // 반복문이 최초 한 번은 무조걸 실행할겠다는 의미
			
			System.out.printf("문자열 입력 : ");
			str = sc.nextLine();
			
			System.out.println("str : " + str);
			
		}while(!str.equals("exit")); 
		
	}

	public void example6() {
		//종료에 해당하는 변호가 입력되기 전까지 무한히 반복되는 메뉴 만들기
		
		Scanner sc = new Scanner(System.in);
		int menu = 0; // 입력받는 변호를 저장할 변수 선언 및 초기화
		
		do {
			
			System.out.println("====================");
			System.out.println("1. 1번기능");
			System.out.println("2. 2번기능");
			System.out.println("3. 3번기능");
			System.out.println("0. 프로그램 종료");
			System.out.println("====================");
			
			System.out.print("메뉴 선택 >> ");
			menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			
			case 1: System.out.println("1번 기능 수행"); break;
			case 2: System.out.println("2번 기능 수행"); break;
			case 3: System.out.println("3번 기능 수행"); break;
			case 0: System.out.println("프로그을 종료합니다..."); break;
			
			default: System.out.println("잘못 입력하셨습니다.");
			
			}
			
		}while(menu != 0);
		
	}
}
