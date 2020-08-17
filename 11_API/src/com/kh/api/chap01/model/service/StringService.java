package com.kh.api.chap01.model.service;

import java.util.Scanner;

public class StringService {
	// String Ŭ����
	// - immutable(�Һ�) ��ü�� �� �� ������ ���ڿ��� ���� �Ұ���
	// --> ���� �� ���ο� ���ڿ� ��ü�� �����ǰ� �ش� �ּҸ� ��ȯ��
	
	public void example1() {
		
		// 1) String �� ���� �� �ּҰ� �ٲ���� Ȯ��

		String s1 = "ABC";
		
		// String�� hashCode()�� ���ڿ��� �̿��Ͽ� ���� ���ϴ� ���̱� ������
		// �ּҰ� ������ Ȯ���ϴµ��� ������
		//System.out.println(s1.hashCode());
		
		
		// --> System.identityHashCode() ���
		// : ��ü�� ���� ���� �ּҸ� �̿��Ͽ� hashCode()�� ����� �޼ҵ�
		System.out.println("���� �� s1 : " + System.identityHashCode(s1));
		
		s1 = "ABCD"; // s1 ����
		
		System.out.println("���� �� s1 : " + System.identityHashCode(s1));
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		
		// String LIteral(���ͷ�)��  String �� ���� �� ���� ���ڿ��� ��� ���� �ּҸ� ��ȯ�Ѵ�.
		// + String Pool
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str1 == str2 : " + (str1 == str2));
		
		String str3 = new String("Hello");
		System.out.println("str3 : " + str3);
		
		System.out.println("str1 == str3 : " + (str1 == str3));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("st4 �Է� : ");
		String str4 = sc.nextLine();
		
		System.out.println("���� �� s1 : " + System.identityHashCode(str1));
		System.out.println("���� �� s1 : " + System.identityHashCode(str4));
		System.out.println("str1 == str4 : " + (str1 == str4));
		
		System.out.println("String �����ᰡ �ʿ��ϸ� .equals() ����� ��");
		System.out.println("String�� �Һ��̴�.");
		
		
		
	}

	public void example2() {	
		//StringBuffer
		// -> ���ڿ� ������ ������ mutable(����) ��ü
		
		// StringBuffer ��ü�� �⺻�����ڷ� ���� �� �⺻ ����ũ�� 16�� �Ҵ���
		StringBuffer sb = new StringBuffer();
		
		// capacity() : �뷮 Ȯ��
		System.out.println("sb.capacity() : " + sb.capacity());
		
		// StringBuffer Ŭ������ hashCode()�� �������̵� ���� ����
		// object.hashCode() : ��ü �ּҸ� �̿��Ͽ� �ؽ��ڵ� ���� 
		System.out.println("�߰� �� sb.hashCode : " + sb.hashCode());
		
		// append() : ���� ���ڿ� �ڿ� �߰�
		sb.append("java api");
		System.out.println("sb.capacity() : " + sb.capacity());
		System.out.println("�߰� �� sb.hashCode : " + sb.hashCode());
		
		
		 // ���� �뷮�� 16�� �ʰ� (���� 18) -> (�����뷮 + 1) * 2
		sb.append("1234567890");
		System.out.println("sb.capacity() : " + sb.capacity());
		System.out.println("�߰� �� sb.hashCode : " + sb.hashCode());
		// ������ �־��� �ּ� �״�� �뷮�� �þ��.
		
		// ���������� ����ϸ� �ڵ����� toString()�� �ٴ´�.
		System.out.println("sb : " + sb /* toString() */);
		
		// StringBuffer�� String���� ��ȯ�Ѵ� ���
		// toString() : �ʵ� ������ ���ڿ��� ���/��ȯ
		String str = sb.toString();
	
	}

	public void example3() {
		// String.split(������);
		// --> ���ڿ��� �ش� �����ڸ� �������� �ɰ��� String[] ���·� ��ȯ
		
		String str  = "���, ����, ����, ������, ����, ���, ������, �ڵ�";
		
		// , (����)�� �����ڷ� �Ͽ� ����
		String[] arr = str.split(", ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
















}
