package com.kh.operator.service;

public class F_Compound {
	// ���� ���� ������ : �ٸ� �����ڿ� ���� �����ڸ� �Բ� ����ϴ� ������
	// �ڱ� �ڽŰ� ���� �� ����� �ٽ� �ڱ� �ڽſ��� ����
	
	// ex) int a = 10, a += 10; -> == a = a + 10;	a = 20;
	// ���� ���� ������ ����ó�� �ӵ��� �ν� �����Ƿ� ��� ����
	
	public void example1() {
		
		int num = 12;
		
		num += 3 ;
		System.out.println("num 3 ���� : " + num);
		
		num -= 5;
		System.out.println("num 5 ���� : " + num);
		
		num *= 6;
		System.out.println("num 6�� ���� : " + num);
		
		num /= 2;
		System.out.println("num 1/2�� ���ҽ�Ű�� : " + num);
		
		num %= 4;
		System.out.println("num�� 4�� ������ �� ������: " + num);
	}
}
