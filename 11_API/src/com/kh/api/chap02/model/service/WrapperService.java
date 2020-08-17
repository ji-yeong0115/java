package com.kh.api.chap02.model.service;

public class WrapperService {
	/*
	 * Wrapper Class
	 * - ���� Ÿ��(�⺻ �ڷ���)�� ��ü�� �����ϴ� Ŭ����
	 * <��� ����>
	 * 1) �⺻ �ڷ������δ� ������ �� ���� �Ӽ�, ����� ����ϱ� ����
	 * ex) �� �ڷ����� �ִ�, �ּҰ�, ����Ʈ ũ��
	 * 		String ���� ("1") <-> int ���� (1)
	 * 
	 * 2) �⺻ �ڷ����� ��¿ �� ���� ��ü�� �ٷ��ߵǴ� ��찡 �ִ�.
	 *  - �޼ҵ��� �Ű������� ��ü�� �䱸�� ��
	 *  - �⺻ �ڷ����� �ƴ� ��ü�� ���� �����ؾ��� ��
	 *  - ��ü ���� �񱳰� �ʿ��� �� 
	 */
	
	public void example() {
		/*
		 * byte			Byte
		 * short		Short
		 * int			Integer
		 * long			Long
		 * float		Float
		 * double		Double
		 * char			Character
		 * boolean		Boolean
		 * 
		 */
		
		
		// Integer Wrapper Ŭ������ �����ϴ� ��� �ʵ�
		System.out.println(Integer.BYTES); // int byte ũ��
				//	public static final int BYTES = 4;
		
		System.out.println(Integer.SIZE); // bit ũ��
		System.out.println(Integer.MAX_VALUE); // �ּҰ�
		System.out.println(Integer.MIN_VALUE); // �ִ밪
		
		// String �ڷ����� �⺻ �ڷ���(int)�� ��ȯ
		
		String str  = "100, 200, 300, 400";
		
		String[] arr = str.split(", ");
		
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			
			// parsexxx : String������ �⺻ �ڷ����� ���¸� ������ ������ �ش� �ڷ������� ��ȯ
			// ex) "100" --> 100
			sum += Integer.parseInt(arr[i]);
		}
		
		System.out.println("�հ� : " + sum);
		
		
		// �⺻ �ڷ���(int) --> String���� ��ȯ
		String s1 = Integer.valueOf(123).toString();
		String s2 = 123 + " ";
		
		// Boxing : �⺻ �ڷ����� Wrapper Ŭ���� ��ü�� ����
		// int�� 427�� Integer ��ü�� ��ȯ(����)
		// Wrapper class�� �ֵ� ��� ���� - Collection ����
		//  Collection�� ���� ��ü�� ���� �����ϱ� ������ �⺻ �ڷ����� ��ü�� ��ȯ�� �ʿ䰡 ����
		Integer it1 = new Integer(427);
		Integer it2 = new Integer("427");
		
		// UnBoxing : Wrapper --> �⺻ �ڷ���
		int iNum1 = it1.intValue();
		int iNum2 = (int)it2;
		
		
		// JKD 1.5�� �߰��� ���
		// Auto Boxing / Auto UnBoxing
		// �ڵ����� �⺻ �ڷ��� <-> Wrapper ��ü�� ����ȯ
		Integer it3 = 1000; // Auto Boxing
		int iNum3 = it3; // Auto UnBoxing
		
		
		
		
		
	}
	
}
