package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int input = sc.nextInt();
		
		String result = input>0 ? "�����." : "������.";
		System.out.println(result);
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int input = sc.nextInt();
		
		String result = input>0 ? "�����." : (input==0) ? "0�̴�." : "������.";
		System.out.println(result);
	}

	public void practice3() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int input = sc.nextInt();
		
		String result = input%2==0 ? "¦����." : "Ȧ����.";
		System.out.println(result);
		
	}

	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� �� : ");
		int people = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int candy = sc.nextInt();
		
		System.out.println("1�δ� ���� ���� : " + candy/people);
		System.out.println("���� ���� ���� : " + candy%people);
	}

	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		
		System.out.print("��(���ڸ�) : ");
		int classroom = sc.nextInt();
		
		System.out.print("��ȣ(���ڸ�) : ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("����(M/F) : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.print("����(�Ҽ��� �Ʒ� ��° �ڸ�����) : ");
		double score = sc.nextDouble();
		
		String gender = ch=='M'? "���л�" : "���л�";
		
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�."
				,grade, classroom, number, name, gender, score);
		
	}

	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		String result = age>19 ? "����" : (age<=13 ? "���" : "û�ҳ�");
		System.out.println(result);
	}

	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		System.out.println("�հ� : " + (kor+eng+math));
		System.out.println("�հ� : " + (kor+eng+math)/3.0);
	}

	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹ� ��ȣ�� �Է��ϼ���(-����) : ");
		char ch = sc.nextLine().charAt(7);
		
		String gender = ch == '1' || ch == '3' ? "����" :
			(ch == '2' || ch == '4' ? "����" : "�ٽ� �Է����ּ���.");
		System.out.println(gender);
		
	}

	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 1: ");
		int num1 = sc.nextInt();
		System.out.print("���� 2: ");
		int num2 = sc.nextInt();
		System.out.print("�Է� : ");
		int input = sc.nextInt();
		
		boolean result = input<=num1 || input>num2;
		
		System.out.println(result);
	}

	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�1 : ");
		int input1 = sc.nextInt();
		System.out.print("�Է�2 : ");
		int input2 = sc.nextInt();
		System.out.print("�Է�3 : ");
		int input3 = sc.nextInt();
		
		boolean result = input1 == input2 && input2 == input3;
		
		System.out.println(result);
	}

	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A����� ���� : ");
		int a = sc.nextInt();
		System.out.print("B����� ���� : ");
		int b = sc.nextInt();
		System.out.print("C����� ���� : ");
		int c = sc.nextInt();
		
		double aInc = a*1.4;
		double bInc = b;
		double cInc = c*1.15;
		
		System.out.println("A����� ����/����+a : " + a + "/" + aInc);
		System.out.println(aInc>3000 ? "3000�̻�" : "3000�̸�");
		System.out.println("B����� ����/����+a : " + b + "/" + bInc);
		System.out.println(bInc>3000 ? "3000�̻�" : "3000�̸�");
		System.out.println("C����� ����/����+a : " + c + "/" + cInc);
		System.out.println(cInc>3000 ? "3000�̻�" : "3000�̸�");
	}
}
