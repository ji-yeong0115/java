package com.kh.poly.chap02.ex2.model.vo;

public class SmartPhone implements KoreaElectronics{

	@Override
	public void powerOn() {
		System.out.println("���� ��ư 3�ʰ� ����");
	}

	@Override
	public void powerOff() {
		System.out.println("���� ��ư 5�ʰ� ����");
	}

}
