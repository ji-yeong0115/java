package com.kh.operator.service;
import java.util.Scanner;

public class C_Arithmetic {
	// ��� ������ : ���� ��Ģ���꿡 %(modulars, md)�� �߰�
	// * ������(/) ���� �� �ڷ����� ����
	
	public void example1() {
		// �� ������ �Է¹޾� +. -, *, /, % ��� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : "); // 32
		int num1 = sc.nextInt(); // 10
		sc.nextLine();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("num1 + num2 = " + (num1 + num2)); // 42
		System.out.println("num1 - num2 = " + (num1 - num2)); // 22
		System.out.println("num1 * num2 = " + (num1 * num2)); // 320
		System.out.println("num1 / num2 = " + (num1 / num2)); // 3
		System.out.println("num1 % num2 = " + (num1 % num2)); // 2
			
	}

}
