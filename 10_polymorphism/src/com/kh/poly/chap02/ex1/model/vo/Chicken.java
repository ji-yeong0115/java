package com.kh.poly.chap02.ex1.model.vo;

public class Chicken extends Bird {

	@Override
	public String fly() {
		return "���� ���µ� ���� �� ��.";
	}

	// animal �������̽��κ��� ��ӹ��� �޼ҵ�
	@Override
	public String breath() {
		return "�췷�� ������� ���� ����ȣ���� �Ѵ�.";
	}

	@Override
	public String eat() {
		return "���̸� �θ��� �ɾ� �Դ´�.";
	}

}
