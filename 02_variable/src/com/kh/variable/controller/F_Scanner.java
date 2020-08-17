package com.kh.variable.controller;
import java.util.Scanner;

public class F_Scanner {
	
	// 키보드로 이름을 입력받아 "ooo 님 환영합니다." 라는 문자열 형태로 출력
	public void scannerEx1() {
		
		// scanner는 java에서 입력을 쉽게 할 수 있도록 제공해주는 클래스로 java.util package에 포함되어 있다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까?  ");
		String name = sc.nextLine();
		
		System.out.println(name + "님 환영합니다.");
	}
	
	// 이름, 나이, 성별을 입력받아 "ooo님은 00세, o자, 키 000.0cm 입니다." 형태로 출력
	public void scannerEx2() {
		
		java.util.Scanner sc = new java.util.Scanner(System.in); // import 구문을 작성하지 않고, 다른 클래스를 얻어오는 방법
		
		System.out.print("이름 : ");
		
		// sc.nextLine() : 키보드로 입력된 한 줄의 문자열을 (입력버퍼에서)읽어온다. [엔터(\n)까지 포함해서 읽어옴]
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt(); // sc.nextInt() : 키보드로 입력된 정수 값을 읽어온다. [입력버퍼에서 공백, 띄어쓰기, 줄 바꿈 이전까지 읽어옴]
		sc.nextLine(); // 입력 버퍼에 있는 줄 바꿈 문자(\n) 제거 용도
		
		System.out.print("성별(남/여) : ");
		char gender = sc.nextLine().charAt(0); // charAt(index) : 문자열에서 index번째 문자 하나를 뽑음 [0부터 시작]
		
		System.out.print("키(cm) : ");
		double height = sc.nextDouble();
		sc.nextLine(); // 입력 버퍼에서 줄 바꿈(개행) 문자 제거
		
		System.out.printf("%s님은 %d세, %c자, 키 %.1fcm 입니다.\n", name, age, gender, height);
		
	}
}
