package com.kh.variable.practice;

import java.util.Scanner;

public class VariablePractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		System.out.print("������ �Է��ϼ���(��/��) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		double heigth = sc.nextDouble();
		
		System.out.printf("Ű %.1fcm�� %d�� %c�� %s�� �ݰ����ϴ�^^"
				, heigth, age, gender, name);
		
		
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		System.out.println("���ϱ� ��� : " + num1 + num2);
		System.out.println("���� ��� : " + (num1 - num2));
		System.out.println("���ϱ� ��� : " + num1 * num2);
		System.out.println("������ ��� : " + num1 % num2);
	}

	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double num1 = sc.nextDouble();
		System.out.print("���� : ");
		double num2 = sc.nextDouble();
		
		System.out.println("���� : " + num1*num2);
		System.out.println("���� : " + 2*(num1+num2));
	}
}
