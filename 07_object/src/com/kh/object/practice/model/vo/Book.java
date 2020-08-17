package com.kh.object.practice.model.vo;

public class Book {
	
	private String title; // 도서명
	private int price; // 가격
	private double discountRate; // 할인율
	private String author; // 저자명
	
	// 기본 생성자
	public Book() {}
	
	// 매개변수가 있는 생성자
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	// 메소드
	// 모든 필드 정보를 반환
	public String selctBook() {
		return title + " / " + price + " / " + discountRate + " / " + author ;
	}
	
	// getter / setter
// title -----------------------------------------------------
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title  = title;
	}
// price ----------------------------------------------------	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
// discountRate	---------------------------------------------
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
// author ---------------------------------------------------	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
