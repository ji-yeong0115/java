package com.kh.poly.chap02.ex2.model.vo;

public class LgAP extends AllinOnPrinter implements Fax{

	@Override
	public void print() {
		System.out.println("1440p �ʰ�ȭ��.");
	}

	@Override
	public void powerOn() {
		System.out.println("�����ν����� ������ ����.");
	}

	@Override
	public void powerOff() {
		System.out.println("�����ν����� ������ ����.");	
	}

	@Override
	public void scan() {
		System.out.println("������ ��ĵ.");	
	}

	@Override
	public void fax() {
		System.out.println("�ѽ��� �ְ� ���� �� ����.");	
	}

}
