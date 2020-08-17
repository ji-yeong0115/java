package com.kh.poly.chap02.ex2.model.vo;

public class SamsungAP extends AllinOnPrinter{

	public SamsungAP() {
		super();
	}
	
	public SamsungAP(String brand, String pName) {
		super(brand, pName);
	}
	
	@Override
	public void print() {
		System.out.println("1090p 고화질 출력.");
	}

	@Override
	public void powerOn() {
		System.out.println("파워 버튼을 누르면 삼성 로고가 나타남.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("파워 버튼을 3초간 누르면 종료됨.");
	}

	@Override
	public void scan() {
		System.out.println("매우 선명하게");
	}
	
}
