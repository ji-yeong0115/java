package com.kh.exception.chap04.model.service;

import java.util.Scanner;

import com.kh.exception.chap04.model.exception.InputZeroException;

public class UserService {
	
	public void method1() {
		
		// method2() ȣ��
		try {
			method2();
			System.out.println("���α׷� ���� ����");
		}catch(InputZeroException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void method2() throws InputZeroException {
		//�޼ҵ� ȣ��η�  InputZeroException ����
		
		// ���� 3���� �Է¹޾� ���� ���
		// ��, �ԷµǴ� ���ڰ� 0�� ��� ���ܸ� �߻���Ű�� ���α׷� ���� ����
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int input = 0;
		
		for(int i=1; i<=3; i++) {
			System.out.print("�Է�" + i + " : ");
			input = sc.nextInt();
			
			if(input == 0 ) {
				throw new InputZeroException("0�� �ԷµǾ� ���������.");
			}
			
			sum += input;
		}
		System.out.println("�� : " + sum);
	}

}
