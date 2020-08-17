package com.kh.variable.controller;

public class B_Constant {
	
	public void finalVariable() {
		
		// 변수 선언, 초기화
		int age = 20;
		
		// 상수 선언, 초기화
		final int AGE = 20; // (*중요*) 상수의 이름은 모두 대문자
		
		System.out.println("[값 변경 전]");
		System.out.println("age : " + age); // age : 20
		System.out.println("AGE : " + AGE); // AGE : 20
		
		// 변수, 상수에 기록된 값을 변경
		age = 21;
		
		// AGE = 21; 상수는 초기화된 이후 값 변경이 불가능
	
		System.out.println("[값 변경 후]");
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		System.out.println("상수는 초기화된 이후 값 변경이 불가능");
	}
}
