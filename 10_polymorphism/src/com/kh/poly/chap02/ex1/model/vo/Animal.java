package com.kh.poly.chap02.ex1.model.vo;

public interface Animal {
	
	// �������̽��� �ʵ�� ������ public static final
//	public static final int SOUL = 1;
	
	// �������̽��� �ʵ�� ���������� public static final
	int SOUL = 1;
	
	// �������̽��� �޼ҵ�� ������ public abstact
	public abstract String breath();
	
	// ���ͼ��̽��� �޼ҵ�� ���������� public abstract
	String eat();
	
	// ���ͼ��̽��� ����ϴ� Ű���� 
	/*
	 * �������̽��� �Ϲ�Ŭ������ ��� : implements(�����ϴ�)
	 * �������̽��� �߻�Ŭ������ ��� : implements
	 * --> Ŭ������ �������̽� ��� �� ������ implements
	 * 
	 * �������̽��� �������̽��� ��� : extends
	 * 
	 * 
	 */
}
