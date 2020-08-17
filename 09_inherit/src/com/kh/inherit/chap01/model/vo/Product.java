package com.kh.inherit.chap01.model.vo;

public class Product {
	// Computer, Cup, Car 클래스에서 공통되었던 부분을 작성함
	
	private String pName;
	private int price;
	
	// 기본 생성자
	public Product() {}

	// 매개 변수가 있는 생성자
	public Product(String pName, int price) {
		this.pName = pName;
		this.price = price;
	}

	// 공통된 get / setter 추출
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
// -----------------------------------------------------
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String selectField() {
		return pName + " / " + price;
	}
}
