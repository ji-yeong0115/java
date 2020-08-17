package com.kh.object.chap03_class.model.vo;

public class Person {
	
	// ----- 필드(멤버변수) -----
	
	private String name;
	private int age;
	private char gender;
	private String address;
	private double height;
	
	// ----- 메소드(멤버 메소드) -----
	
	// getter / setter
	
// name ---------------------------------------------	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
// age ----------------------------------------------	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
// gender -------------------------------------------	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
// address ------------------------------------------
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
// height -------------------------------------------
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	public void walk() {
		System.out.println(name + "이 직립보행을 한다.");
	}
	
	// 객체가 가지고 있는 모든 필드의 정보를 반환하는 메소드
	public String selectInformation() {
		String str = name + " / " + age + " / " + gender + 
					" / " + address + " / " + height; 
		
		return str;
	}

}
