package com.kh.control.chap01.service;
import java.util.Scanner;

public class B_Switch {
	// switch문
	// if문의 부분 집합(일부분)으로 if문은 조건식으로 범위를 지정할 수 있지만,
	// switch문은 딱 떨어지는 값이 조건식으로 작성되어야 한다.
	
	/* [표현식]
	 *  
	 *  switch (비교할 대상 또는 식){
	 * 
	 * 	case 값1 : 실행코드1; break;
	 *  case 값2 : 실행코드2; break;
	 * 			...
	 *  default : else에 해당하는 실행코드;
	 * }
	 * 
	 * break : switch문은 멈춰라 라는 의미
	 * 
	 */
	
	public void example1() {
		// 1에서 5사이의 정수를 입력받아 1이면 A팀, 2이면 B팀 .... 팀을 부여하고 출력하기
		// 단, 입력받은 수가 1 ~ 5사이의 수가 아니면 "잘못 입력하셨습니다." 출력
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 5 사이의 정수를 입력 해주세요 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		
		switch(input % 6) {
		case 1:
			System.out.println("A팀");
			break;
		case 2:
			System.out.println("B팀");
			break;
		case 3:
			System.out.println("C팀");
			break;
		case 4:
			System.out.println("D팀");
			break;
		case 5:
			System.out.println("E팀");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}

	}
	
	public void example2() {
		// 두 수를 입력받고, 연산자(+ - * / %) 중 하나를 입력받아 두 수를 연산한 결과를 출력
		// 단, 잘못된 연산자 입력시 "연산자를 잘못 입력하셨습니다."
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자(+ - * / %) 입력 : ");
		char op = sc.nextLine().charAt(0);
		
		// int 변수 result를 선언 및 0으로 초기화
		// int의 기본 값은 0
		int result = 0;
		
		switch(op) {
		case '+': result = num1 + num2; break;
		case '-': result = num1 - num2; break;
		case '*': result = num1 * num2; break;
		case '/': result = num1 / num2; break;
		case '%': result = num1 % num2; break;
		
		
		// return : 호출한 곳으로 돌아간다. -> return 코드를 읽는 시점에서 해당 메소드 종료
		// 메소드 종료 기능으로 사용 가능
		default: System.out.println("연산자를 잘못 입력하셨습니다."); return;
		}
		
		// 5 + 1 = 6
		System.out.printf("%d %c %d = %d \n", num1, op, num2, result);
	}

	public void example3() {
		// 과일이름(사과, 바나나, 복숭아)를 입력받아 사과 : 3000원, 바나나 : 2000원, 복숭아 : 8000원 출력
		// 단, 잘못 입력한 경우 "해당하는 과일이 없습니다." 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("과일을 입력하세요(사과, 바나나, 복숭아) : "); 
		String fruit = sc.nextLine();
		
		int price = 0; // 과일 가격 저장 변수 선언 및 초기화
		
		switch(fruit) {
		case "사과": price = 3000; break;
		case "바나나": price = 2000; break;
		case "복숭아": price = 8000; break;
		
		default: System.out.println("해당하는 과일이 없습니다."); return;
		}
		
		System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
	}

	public void example4() {
		// 1에서 12월 중 하나를 입력받아 해당 월의 일 수를 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 12월 중 하나를 입력 : ");
		int month = sc.nextInt();
		sc.nextLine();
		
		// 31일 : 1, 3, 5, 7, 8, 10, 12
		// 30일 : 4, 6, 9, 11
		// 28.29일 : 2
		
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31일"); break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일"); break;
		case 2:
			System.out.println("28일 또는 29일"); break;
			
		default: System.out.println("잘못 입력함"); 
		}
	}

}
