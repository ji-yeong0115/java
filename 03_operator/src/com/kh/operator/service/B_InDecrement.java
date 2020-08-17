package com.kh.operator.service;

public class B_InDecrement {
	// ���� ������ : �ǿ�����(������ ���ϴ� �� �Ǵ� ����)�� 1 ���� �Ǵ� ���� ��Ű�� ������
	// ++ : 1 ����, -- : 1 ����
	// ���� ������ : ���� ���� ���� ���� �� �ٸ� ���� ����
	// ���� ������ : �ٸ� ���� ���� �� ���� ���� ����

	public void example1() {
		
		// ���� ���� ������ �׽�Ʈ
		int num = 10;
		
		System.out.println("���� ������ ���� �� : " + num); // 10
		System.out.println("++num 1ȸ ���� �� : " + (++num)); // num = 11
		System.out.println("++num 2ȸ ���� �� : " + (++num)); // num = 12
		System.out.println("++num 3ȸ ���� �� : " + (++num)); // num = 13
		System.out.println("++num 4ȸ ���� �� : " + (++num)); // num = 14
		System.out.println("++num 5ȸ ���� �� : " + (++num)); // num = 15
		
		System.out.println("���� ������ ���� �� : " + num); // num = 15
		
		// ��輱 ���
		System.out.println("\n------------------------------------------\n");
		
		// ���� ���� ������ �׽�Ʈ
		int num2 = 10;
		System.out.println("���� ���� ������ ���� �� : " + num2); // 10
		System.out.println("num1-- 1ȸ ���� �� : " + (num2--)); // ��� : 10, num = 9
		System.out.println("num1-- 2ȸ ���� �� : " + (num2--)); // ��� : 9, num = 8
		System.out.println("num1-- 3ȸ ���� �� : " + (num2--)); // ��� : 8, num = 7
		System.out.println("num1-- 4ȸ ���� �� : " + (num2--)); // ��� : 7, num = 6
		System.out.println("num1-- 5ȸ ���� �� : " + (num2--)); // ��� : 6, num = 5
		
		System.out.println("���� ���� ������ ���� �� : " + num2); // 5
		
	}
	
	public void example2() {
		
		int num1 = 20;
		int result = num1++ * 3;
		
		System.out.println("num1 : " + num1); // 21
		System.out.println("result : " + result); // 60
		
	}
	
	public void example3() {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		int result1 = a++; // a = 11, b = 20, c = 30
		int result2 = ++a + b++; // a = 12, b = 21, c = 30
		int result3 = (a++) + (--b) + (--c); // a = 13, b = 20, c = 29
		
		System.out.println("a : " + a); // 13
		System.out.println("b : " + b); // 20
		System.out.println("c : " + c); // 29
		
		System.out.println("result1 : " + result1); // 10
		System.out.println("result2 : " + result2); // 32
		System.out.println("result3 : " + result3); // 61
		
	}
	
}
