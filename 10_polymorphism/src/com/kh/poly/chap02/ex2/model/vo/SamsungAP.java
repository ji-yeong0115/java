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
		System.out.println("1090p ��ȭ�� ���.");
	}

	@Override
	public void powerOn() {
		System.out.println("�Ŀ� ��ư�� ������ �Ｚ �ΰ� ��Ÿ��.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("�Ŀ� ��ư�� 3�ʰ� ������ �����.");
	}

	@Override
	public void scan() {
		System.out.println("�ſ� �����ϰ�");
	}
	
}
