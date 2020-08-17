package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		String result = input>0 ? "양수다." : "음수다.";
		System.out.println(result);
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		String result = input>0 ? "양수다." : (input==0) ? "0이다." : "음수다.";
		System.out.println(result);
	}

	public void practice3() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		String result = input%2==0 ? "짝수다." : "홀수다.";
		System.out.println(result);
		
	}

	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + candy/people);
		System.out.println("남는 사탕 개수 : " + candy%people);
	}

	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(슷자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int classroom = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();
		
		String gender = ch=='M'? "남학생" : "여학생";
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다."
				,grade, classroom, number, name, gender, score);
		
	}

	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = age>19 ? "성인" : (age<=13 ? "어린이" : "청소년");
		System.out.println(result);
	}

	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		System.out.println("합계 : " + (kor+eng+math));
		System.out.println("합계 : " + (kor+eng+math)/3.0);
	}

	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민 번호를 입력하세요(-포함) : ");
		char ch = sc.nextLine().charAt(7);
		
		String gender = ch == '1' || ch == '3' ? "남자" :
			(ch == '2' || ch == '4' ? "여자" : "다시 입력해주세요.");
		System.out.println(gender);
		
	}

	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1: ");
		int num1 = sc.nextInt();
		System.out.print("정수 2: ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		boolean result = input<=num1 || input>num2;
		
		System.out.println(result);
	}

	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int input1 = sc.nextInt();
		System.out.print("입력2 : ");
		int input2 = sc.nextInt();
		System.out.print("입력3 : ");
		int input3 = sc.nextInt();
		
		boolean result = input1 == input2 && input2 == input3;
		
		System.out.println(result);
	}

	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int a = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int b = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int c = sc.nextInt();
		
		double aInc = a*1.4;
		double bInc = b;
		double cInc = c*1.15;
		
		System.out.println("A사원의 연봉/연봉+a : " + a + "/" + aInc);
		System.out.println(aInc>3000 ? "3000이상" : "3000미만");
		System.out.println("B사원의 연봉/연봉+a : " + b + "/" + bInc);
		System.out.println(bInc>3000 ? "3000이상" : "3000미만");
		System.out.println("C사원의 연봉/연봉+a : " + c + "/" + cInc);
		System.out.println(cInc>3000 ? "3000이상" : "3000미만");
	}
}
