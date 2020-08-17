package com.kh.inherit.practice.view;
import java.util.Scanner;
import com.kh.inherit.practice.point.model.service.CircleService;
import com.kh.inherit.practice.point.model.service.RectangleService;

public class PracticeMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	private CircleService cService = new CircleService();
	private RectangleService rService = new RectangleService();
	
	public void mainMenu() {
		
		int input=0; // �޴� �Է¿� ���� ����
		
		do {
			
			System.out.println("===== �޴� =====");
			System.out.println("1. ��");
			System.out.println("2. �簢��");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			
			input = sc.nextInt();
		// ���α׷� �帧�� �������� �� nextInt(), nextDouble()���Ŀ� nextLine()�� ���� �� ���� ���
		// ���� ���� ���� ���ſ����� nextLine()�� �ۼ��Ѵ�.
			
			switch(input) {
			case 1: circleMenu(); break;
			case 2: rectangleMenu(); break;
			case 9: System.out.println("�����մϴ�."); break;
			default : System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			}
			
		}while(input != 9);
		
	}
	
	public void circleMenu() {
		
		int input=0;

			System.out.println("===== �� �޴� =====");
			System.out.println("1. �� �ѷ�");
			System.out.println("2. �� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ : ");
			input = sc.nextInt();
			
			switch(input){
			case 1: calcCircum(); break;
			case 2: calcCircleArea(); break;
			case 9:	System.out.println("�������� �̵��մϴ�.");break;
			default : System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			}
		
	}
	
	public void rectangleMenu() {
		int input=0;
		
			System.out.println("===== �簢�� �޴� =====");
			System.out.println("1. �簢�� �ѷ�");
			System.out.println("2. �簢�� ���� ");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ : ");
			input = sc.nextInt();
			
			switch(input){
			case 1: calcPerimeter(); break;
			case 2: calcRectArea(); break;
			case 9:	break;
			}
	}
	
	public void calcCircum() {
		
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("������ : ");
		int radius = sc.nextInt();
	
		System.out.println(cService.calcCircum(x, y, radius));
			
	}
	
	public void calcCircleArea() {
		
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("������ : ");
		int radius = sc.nextInt();
		
		System.out.println(cService.calcArea(x, y, radius));
		
	}
	
	public void calcPerimeter() {
		
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("���� : ");
		int height = sc.nextInt();
		System.out.print("���� : ");
		int width = sc.nextInt();
		
		System.out.println(rService.calcPerimeter(x, y, height, width));
		
	}
	
	public void calcRectArea() {
		
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("���� : ");
		int height = sc.nextInt();
		System.out.print("���� : ");
		int width = sc.nextInt();
		
		System.out.println(rService.calcPerimeter(x, y, height, width));
		
	}

}
