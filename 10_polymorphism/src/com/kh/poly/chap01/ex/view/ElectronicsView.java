package com.kh.poly.chap01.ex.view;

import java.util.Scanner;

import com.kh.poly.chap01.ex.model.service.ElectronicsService;
import com.kh.poly.chap01.ex.model.vo.Desktop;
import com.kh.poly.chap01.ex.model.vo.Laptop;
import com.kh.poly.chap01.ex.model.vo.Tablet;

public class ElectronicsView {

	private ElectronicsService service = new ElectronicsService();
	private Scanner sc = new Scanner(System.in);
	
	// 기본 생성자
	public ElectronicsView() {
		service.insert(new Desktop(true, "삼성", "s001", "2080ti"));
		service.insert(new Laptop(true, "LG", "l100", 80));
		service.insert(new Tablet(true, "애플", "a200", "정전식 터치 스크린"));
	}
	
	public void mainMenu() {
		
		int input=0;
		do {
			
			System.out.println("====== 메뉴 선택 ======");
			System.out.println("1. 기기 정보 조회 ");
			System.out.println("2. 전체 정보 조회 ");
			System.out.println("3. 판매 가능 여부 조회 ");
			System.out.println("9. 종료 ");
			System.out.print("메뉴 선택 : ");
			
			input = sc.nextInt();
			
			switch(input) {
			case 1: selectOndMenu(); break;
			case 2: System.out.println(service.selectAll());break;
			case 3: selectSoldOutMenu(); break;
			case 9: System.out.println("<<프로그램 종료>>"); break;
			default : System.out.println("다시 입력해주세요.");
			}
			
		}while(input != 9);
	}

	// 기기 정보 조회 메뉴
	public void selectOndMenu() {
		
		int input=0;
		do {
			
			System.out.println("====== 기기 정보 조회 메뉴  ======");
			System.out.println("1. 데스크탑 ");
			System.out.println("2. 노트북(랩탑) ");
			System.out.println("3. 태블릿 ");
			System.out.println("9. 메인으로 돌아가기 ");
			System.out.print("메뉴 선택 : ");
			
			input = sc.nextInt();
			
			switch(input) {
			case 1: case 2: case 3: 
				System.out.println(service.selectOne(input));
				break;
			case 9: System.out.println("<<메인으로 이동>>"); break;
			default : System.out.println("다시 입력해주세요.");
			}
			
		}while(input != 9);
		
	}
	
	// 판매 가능 여부 조회
	public void selectSoldOutMenu() {
		
		int input=0;
		do {
			
			System.out.println("====== 판매 가능 여부 조회 메뉴  ======");
			System.out.println("1. 데스크탑 ");
			System.out.println("2. 노트북(랩탑) ");
			System.out.println("3. 태블릿 ");
			System.out.println("9. 메인으로 돌아가기 ");
			System.out.print("메뉴 선택 : ");
			
			input = sc.nextInt();
			
			switch(input) {
			case 1: case 2: case 3: 
				System.out.println( service.selectSoldOut(service.selectOne(input)) );
				break;
			case 9: System.out.println("메인으로 이동"); break;
			default : System.out.println("다시 입력해주세요.");
			}
			
		}while(input != 9);
		
	}
	
}
