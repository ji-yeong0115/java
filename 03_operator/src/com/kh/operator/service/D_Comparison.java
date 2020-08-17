package com.kh.operator.service;

public class D_Comparison {
		// �� ������(���� ������)
		/* �� ��(���� �Ǵ� ����)�� ���ϴ� ������ �� ������ ������ �����ϸ� true, �ƴϸ� false�� ��ȯ��.
		 * ��ȯ ex) int a = 10;, int b = 20; a < b; --> �ڵ� ��ü�� true�� ��ȯ��
		 * 
		 * < 	ex) a < b	b�� a���� ū��?(�ʰ�), a�� b���� ������?(�̸�)
		 * >	ex) a > b   a�� b���� ū��?(�ʰ�), b�� a���� ������?(�̸�)
		 * <=	ex) a <= b	a�� b���� �۰ų� ������?(����)
		 * >=	ex) a >= b	a�� b���� ũ�ų� ������?(�̻�)
		 * ==	ex) a == b	a�� b�� ������?
		 * !=	ex) a != b	a�� b�� �ٸ���?
		 * 
		 * tip. ���� ��ȣ���� '='�� ������ ������
		 * 
		 */
	
	public void example1() {
		
		int num1 = 10;
		int num2 = 25;
		
		// ���� �ڷ��� ���� ���� �� �� �ٷ� ���� ���� ������ ���ʻ� ���� ����. (�� ���� ���忡�� �ϳ��� �ǹ̸��� ������ �ۼ�)
		boolean result1, result2, result3;
		
		result1 = (num1 == num2); // false
		result2 = (num1 <= num2); // true
		result3 = (num1 > num2); // false
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		
		// %, == or != �� �̿��Ͽ� Ȧ��, ¦�� , ��� �Ǻ�����
		
		int a = 5;
		
		System.out.println("a�� ¦���ΰ�? " + (a % 2 == 0));
		System.out.println("a�� ¦���ΰ�? " + (a % 2 != 1));
		System.out.println("a�� Ȧ���ΰ�? " + (a % 2 != 0));
		System.out.println("a�� Ȧ���ΰ�? " + (a % 2 == 1));
		
		System.out.println("a�� 5�� ����ΰ�? " + (a % 5 == 0));
	}
}
