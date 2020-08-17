package com.kh.member.view;

import java.util.Scanner;

import com.kh.book.controller.BookController;
import com.kh.member.contorller.MemberController;

public class MemMainView{

	public void mMainMenu() {
		
		Scanner sc = new Scanner(System.in);
		MemberController mController = new MemberController();
		BookController bController = new BookController();
		MemSubView mSub = new MemSubView();
		
		int sel = 0;
		
		do {
			
			if(MemberController.loginMember == null) {
				
				System.out.println("\n *** 도서관 프로그램 *** \n");
				System.out.println("1. 로그인");
				System.out.println("2. 회원 가입");
				System.out.println("0. 프로그램 종료");
				System.out.print("메뉴 선택 : ");
				sel = sc.nextInt();
				sc.nextLine();
				
				switch(sel) {
				case 1:
					
					System.out.println("\n ==== 로그인 계정 ==== \n");
					System.out.println("1. 관리자");
					System.out.println("2. 회원");
					System.out.println("0. 메뉴화면으로 돌아가기");
					System.out.print("메뉴 선택 : ");
					sel = sc.nextInt();
					sc.nextLine();
					
					switch(sel) {
					case 1: mController.loginMember(); break;
					case 2: mController.loginMember(); break;
					case 0: mMainMenu(); break;
					default : System.out.println("잘못 입력하셨습니다."
									+ "다시 입력해주세요.");
					} break;
					
				case 2: mController.newMember(); break;
					
				case 0: System.out.println("프로그램 종료"); break;
				}
				
			}else {
				
				if(MemberController.loginMember.getMemId().
						substring(0,7).equals("manager")) {
					System.out.println("\n ==== 메인 메뉴 ==== \n");
					System.out.println("1. 도서 추가");
					System.out.println("2. 도서 목록 조회");
					System.out.println("3. 도서 요청 목록 조회");
					System.out.println("4. 도서 수정");
					System.out.println("5. 도서 삭제");
					System.out.println("6. 전체 회원 조회");
					System.out.println("7. 회원 삭제");
					System.out.println("8. 로그아웃");
					System.out.println("0. 프로그램 종료");
					System.out.print("메뉴 선택 : ");
					
					sel = sc.nextInt();
					
					switch(sel) {
					case 1: bController.insertBook(); break;
					case 2: bController.selectBook(); break;
					case 3: bController.selectApply();break;
					case 4: bController.updateBook(); break;
					case 5: bController.deleteBook(); break;
					case 6: mController.selectMember(); break;
					case 7: mController.deleteMem(); break;
					case 8: 
						mController.loginMember = null;
						System.out.println("[로그아웃 완료]"); break;
					case 0: System.out.println("프로그램 종료"); break;
					default : System.out.println("잘못 입력하셨습니다."
									+ "다시 입력해주세요.");
					}	
					
					
				}else if(MemberController.loginMember.getMemId().
						substring(0,7).equals("lmember")) {
					
					System.out.println("\n === 메인 메뉴 === \n");
					System.out.println("1. 도서 목록 조회");
					System.out.println("2. 도서 대출");
					System.out.println("3. 도서 신청");
					System.out.println("4. 나의 정보 조회");
					System.out.println("5. 회원 정보 수정");
					System.out.println("6. 회원 탈퇴");
					System.out.println("7. 로그아웃");
					System.out.println("0. 프로그램 종료");
					
					System.out.print("메뉴 선택 : ");
					
					sel = sc.nextInt();
					
					switch(sel) {
					case 1: bController.selectBook(); break;
					case 2: bController.loanBook(); break;
					case 3: bController.applyBook(); break;
					case 4: mController.selectMy(); break;
					case 5: mController.updateMember(); break;
					case 6: mController.secMember(); break;
					case 7: 
						mController.loginMember = null;
						System.out.println("[로그아웃 완료]");
						break;
					case 0: 
						System.out.println("프로그램 종료");
						break;
					default : System.out.println("잘못 입력하셨습니다."
							+ "다시 입력해주세요.");
					}
					
				}
			}
			
		}while(sel != 0);
		
	}

}