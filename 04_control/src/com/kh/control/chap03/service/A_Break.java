package com.kh.control.chap03.service;
import java.util.Scanner;

public class A_Break {
	
	public void example1() {
		// 1~10���� ���(for�� ���, �� for���� ���ǽ��� �ۼ��ϸ� �� �ȴ�.)
		
		for(int i=1; ;i++) {
			// for���� ���ǽ��� ���� �ݺ����� ����Ǵ� ������ �� �� ���� -> ���� ����(���� �ݺ�)
			
			if(i > 10) {
				break;
			}
			
			System.out.println(i);
		}
	}

	public void example2() {
		// ���ڿ� �Է¹޾� ����ϱ� ��, exit �Է� �� ����

		Scanner sc = new Scanner(System.in);
		String str = null; // �ԷµǴ� ���ڿ��� ������ ���� ����
		
		while(true) { // while���� ������ ���� �ݺ� ��Ŵ
			
			System.out.print("�Է� : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
			
			if(str.equals("exit")) {
				break;
			}
		}
		
	}
}
