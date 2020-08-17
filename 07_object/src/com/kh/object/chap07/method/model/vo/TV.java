package com.kh.object.chap07.method.model.vo;

public class TV {
	
	private String screen;
	private boolean power;
	public static int voltage;
	
	// 기본생성자
	public TV() {}
	
	// 매개변수 있는 생성자
	public TV (String screen, boolean power, int votlage) {
		this.screen = screen;
		this.power = power;
		this.voltage = voltage;
	}

// screen -----------------------------------------
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
// power ------------------------------------------
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public static void test() {
		System.out.println("test() 메소드는 static 메소드입니다. ");
	}
}
