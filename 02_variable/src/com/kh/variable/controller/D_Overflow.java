package com.kh.variable.controller;

public class D_Overflow {
	
	// overflow��
	//  �����Ͱ� ����Ǿ� �ִ� ������ �ش� ���� �ڷ����� ���� ������ �Ѿ�� ���� ���ԵǸ� ��Ÿ���� ��������
	//  ��ȣ ��Ʈ ħ������ ������ �ʴ� �������� ����� ��Ÿ����.
	
	public void overflowEx() {
	
		byte bNum = 127; // byte�� ���� �ִ밪
		
		System.out.println("���� �� bNum : " + bNum); // 127
		
		bNum = (byte)(bNum + 1);  // �� : ���� ���� ���� ���� bNum 127
		
		System.out.println("���� �� bNum : " + bNum);
		
	}

}
