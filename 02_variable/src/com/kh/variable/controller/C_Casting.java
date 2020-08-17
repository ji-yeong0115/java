package com.kh.variable.controller;

public class C_Casting {
	
	/* ��ǻ���� �� ó�� ��Ģ
	 *  1. ���� �ڷ��� ������ ������ �����ϴ�.
	 *  2. ���� �ڷ��� ������ ����� �����ϴ�. 
	 *  3. ����� ����� ��꿡 ���� �ڷ����� ����.
	 *  -> ����ȯ�� �̿��Ͽ� ��Ģ�� �� �� �ִ�.
	 */
	
	/* ����ȯ�� ����
	 *  1. �ڵ� ����ȯ
	 *  2. ����(������) ����ȯ
	 */
	
	// �ڵ� ����ȯ
	//���� ������ ���� �ڷ� ���� ū �ڷ��� ���� ���� �� �����Ϸ��� �ڵ����� ���� �ڷ����� ū �ڷ������� ��ȯ��Ű�� ��
	public void autoCasting() {
		
		int i = 12;
		double d = 3.3;
		double result = i + d; // 12 +3.3 --> 12.0 + 3.3
		
		System.out.println(i + " + " + d + " = " + (i+d)); // 12 + 3.3 --> 12.0 + 3.3 = 15.3
		System.out.println(i + " + " + d + " = " + result);
		
		// int(4byte) -> long(8byte)
		int i2 = 2147483647;
		long l2 = i2 + 1L; // 2147483647L + 1L ���·� �����Ϸ��� ��ȯ�Ͽ� ��� ���� == �ڵ� ����ȯ
		
		System.out.println("l2�� �� " + l2);
		
		//float(4byte) -> double(8byte)
		float f3 = 2.13f;
		double d3 = 3.14;
		double result3 = f3 + d3;
		
		// 2.13 + 3.14 = 5.27 ---> 2.13 + 3.14 = 5.2700001144409185
		// 10���� ���ѼҼ��� 2������ ��ȯ�ϸ� ���ѼҼ��� �Ǵ� ��찡 ����.
		// ��ǻ�ʹ� �Ǽ��� �ε��Ҽ������� ǥ���ϱ� ������ 2���� ���ѼҼ��� ��Ȯ�� ǥ���ϴµ� �Ѱ谡 �ִ�. --> ���� �߻�
		System.out.println(f3 + " + " + d3 + " = " + result3);
		
		// char(2byte) -> int(4byte)
		int i4 = 'A'; // int�� ������ char���� ���ͷ� �� ����
		
		/* char -> int �ڵ� ����ȯ�� ������ ����
		 * char��� �ڷ��� ������ ���� ��ü�� �����ϴ� ������ �ƴ� 2byte ����(0~65,535) ���� ���ڸ� �����ϰ�,  
		 * �����ڵ��� ����ǥ���� �ش� ��ȣ�� ��ġ�ϴ� ���ڸ� ã�� ����ϴ� �ڷ����̴�.
		 *  --> ��� : char�� �������̸鼭 �������̴�. 
		 */
		
		// char �ڷ��� ������ ������ ����
		char ch5 = 65;
		
		System.out.println("i4�� �� : " + i4);
		System.out.println("ch5�� �� : " + ch5);
		
		// byte, short, int
		byte bNum1 = 1;
		byte bNum2 = 10;
		
		/* byte bResult = bNum1 + bNum2; --> type mismatch error
		 *  byte, short, int, char �� �� ���� �ڷ����� int ���ͷ��� ���� �ʱ�ȭ �� �� �ִ�.
		 *  �̴� int �ڷ����� �����ϰ� ���� �� ���� �����ϴ�! �ʱ�ȭ �� ���� byte, short, char
		 *  �ڷ��� ������ ���� �̿��Ͽ� ���(����) ���� �� ������ int������ ����ó���� ����ȴ�.
		 * */
		
		// byte �������� ���� �� ������ ���� int������ ó���Ǳ� ������ bResult�� ������ �Ұ����� ����
		// --> int�� ����� byte������ ���� �� ��ȯ�ϸ� ���� ����
		byte bResult = (byte)(bNum1 + bNum2);
		
	}
	
	// ���� ����ȯ
	public void forcedCasting() {
		//���� ������ ū �ڷ��� -> ���� �ڷ������� ������ ��ȯ
		
		int iNum1 = 10;
		
		// ���α׷��ֿ��� '=' ��ȣ�� ���� ������ --> ���Ե� ���� 
		// long ������ int ���ͷ� ���� ������ ��� int ���ͷ� ���� long���� ���ͷ� �ڵ� ����ȯ�Ͽ� ����ȴ�.
		long lNum1 = 10l;
		
		// iNum1 + lNum1�� ���� ��� �ڷ��� == long
		// int = long ���Կ��� ����� �ȴ�.
		//int result = iNum1 + lNum1;
		
		/* ���� �ذ���
		 *  1. ����ڰ� Ÿ���� ����. -> result�� Ÿ���� long������ ��ȯ
		 */
		 long result = iNum1 + lNum1;
		 
		 // 2. �������� int������ ���� ����ȯ
		 int result2 = (int)(iNum1 + lNum1);
		 
		 // 3. lNum1�� int������ ���� ����ȯ
		 int result3 = iNum1 + (int)lNum1;
		 
		 
		
	}
	
}