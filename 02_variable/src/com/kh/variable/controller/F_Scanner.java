package com.kh.variable.controller;
import java.util.Scanner;

public class F_Scanner {
	
	// Ű����� �̸��� �Է¹޾� "ooo �� ȯ���մϴ�." ��� ���ڿ� ���·� ���
	public void scannerEx1() {
		
		// scanner�� java���� �Է��� ���� �� �� �ֵ��� �������ִ� Ŭ������ java.util package�� ���ԵǾ� �ִ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �̸��� �����Դϱ�?  ");
		String name = sc.nextLine();
		
		System.out.println(name + "�� ȯ���մϴ�.");
	}
	
	// �̸�, ����, ������ �Է¹޾� "ooo���� 00��, o��, Ű 000.0cm �Դϴ�." ���·� ���
	public void scannerEx2() {
		
		java.util.Scanner sc = new java.util.Scanner(System.in); // import ������ �ۼ����� �ʰ�, �ٸ� Ŭ������ ������ ���
		
		System.out.print("�̸� : ");
		
		// sc.nextLine() : Ű����� �Էµ� �� ���� ���ڿ��� (�Է¹��ۿ���)�о�´�. [����(\n)���� �����ؼ� �о��]
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt(); // sc.nextInt() : Ű����� �Էµ� ���� ���� �о�´�. [�Է¹��ۿ��� ����, ����, �� �ٲ� �������� �о��]
		sc.nextLine(); // �Է� ���ۿ� �ִ� �� �ٲ� ����(\n) ���� �뵵
		
		System.out.print("����(��/��) : ");
		char gender = sc.nextLine().charAt(0); // charAt(index) : ���ڿ����� index��° ���� �ϳ��� ���� [0���� ����]
		
		System.out.print("Ű(cm) : ");
		double height = sc.nextDouble();
		sc.nextLine(); // �Է� ���ۿ��� �� �ٲ�(����) ���� ����
		
		System.out.printf("%s���� %d��, %c��, Ű %.1fcm �Դϴ�.\n", name, age, gender, height);
		
	}
}
