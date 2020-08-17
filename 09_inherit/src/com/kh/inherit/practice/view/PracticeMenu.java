package com.kh.inherit.practice.view;
import java.util.Scanner;
import com.kh.inherit.practice.point.model.service.CircleService;
import com.kh.inherit.practice.point.model.service.RectangleService;

public class PracticeMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	private CircleService cService = new CircleService();
	private RectangleService rService = new RectangleService();
	
	public void mainMenu() {
		
		int input=0; // 메뉴 입력용 변수 선언
		
		do {
			
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			
			input = sc.nextInt();
		// 프로그램 흐름을 예상했을 때 nextInt(), nextDouble()이후에 nextLine()이 나올 것 같을 경우
		// 버퍼 개행 문자 제거용으로 nextLine()을 작성한다.
			
			switch(input) {
			case 1: circleMenu(); break;
			case 2: rectangleMenu(); break;
			case 9: System.out.println("종료합니다."); break;
			default : System.out.println("잘못 입력 하셨습니다.");
			}
			
		}while(input != 9);
		
	}
	
	public void circleMenu() {
		
		int input=0;

			System.out.println("===== 원 메뉴 =====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			input = sc.nextInt();
			
			switch(input){
			case 1: calcCircum(); break;
			case 2: calcCircleArea(); break;
			case 9:	System.out.println("메인으로 이동합니다.");break;
			default : System.out.println("잘못 입력 하셨습니다.");
			}
		
	}
	
	public void rectangleMenu() {
		int input=0;
		
			System.out.println("===== 사각형 메뉴 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이 ");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			input = sc.nextInt();
			
			switch(input){
			case 1: calcPerimeter(); break;
			case 2: calcRectArea(); break;
			case 9:	break;
			}
	}
	
	public void calcCircum() {
		
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
	
		System.out.println(cService.calcCircum(x, y, radius));
			
	}
	
	public void calcCircleArea() {
		
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		System.out.println(cService.calcArea(x, y, radius));
		
	}
	
	public void calcPerimeter() {
		
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("넓이 : ");
		int width = sc.nextInt();
		
		System.out.println(rService.calcPerimeter(x, y, height, width));
		
	}
	
	public void calcRectArea() {
		
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("넓이 : ");
		int width = sc.nextInt();
		
		System.out.println(rService.calcPerimeter(x, y, height, width));
		
	}

}
