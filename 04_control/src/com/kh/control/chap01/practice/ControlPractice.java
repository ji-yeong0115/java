package com.kh.control.chap01.practice;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.print("메뉴 번호를 입력하세요: ");
		int mNum = sc.nextInt();
		
		switch(mNum) {
		case 1: System.out.println("입력 메뉴 입니다."); break;
		case 2: System.out.println("수정 메뉴 입니다."); break;
		case 3: System.out.println("조회 메뉴 입니다."); break;
		case 4: System.out.println("삭제 메뉴 입니다."); break;
		case 7: System.out.println("프로그램이 종료됩니다."); break;
		
		default : System.out.println("다시 입력해주세요.");
		}
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요: ");
		int input = sc.nextInt();
		
		if(input>0) {
			if(input%2==0) {
				System.out.println("짝수다.");
			}else {
				System.out.println("홀수다.");
			}	
		}else {
			System.out.println("양수만 입력해주세요.");
		}
	}

	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = (kor + eng + math)/3;
		
		if(kor>=40 && eng>=40 && math>=40 && avg>=60) {
			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + math);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			
			System.out.println("축하합니다, 합격입니다!");
			
		}else {
			System.out.println("불합격입니다.");
		}
	}

	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력: ");
		int month = sc.nextInt();
		
		if(month>=1 && month<=12) {
			switch(month) {
			case 1: case 2: case 12:
				System.out.println(month +"월은 겨울입니다.");
				break;
			case 3: case 4: case 5:
				System.out.println(month +"월은 봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println(month +"월은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println(month +"월은 가을입니다.");
			default : System.out.println("해당하는 계절이 없습니다.");
			}
			
		}else {
			System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
		
	}

	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		String id = "myId";
		String pwd = "myPassword12";
		
		System.out.print("아이디 : ");
		String iId = sc.nextLine();
		System.out.print("아이디 : ");
		String iPwd = sc.nextLine();
		
		if(id.equals(iId)) {
			if(pwd.equals(iPwd)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}

	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String auth = sc.nextLine();
		
		switch(auth) {
		case "관리자": System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
					break;
		case "회원": System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
					break;
		case "비회원": System.out.println("게시글 조회"); break;
		default : System.out.println("다시 입력해 주세요.");
		}
	}

	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		if(bmi>=30) {
			System.out.println("고도 비만");
		}else if(bmi>=25) {
			System.out.println("비만");
		}else if(bmi>=23) {
			System.out.println("과체중");
		}else if(bmi>=18.5) {
			System.out.println("정상체중");
		}else{
			System.out.println("저체중");
		}
	}

	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);
		
		switch(op) {
		case '+': System.out.printf("%d %c %d = %d\n", num1, op, num2, num1+num2); break;
		case '-': System.out.printf("%d %c %d = %d\n", num1, op, num2, num1-num2); break;
		case '*': System.out.printf("%d %c %d = %d\n", num1, op, num2, num1*num2); break;
		case '/': System.out.printf("%d %c %d = %f\n", num1, op, num2, (double)num1/num2); break;
		case '%': System.out.printf("%d %c %d = %d\n", num1, op, num2, num1%num2); break;
		}
	}

	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int middle = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int ending = sc.nextInt();
		System.out.print("과제 점수 : ");
		int task = sc.nextInt();
		System.out.print("출석 횟수 : ");
		int atd = sc.nextInt();
		
		System.out.println("=============== 결과 ===============");
		
		double mRate = middle * 0.2;
		double eRate = ending * 0.3;
		double tRate = task * 0.3;
		double aRate = atd;
		
		double sum = mRate + eRate + tRate + aRate;
		
		if(atd>=20 * 0.7) {
			if(sum>=70) {
				System.out.println("중간 고사 점수(20) : " + mRate);
				System.out.println("기말 고사 점수(30) : " + eRate);
				System.out.println("과제 점수(30) : " + tRate);
				System.out.printf("출석 점수(20) : %.1f\n", (double)atd);
				System.out.println("총 점 : " + sum);
				System.out.println("PASS");
			}else {
				System.out.println("중간 고사 점수(20) : " + mRate);
				System.out.println("기말 고사 점수(30) : " + eRate);
				System.out.println("과제 점수(30) : " + tRate);
				System.out.printf("출석 점수(20) : %.1f\n", (double)atd);
				System.out.println("총 점 : " + sum);
				System.out.println("Fail [점수 미달]");
			}
		}else {
			System.out.println("Fail [출석 횟수 부족 (" + atd +"/20)]");
		}
		
	}

	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수 /홀수");
		System.out.println("3. 합격 / 불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. PASS / FIAL");
		
		System.out.print("선택 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1: practice1(); break;
		case 2: practice2(); break;
		case 3: practice3(); break;
		case 4: practice4(); break;
		case 5: practice5(); break;
		case 6: practice6(); break;
		case 7: practice7(); break;
		case 8: practice8(); break;
		case 9: practice9(); break;
		}
		
	}
}
