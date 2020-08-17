package com.kh.exception.chap03.model.service;

public class ThrowsService {

	public void method1() throws ArithmeticException {
		// throws: 내부에서 발생한 해당 예외를 호출한 메소드로 전달
		
		System.out.println("method1() 호출됨.");
		method2();
	}
	
	public void method2() throws ArithmeticException {
		System.out.println("method2() 호출됨.");
		method3();
	}
	
	public void method3() throws ArithmeticException {
		System.out.println("method3() 호출됨.");
		method4();
	}
	
	public void method4() throws ArithmeticException, NullPointerException  {
		// throws 시 여러 종류의 Exception 전달 가능
		
		System.out.println("method4() 호출됨.");
		
		//int num = 2/0; // ArithmeticException 발생
		
		// throw로 ArithmeticException 강제 발생 시키기
		throw new ArithmeticException();	
	}
	
}
