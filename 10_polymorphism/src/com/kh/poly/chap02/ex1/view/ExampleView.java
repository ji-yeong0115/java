package com.kh.poly.chap02.ex1.view;

import java.util.Scanner;

import com.kh.poly.chap02.ex1.model.service.ExampleService;
import com.kh.poly.chap02.ex1.model.service.ExampleServiceImpl;

public class ExampleView {
	
	// 인터페이스(부모타입의 참조변수)  		인터페이스를 구현한 클래스(자식 타입 객체) - 다형성
	private ExampleService service = new ExampleServiceImpl();
	private ExampleServiceImpl eService = new ExampleServiceImpl();
	
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		int input = 0;
		do {
			
			System.out.println("====== 메인 메뉴 ======");
			System.out.print("1 ~ 7 사이를 입력해 주세요(종료는 9) : ");
		
			input = sc.nextInt();
		
			switch(input) {
		
			case 1: System.out.println(service.javaFeatures());break;
			case 2: System.out.println(service.defineInheritance());break;
			case 3: System.out.println(service.definePolymorphism());break;
			case 4: System.out.println(service.defineAbstractClass());break;
			case 5: System.out.println(service.defineInterface());break;
			case 6: printGugudan();break;
			case 7: printStar();break;
			case 9: System.out.println("종료"); break;
		
			default : System.out.println("다시 입력");break;
		
		}
		
		}while(input != 9);
	}
	
	public void printGugudan() {
		
		System.out.print("시작 : ");
		int start = sc.nextInt();
		System.out.print("종료 : ");
		int end = sc.nextInt();
		
		System.out.println(service.gugudan(start, end));
		
	}
	
	public void printStar() {
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		System.out.println(service.reverseStar(input));
	}
	
}
