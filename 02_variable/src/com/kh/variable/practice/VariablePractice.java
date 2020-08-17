package com.kh.variable.practice;

import java.util.Scanner;

public class VariablePractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("이름을 입력하세요 : ");
		double heigth = sc.nextDouble();
		
		System.out.printf("키 %.1fcm인 %d살 %c자 %s님 반갑습니다^^"
				, heigth, age, gender, name);
		
		
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + num1 + num2);
		System.out.println("뺴기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + num1 * num2);
		System.out.println("나누기 결과 : " + num1 % num2);
	}

	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double num1 = sc.nextDouble();
		System.out.print("세로 : ");
		double num2 = sc.nextDouble();
		
		System.out.println("면적 : " + num1*num2);
		System.out.println("면적 : " + 2*(num1+num2));
	}
}
