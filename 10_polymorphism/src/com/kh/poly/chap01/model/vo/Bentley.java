package com.kh.poly.chap01.model.vo;

public class Bentley extends Car {
	
	public String takeOutUmbrella() {
		return "��� ������";
	}

	// �θ��� �޼ҵ� drive() ������(�������̵�)
	@Override
	public String dirve() {
		return "���ƴٴ�";
	}
	
	// ������ �ܰ迡���� �θ��� drive() �޼ҵ�� ���ε� �Ǿ� �ִٰ�
	// ���� ���� ��ÿ��� �������̵� �� �ڽ��� drive()�� ���ε��� �ȴ�. == ���� ���ε�
}
