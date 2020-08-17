package com.kh.objectarray.model.vo;

public class Book {
	
	// 필드
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	// 기본 생성자
	public Book() {}
	
	// 매개변수 있는 생성장(전체)
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	// get / setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
// ----------------------------------------------------	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
// ----------------------------------------------------	
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDistcountRate(double discountRate) {
		this.discountRate = discountRate;
	}
// ----------------------------------------------------	
	public String getAuthor() {
		return author;
	}
	public void serAuthor(String author) {
		this.author = author;
	}
	
	// 필드 정보 출력용 메소드
	
	public String selectBook() {
		return title + " / " + price + " / " + discountRate + " / " + author;
	}

}
