package com.kh.variable.controller;

public class A_Variable {
	
	// 변수를 사용하지 않은 경우
	public void noVariable() {
		System.out.println("변수 사용 X");
		System.out.println(2 * 3.141592653589793 * 10);
		System.out.println(3.141592653589793 * 10 * 10);
		System.out.println(3.141592653589793 * 10 * 10 * 20);
		System.out.println(4 * 3.141592653589793 * 10 *10);
	}
	
	// 변수를 사용한 경우
	public void usingVariable() {
		double pi = 3.141592653589793; // 원주율
		int r  = 3; // 반지름
		int h = 20; // 높이
		
		System.out.println("변수 사용 O");
		System.out.println(2 * pi * r); // 원의 둘레
		System.out.println(pi * r * r); // 원의 넓이
		System.out.println(pi * r * r * h); // 원기둥 부피
		System.out.println(4 * pi * r * r); // 구의 겉넓이
		
	/* 변수 사용의 장점
	 *  1. 값의 의미를 부여할 수 있다.
	 *  2. 가독성이 좋아진다.
	 *  3. 재사용성(지속성)이 좋다. 
	 *  4. 유지보수성이 좋다.
	 * */	
	}
	
	// 변수 선언
	public void declareVariable() {
		
		// 1. 논리형 : 참(true), 거짓(false)을 저장할 수 있는 자료형
		boolean isTrue; // 1byte의 크기
		
		// 2. 숫자
		// 2-1. 정수형(양의 정수, 음의 정수, 0)
		byte bNum; // 1byte
		short sNum; // 2byte, 정수형 중에 기본형
		int iNum; // 4byte
		long lNum; // 8byte
		
		// 2-2. 실수형
		// 실수형 데이터의 저장방식 -> 부동소수점 방식을 사용
		// 0.99999993 float : 소수점 아래 8자리
		// 0.9999999999999993 double : 소수점 아래 16자리
		// double은 float보다 정확도(소수점의 길이)가 2배
		float fNum; // 4byte
		double dNum; // 8byte
		
		// 3. 문자형 : 문자형 변수는 문자 딱 하나 저장 가능
		char ch; // 자바 :2byte
		
		// 4. 문자열 : 기본 자료형이 아닌 참조형, 메모리 크기가 되는 한 무제한
		String str;
		
		
//-------------------------------------------------------------------------//
		// 선언한 변수에 값 대입
		
		// 문자형
		isTrue = true; // boolean 자료형 변수에 대입될 수 있는 값(리터럴)은 true 또는 false
		isTrue = false;
		
		// 정수형
		bNum = 1; // bNum = 128; -> type mismatch error : 128은 byte 자료형의 값의 범위를 넘어 선 값
		
		// byte, short -> 옛날 프로그램과의 호환성을 위해 남겨진 자료형으로 별도의 리터럴 표기법이 존재하지 않아 int의 리터럴 표기법을 사용
		sNum = 10000;
		iNum = 2000000000;
		lNum = 123; // 정수형 long의 리터럴 표기법은 정수 뒤에 l 또는 L을 표기
		
		// 실수형
		fNum = 1.234f; // 실수형 float의 리터럴 표기법은 실수 뒤에 f 또는 F를 표기
		dNum = 3.141592; // double을 실수형의 기본형으로 별도의 리터럴 표기법을 갖지 않고 실수 자체만을 작성
		
		// 문자형
		ch = 'A'; // char 자료형의 리터럴 표기법은 ' '(홀따옴표)
		str = "A"; // String의 리터럴 표기법은 " "(쌍따옴표), 한 글자만 작성해도 쌍따옴표로 표기
		
		// 변수에 저장된 값 출력하기
		System.out.println("isTrue 변수에 저장된 값 : " + isTrue); // isTrue 변수에 저장된 값 : true
		
		System.out.println("bNum 변수에 저장된 값 : " + bNum);
		System.out.println("sNum 변수에 저장된 값 : " + sNum);
		System.out.println("iNum 변수에 저장된 값 : " + iNum);
		System.out.println("lNum 변수에 저장된 값 : " + lNum);
		
		System.out.println("fNum 변수에 저장된 값 : " + fNum);
		System.out.println("dNum 변수에 저장된 값 : " + dNum);
		
		System.out.println("ch 변수에 저장된 값 : " + ch);
		System.out.println("String 변수에 저장된 값 : " + str);
		
		// 변수명은 한글도 가능?!
		int 인트;
		인트 = -100;
		System.out.println("인트 변수에 저장된 값 : " + 인트);
		
	}
	
	// 변수 선언과 동시에 초기화
	public void initVariable() {
		// init : 초기화
		
		// 1. 논리형
		boolean isTrue = false;
		
		// 2. 정수형
		byte bNum = 1; // 1byte
		short sNum = 2; // 2byte
		int iNum = 4; // 4byte, 정수(자료)형의 기본형
		long lNum = 8l; // 8byte
		
		// 3. 실수형
		float fNum = 4.0f; // 4byte
		double dNum = 8.0; // 8byte, 실수형의 기본형
		
		// 4. 문자형
		char ch = '많'; // 한글도 가능
		
		// 5. 문자열(참조형)
		String str = "A강의장";
		
		System.out.println("isTrue에 초기화된 값 : " + isTrue);
		
		System.out.println("bNum에 초기화된 값 : " + bNum);
		System.out.println("sNum에 초기화된 값 : " + sNum);
		System.out.println("iNum에 초기화된 값 : " + iNum);
		System.out.println("lNum에 초기화된 값 : " + lNum);
		
		System.out.println("fNum에 초기화된 값 : " + fNum);
		System.out.println("dNum에 초기화된 값 : " + dNum);
		
		System.out.println("ch에 초기화된 값 : " + ch);
		System.out.println("str에 초기화된 값 : " + str);
		

	}
	
	
	
}
