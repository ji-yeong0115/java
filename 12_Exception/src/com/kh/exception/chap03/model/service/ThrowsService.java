package com.kh.exception.chap03.model.service;

public class ThrowsService {

	public void method1() throws ArithmeticException {
		// throws: ���ο��� �߻��� �ش� ���ܸ� ȣ���� �޼ҵ�� ����
		
		System.out.println("method1() ȣ���.");
		method2();
	}
	
	public void method2() throws ArithmeticException {
		System.out.println("method2() ȣ���.");
		method3();
	}
	
	public void method3() throws ArithmeticException {
		System.out.println("method3() ȣ���.");
		method4();
	}
	
	public void method4() throws ArithmeticException, NullPointerException  {
		// throws �� ���� ������ Exception ���� ����
		
		System.out.println("method4() ȣ���.");
		
		//int num = 2/0; // ArithmeticException �߻�
		
		// throw�� ArithmeticException ���� �߻� ��Ű��
		throw new ArithmeticException();	
	}
	
}
