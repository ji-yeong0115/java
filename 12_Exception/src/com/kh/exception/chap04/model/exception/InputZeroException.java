package com.kh.exception.chap04.model.exception;

public class InputZeroException extends Exception {
	// 사용자 정의 예외 생성 방법
	// Exception 또는 그 후손 클래스를 상속받으면 된다.
	
	// 만약 Checked Exception으로 만들 경우 보통 Exception 상속받음
	
	// 만약 Unchecked Exception으로 만들 경우 보통 RuntimeException 상속받는다.
	
	public InputZeroException() {
		super();
	}
	public InputZeroException(String msg) {
		super(msg);
	}
	
}
