package com.kh.inherit.chap01.model.vo;

public class Car extends Product {

	private String engine;
	private String color;
	private String carType;
	
	// 기본 생성자
	public Car() {}

	// 매개변수가 있는 생성자
	public Car(String engine, String color, String carType, String pName, int price) {
		
//		super(); // 부모 기본 생성자
		
		super(pName, price); // 부모의 매개변수 있는 생성자 
		this.engine = engine;
		this.color = color;
		this.carType = carType;
	}
	
	// get / setter
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
// --------------------------------------------------------------
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
// --------------------------------------------------------------
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	
	// 모든 필드 정보 반화
	public String selecetField() {
		
		
		// super 참조 변수 
		// 자식 객체 내에 부모 시작부분을 참조하는 변수, 부모의 필드와 메소드에 접근해야할 때 사용
		// 
		
		return engine + " / " + color + " / " + carType
				+ " / " + super.selectField(); 
						// --> pName + " / " + price
	}

}
