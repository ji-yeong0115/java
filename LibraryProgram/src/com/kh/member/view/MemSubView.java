package com.kh.member.view;

import static com.kh.common.JDBCTemplate.*;

import java.util.List;
import java.util.Scanner;

import com.kh.member.model.vo.Member;

public class MemSubView {
	
	private Scanner sc = new Scanner(System.in);

	public Member inputLogin() {
		
		System.out.println("\n --- 로그인 --- \n");
		
		System.out.print("ID : ");
		String memId = sc.nextLine();
		
		System.out.print("PWD : ");
		String memPwd = sc.nextLine();
		
		return new Member(memId, memPwd);
	}
	
	
	/**
	 * 서비스 요청 성공 내용 출력용 View
	 * @param string
	 */
	public void displaySuccess(String msg) {
	
		System.out.println("서비스 요청 성공 : " + msg);
	}

	/**
	 * 서비스 요청 실패 내용 출력용 View
	 * @param msg
	 */
	public void displayFail(String msg) {
		
		System.out.println("서비스 요청 실패 : " + msg);
	}

	/**
	 * 서비스 오류 내용 출력용 View
	 * @param string
	 */
	public void displayError(String msg) {
		
		System.out.println("서비스 오류 : " + msg);
	}


	/** 회원 아이디 입력용 View
	 * @return userId
	 */
	public String inputUserId() {
		
		System.out.print("\n --- [회원 아이디 입력] ---\n\n");
		
		System.out.print("회원 아이디 입력 : ");
		String userId = sc.nextLine();
		
		return userId;
	}


	/** 회원 삭제 여부 입력용 View
	 * @return del
	 */
	public char deleteMember() {
		
		System.out.print("정말로 삭제 하시겠습니까?(Y/N) : ");
		
		return sc.nextLine().toUpperCase().charAt(0);
	}


	/** 회원 수정할 정보 선택 View
	 * @return sel
	 */
	public int updateMember() {
		
		System.out.println("\n --- 수정할 정보 선택 ---\n");
		
		int sel = 0;
		
		while(true) {
			
			System.out.println("1. 이름 수정");
			System.out.println("2. 비밀번호 수정");
			System.out.println("3. 이메일 수정");
			System.out.println("4. 핸드폰 번호 수정");
			System.out.println("5. 주소 수정");
			System.out.println("6. 나이 수정");
			
			System.out.print("메뉴 선택 : ");
			
			sel = sc.nextInt();
			sc.nextLine();
			
			switch(sel){
			case 1: case 2: case 3: case 4: case 5: case 6:
			return sel;
			default : System.out.println("잘못 입력하셨습니다."
					+ " 다시 입력해주세요.");
			
			}
		}
		
	}

	public void selectMy(Member member) {
		
		System.out.println();
		
		System.out.printf("%-19s %-18s %-17s %-40s %-23s %-10s %-8s \n",
				"아이디", "비밀번호", "이름", "이메일", "핸드폰 번호", "나이" ,"주소");
		
		System.out.println("------------------------------------"
		+ "--------------------------------------------------------");
	
		System.out.printf("%-11s %-11s %-15s %-21s %-14s %-6d %-30s \n",
			member.getMemId(), member.getMemPwd(), member.getMemName(),
			member.getEmail(), member.getPhone(), member.getAge(), member.getAdd());
	}

	/** 수정할 이름 입력 View
	 * @return upStr
	 */
	public String updateName() {
		
		System.out.print("이름 입력 : ");
		return sc.nextLine();
	}


	/** 수정할 비밀번호 입력 View
	 * @return upStr
	 */
	public String updatePwd() {
		
		System.out.print("비밀번호 입력 : ");
		return sc.nextLine();
	}


	/** 수정할 이메일 입력 View
	 * @return upStr
	 */
	public String updateEmail() {
		
		System.out.print("이메일 입력 : ");
		return sc.nextLine();
	}


	/** 수정할 핸드폰 번호 입력 View
	 * @return upStr
	 */
	public String updatePhone() {
		
		System.out.print("핸드폰 번호 입력 : ");
		return sc.nextLine();
	}

	
	/** 수정할 주소 입력 View
	 * @return upStr
	 */
	public String updateAddress() {
		
		System.out.print("주소 입력 : ");
		return sc.nextLine();
	}


	/** 비밀번호 입력 View
	 * @return userPwd
	 */
	public String inputUserPwd() {
		
		System.out.print("\n --- [회원 비밀번호 입력] ---\n\n");
		
		System.out.print("회원 비밀번호 입력 : ");
		String userPwd = sc.nextLine();
		
		return userPwd;
	}


	/** 회원 탈퇴 여부 입력 View
	 * @return sec
	 */
	public char secMember() {
		
		System.out.println();
		
		System.out.print("정말로 탈퇴 하시겠습니까?(Y/N) : ");
		return sc.nextLine().toUpperCase().charAt(0);
	}


	/** 새로운 회원 정보 입력 View
	 * @return
	 */
	public Member newMember() {
		
		System.out.print("\n --- [회원가입] --- \n\n");
		
		System.out.print("아이디 : ");
		String memId = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String memPwd = sc.nextLine();
		
		System.out.print("이름 : ");
		String memName = sc.nextLine();
		
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		
		System.out.print("연락처 : ");
		String phone = sc.nextLine();
		
		System.out.print("거주지 : ");
		String add = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		return new Member(memId, memPwd, memName,
						email, phone, add, age);
	}


	public void selectMember(List<Member> list) {
		
	System.out.println();
		
		System.out.printf("%-19s %-18s %-17s %-40s %-23s %-10s %-30s %-15s %-10s \n",
				"아이디", "비밀번호", "이름", "이메일", "핸드폰 번호", "나이" ,"주소", "가입날짜", "탈퇴여부");
		
		System.out.println("------------------------------------"
		+ "------------------------------------------------------------------------------");
	
		for(Member m : list) {
			
			System.out.printf("%-11s %-11s %-15s %-21s %-14s %-6d %-30s %-15s %-10s\n",
					m.getMemId(), m.getMemPwd(), m.getMemName(),
					m.getEmail(), m.getPhone(), m.getAge(), 
					m.getAdd(), m.getEnroll(), m.getSec());
		}
		
		
	}




}
