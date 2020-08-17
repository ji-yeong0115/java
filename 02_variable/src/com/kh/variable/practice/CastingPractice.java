package com.kh.variable.practice;

import java.util.Scanner;

public class CastingPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println(ch+ " unicode : " +(int)ch);
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		System.out.println("총 점 : " + (int)(kor+eng+math));
		System.out.println("평균 : " + (int)(kor+eng+math)/3);
	}
	
	public void practice3() {
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2);
		System.out.println((int)dNum);
		
		System.out.println((int)(iNum2*dNum));
		System.out.println((double)iNum1);
		
		System.out.println((double)iNum1/iNum2);
		System.out.println(dNum);
		
		System.out.println((int)fNum);
		System.out.println((int)(iNum1/fNum));
		
		System.out.println(iNum1/fNum);
		System.out.println((double)iNum1/fNum);
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println((int)ch+iNum1);
		System.out.println((char)(ch+iNum1));
		
	}
}
