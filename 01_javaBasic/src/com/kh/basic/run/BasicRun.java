package com.kh.basic.run;
// �ڹ� ���α׷� ���� ��Ű��

import com.kh.basic.A_MethodCall;
import com.kh.basic.B_PrintExample;
// Ŭ���� ���� �ۼ� (�ڹ� ���α׷��� ���� �ƴϴ�)
// import : �ٸ� Ŭ������ �ش� Ŭ�������� ����� �� �ְ� �������� ��

public class BasicRun {
	// xxxRun Ŭ���� : �ڹ� ���ø����̼��� �����ϴ� ����
	
	public static void main(String[] args) {
		// main �޼ҵ��� ���� == �ڹ� ���ø����̼� �ܼ� ����
		// main �޼ҵ忡�� ��ü���� ����� �ۼ��ϱ⺸��, �����ϰ��� �ϴ� ����� ���� Ÿ Ŭ������ �����ϰ�, �ش� ����� ȣ���ϴ� ����
		
	/*	
		// �ٸ� Ŭ������ ���� �޼ҵ带 ȣ���ϴ� ���
		// [ȣ���Ϸ��� �޼ҵ尡 �����ϴ� Ŭ������] [��Ī(������)] = new [ȣ���Ϸ��� �޼ҵ尡 �����ϴ� Ŭ������]();
		A_MethodCall amc = new A_MethodCall();
		amc.methodA(); // A_MethodCall�� ������ �ִ� methodA() ���(�޼ҵ�)�� ȣ���Ѵ�.
		amc.methodB();
	*/
		B_PrintExample bpe = new B_PrintExample();
		bpe.printValue();
		
	}

}
