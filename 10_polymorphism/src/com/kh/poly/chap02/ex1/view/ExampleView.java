package com.kh.poly.chap02.ex1.view;

import java.util.Scanner;

import com.kh.poly.chap02.ex1.model.service.ExampleService;
import com.kh.poly.chap02.ex1.model.service.ExampleServiceImpl;

public class ExampleView {
	
	// �������̽�(�θ�Ÿ���� ��������)  		�������̽��� ������ Ŭ����(�ڽ� Ÿ�� ��ü) - ������
	private ExampleService service = new ExampleServiceImpl();
	private ExampleServiceImpl eService = new ExampleServiceImpl();
	
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		int input = 0;
		do {
			
			System.out.println("====== ���� �޴� ======");
			System.out.print("1 ~ 7 ���̸� �Է��� �ּ���(����� 9) : ");
		
			input = sc.nextInt();
		
			switch(input) {
		
			case 1: System.out.println(service.javaFeatures());break;
			case 2: System.out.println(service.defineInheritance());break;
			case 3: System.out.println(service.definePolymorphism());break;
			case 4: System.out.println(service.defineAbstractClass());break;
			case 5: System.out.println(service.defineInterface());break;
			case 6: printGugudan();break;
			case 7: printStar();break;
			case 9: System.out.println("����"); break;
		
			default : System.out.println("�ٽ� �Է�");break;
		
		}
		
		}while(input != 9);
	}
	
	public void printGugudan() {
		
		System.out.print("���� : ");
		int start = sc.nextInt();
		System.out.print("���� : ");
		int end = sc.nextInt();
		
		System.out.println(service.gugudan(start, end));
		
	}
	
	public void printStar() {
		
		System.out.print("�Է� : ");
		int input = sc.nextInt();
		
		System.out.println(service.reverseStar(input));
	}
	
}
