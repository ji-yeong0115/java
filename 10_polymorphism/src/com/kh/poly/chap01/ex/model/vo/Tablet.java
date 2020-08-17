package com.kh.poly.chap01.ex.model.vo;

public class Tablet extends Electronics {
	
	private String touchScreen;
	
	public Tablet() {}

	public Tablet(boolean power, String brand, String sNum, String touchScreen) {
		super(power, brand, sNum);
		this.touchScreen = touchScreen;
	}

	public String getTouchScreen() {
		return touchScreen;
	}

	public void setTouchScreen(String touchScreen) {
		this.touchScreen = touchScreen;
	}

	@Override
	public String toString() {
		return "Tablet [" + super.toString() + ", touchScreen = " + touchScreen + "]";
	}
	

}
