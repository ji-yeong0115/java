package com.kh.exception.chap01.model.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionService {
	
	public void example1() {
		// Unchecked Exception
		// ������ ���� ó���� ���� �ʾƵ� �Ǵ� ����(Exception)
		// �ַ� ���α׷����� �����Ƿ� ���� ������ ��찡 ���� ������
		// ���� ó�� �ڵ庸�� if�� ���� �̿��Ͽ� �ڵ带 �����ϴ� ��찡 ����.
		
		//�� ���ڸ� �Է¹޾� ������ �ϴ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();
		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();
		
		// java.lang.ArithmeticException: / by zero
		// ��� ���� �� 0���� ������ ���� ��Ȳ�� �߻�
		// �� ������ if������ ó���� �����ϴ�.
		if(num2==0) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}else {
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2) );			
		}
		
	}
	
	public void example2() {
		
		String[] arr = { "��������", "����",  null, "������" };
		
		// java.lang.NullPointerException
		// null : �ƹ��͵� �����ϰ� ���� ���� ����
		// ����� ���� null�� ���������� �̿��Ͽ� ��ü ��� ���� �õ� �� �߻��ϴ� ���� 
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != null) { // NullPointerException ����
				System.out.println(arr[i].length());				
			}
		}
		
		// i<=arr.length
		// java.lang.ArrayIndexOutOfBoundsException: 4
		// �迭�� �ε��� ������ �Ѿ�� ������ �� �߻��ϴ� ����
		
	}
	
	public void example3() {
		// Checked Exception
		// �ݵ�� ���� ó���� �ؾ��ϴ� ����(Exception)
		// �ַ� IO(�����)��Ȳ���� ���� �߻���.
		
		// Scanner (jdk 1.5) ������ ���Ǵ� Ű���� �Է� ���
		BufferedReader br  
				= new BufferedReader(new InputStreamReader(System.in));
		
		// System.out.print("�Է� : ");
		// String str = br.readLine(); 
		// Unhandled exception type IOException 
		// IOException ����ó���� �Ǿ� ���� �ʴ�.
		
		
		
		
		
		
		
		
	}

}
