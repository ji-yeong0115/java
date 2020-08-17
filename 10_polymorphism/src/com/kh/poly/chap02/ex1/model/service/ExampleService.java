package com.kh.poly.chap02.ex1.model.service;

public interface ExampleService {
	
	public abstract String javaFeatures();
	// 자바의 특징을 반환
	
	public abstract String defineInheritance();
	// 상속의 정의를 반환
	
	public abstract String definePolymorphism();
	// 다형성의 정의를 반환
	
	public abstract String defineAbstractClass();
	// 추상클래스의 정의를 반환
	
	public abstract String defineInterface();
	// 인터페이스의 정의를 반환
	
	public abstract String gugudan(int start, int end);
	// start 부터 end까지의 단 출력하기
	// 시작 : 2단
	// 종료 : 4단
	// ===== 2단 =====
	// 2 * 1 = 2
	// ...
	// ===== 3단 =====
	// ...
	// ===== 4단 =====
	// ...
	
	public abstract String reverseStar(int input);  
	// 아래와 같이 입력 받은 수만큼 별 출력 문자열 반환
	// 입력 : 4
	// ****
	// ***
	// **
	// *
}
