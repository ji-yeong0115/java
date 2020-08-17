package com.kh.operator.service;
import java.util.Scanner;

public class E_Logic {
	// 논리 연산자  : 논리 값 두 개를 비교하는 연산자
	// &&(AND) : 둘 다 true 일 때만  true 반환, ||(OR) : 둘 다 false일 때만 false 반환
	// tip. and : 그리고, ~이면서, ~까지, ~사이, ~부터	ex) 1부터 100사이
	//            ex) 여자이면서 안경을 쓴 사람
	//      or : 또는, ~거나, ~이거나	ex) 스마트폰이 삼성 또는 LG인 사람
	
	public void example1() {
		// 입력받은 정수가 1에서 100사이의 숫자인지 확인하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		// 1 <= input <= 100
		boolean result = (1 <= input) && (input <= 100);
		
		System.out.println("1부터 100사이의 수인가? " + result);	
	}
	
	public void example2() {
		// 입력한 알파벳이 대문자 인지 검사
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 'A' <= ch <= 'Z'
		// char 자료형에 실제 저장되는 값은 정수 : A ~ Z는 65부터 1씩 증가하면서 순서대로 나열되어 있음
		
		boolean result = (ch >= 'A') && (ch <= 'Z');
		System.out.println("영어 대문자 확인  : " + result);	
		
	}
	
	public void example3() {
		// 입력받은 알파벳이 y인지 검사(대소문자 구문 없음)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'Y') || (ch == 'y');
		System.out.println("알파벳 Y인지 확인 : " + result);
	}
	
	public void example4() {
		// 증감 + 산술 + 비교 + 논리
		
		int a = 2;
		int b = 3;
		
		boolean c = a > b;
		boolean d = ++a <= b++;
		
		System.out.println("a : " +a); // 3                          
		System.out.println("b : " +b); // 4
		System.out.println("c : " +c); // false
		System.out.println("d : " +d); // true
		
		System.out.println();
		
		System.out.println("!c : " + !c); // !true
		System.out.println("c != d : " + (c != d)); // false != true -> true
		
		System.out.println();
		
		System.out.println("(a % b) == 1 : " + ((a % b) == 1)); // false
		System.out.println("(a == 3) && (b == 4) : " + ((a == 3) && (b == 4))); //true
		System.out.println("!d || (a-b) > 0 : " + (!d || (a-b) > 0)); // false
		
		System.out.println();
		
		System.out.println("!(c == d) && ((a * b == 10) || ( b % 2 == 0)) : " + (!(c == d) && ((a * b == 10) || ( b % 2 == 0)))); // true	
	}		
}
