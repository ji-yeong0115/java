package com.kh.variable.controller;

public class B_Constant {
	
	public void finalVariable() {
		
		// ���� ����, �ʱ�ȭ
		int age = 20;
		
		// ��� ����, �ʱ�ȭ
		final int AGE = 20; // (*�߿�*) ����� �̸��� ��� �빮��
		
		System.out.println("[�� ���� ��]");
		System.out.println("age : " + age); // age : 20
		System.out.println("AGE : " + AGE); // AGE : 20
		
		// ����, ����� ��ϵ� ���� ����
		age = 21;
		
		// AGE = 21; ����� �ʱ�ȭ�� ���� �� ������ �Ұ���
	
		System.out.println("[�� ���� ��]");
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		System.out.println("����� �ʱ�ȭ�� ���� �� ������ �Ұ���");
	}
}
