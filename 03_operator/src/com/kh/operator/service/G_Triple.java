package com.kh.operator.service;
import java.util.Scanner;

public class G_Triple {
	// ���� ������ : ���ǽ� ? ��1 : ��2; -> ���ǽ��� true�� ��� ��1 ����, false�� ��� ��2 ����
	// ���ǽ��� ����� �ݵ�� true �Ǵ� false -> ��/�� ������ ����� ��κ�
	
	public void example1() {
		// ����(���� == ���� ����, ���� ���� 0)�� �Է� �޾� ������� �ƴ��� �˻��ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		String result = (input > 0) ? "����̴�." : "����� �ƴϴ�.";
		
		System.out.println(input + "��/�� " + result);
		
	}
	
	public void example2() {
		// ������ �Է� �޾� ���, 0, ���� �˻��ϱ�
		// ���� ������ ��ø ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		String result = (input > 0) ? "����̴�." : ((input < 0) ? "�����̴�." : "0�̴�.");
		
		System.out.println(input + "��/�� " + result);
		
	}
}
