package com.kh.poly.chap01.model.vo;

public class Bentley extends Car {
	
	public String takeOutUmbrella() {
		return "우산 꺼내기";
	}

	// 부모의 메소드 drive() 재정의(오버라이딩)
	@Override
	public String dirve() {
		return "날아다님";
	}
	
	// 컴파일 단계에서는 부모의 drive() 메소드와 바인딩 되어 있다가
	// 실제 실행 당시에는 오버라이딩 된 자식의 drive()와 바인딩이 된다. == 동적 바인딩
}
