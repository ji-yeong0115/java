package com.kh.control.chap01.service;
import java.util.Scanner;

public class B_Switch {
	// switch��
	// if���� �κ� ����(�Ϻκ�)���� if���� ���ǽ����� ������ ������ �� ������,
	// switch���� �� �������� ���� ���ǽ����� �ۼ��Ǿ�� �Ѵ�.
	
	/* [ǥ����]
	 *  
	 *  switch (���� ��� �Ǵ� ��){
	 * 
	 * 	case ��1 : �����ڵ�1; break;
	 *  case ��2 : �����ڵ�2; break;
	 * 			...
	 *  default : else�� �ش��ϴ� �����ڵ�;
	 * }
	 * 
	 * break : switch���� ����� ��� �ǹ�
	 * 
	 */
	
	public void example1() {
		// 1���� 5������ ������ �Է¹޾� 1�̸� A��, 2�̸� B�� .... ���� �ο��ϰ� ����ϱ�
		// ��, �Է¹��� ���� 1 ~ 5������ ���� �ƴϸ� "�߸� �Է��ϼ̽��ϴ�." ���
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 5 ������ ������ �Է� ���ּ��� : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		
		switch(input % 6) {
		case 1:
			System.out.println("A��");
			break;
		case 2:
			System.out.println("B��");
			break;
		case 3:
			System.out.println("C��");
			break;
		case 4:
			System.out.println("D��");
			break;
		case 5:
			System.out.println("E��");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

	}
	
	public void example2() {
		// �� ���� �Է¹ް�, ������(+ - * / %) �� �ϳ��� �Է¹޾� �� ���� ������ ����� ���
		// ��, �߸��� ������ �Է½� "�����ڸ� �߸� �Է��ϼ̽��ϴ�."
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("������(+ - * / %) �Է� : ");
		char op = sc.nextLine().charAt(0);
		
		// int ���� result�� ���� �� 0���� �ʱ�ȭ
		// int�� �⺻ ���� 0
		int result = 0;
		
		switch(op) {
		case '+': result = num1 + num2; break;
		case '-': result = num1 - num2; break;
		case '*': result = num1 * num2; break;
		case '/': result = num1 / num2; break;
		case '%': result = num1 % num2; break;
		
		
		// return : ȣ���� ������ ���ư���. -> return �ڵ带 �д� �������� �ش� �޼ҵ� ����
		// �޼ҵ� ���� ������� ��� ����
		default: System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�."); return;
		}
		
		// 5 + 1 = 6
		System.out.printf("%d %c %d = %d \n", num1, op, num2, result);
	}

	public void example3() {
		// �����̸�(���, �ٳ���, ������)�� �Է¹޾� ��� : 3000��, �ٳ��� : 2000��, ������ : 8000�� ���
		// ��, �߸� �Է��� ��� "�ش��ϴ� ������ �����ϴ�." ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���(���, �ٳ���, ������) : "); 
		String fruit = sc.nextLine();
		
		int price = 0; // ���� ���� ���� ���� ���� �� �ʱ�ȭ
		
		switch(fruit) {
		case "���": price = 3000; break;
		case "�ٳ���": price = 2000; break;
		case "������": price = 8000; break;
		
		default: System.out.println("�ش��ϴ� ������ �����ϴ�."); return;
		}
		
		System.out.println(fruit + "�� ������ " + price + "�� �Դϴ�.");
	}

	public void example4() {
		// 1���� 12�� �� �ϳ��� �Է¹޾� �ش� ���� �� ���� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 12�� �� �ϳ��� �Է� : ");
		int month = sc.nextInt();
		sc.nextLine();
		
		// 31�� : 1, 3, 5, 7, 8, 10, 12
		// 30�� : 4, 6, 9, 11
		// 28.29�� : 2
		
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31��"); break;
		case 4: case 6: case 9: case 11:
			System.out.println("30��"); break;
		case 2:
			System.out.println("28�� �Ǵ� 29��"); break;
			
		default: System.out.println("�߸� �Է���"); 
		}
	}

}
