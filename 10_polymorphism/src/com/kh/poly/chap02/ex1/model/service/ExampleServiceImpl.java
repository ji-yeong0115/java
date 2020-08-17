package com.kh.poly.chap02.ex1.model.service;

import java.util.Scanner;

public class ExampleServiceImpl implements ExampleService{
	
	private Scanner sc = new Scanner(System.in);

	@Override
	public String javaFeatures() {
		String str = "1. 운영체제에 독립적 \n"
				+ "2. 객체 지향 언어 \n"
				+ "3. 사용하기 쉬운 언어 \n"
				+ "- 능률적이고 명확한 코드 작성가능\n"
				+ "- 다른 언어의 단점 보와(포인터, 메모리 관리)\n"
				+ "4. 자동 메모리 관리(Garbage Collection)\n"
				+ "5. 동적 로딩 지원 \n"
				+ "6. 멀티쓰레드 지원\n"
				+ "7. 네트워크와 분산환경 지워";
		return str;
	}

	@Override
	public String defineInheritance() {
		String str = "다른 클래스가 가지고 있는 멤버(필드, 메소드)들을 새로 작성할 클래스에서 직접 만들지 않고, \n"
				+ "상속을 받음으로써 새 클래스가 자신의 멤버처럼 사용할 수 있는 기능";
		return str;
	}

	@Override
	public String definePolymorphism() {
		String str = "'여러개의 형태를 갖는다'는 의미 하나의 행동으로 여러가지 일을 수행하는 개념 상속을 이용한\n"
				+ "기술로 부모 클래스 타입 참조변수 하나로 상속 관계에 있는 여러 타입의 자식 객체를 참조할 수 있는 기술";
		return str;
	}

	@Override
	public String defineAbstractClass() {
		String str = "몸체 없는 메소드를 포함한 클래스";
		return str;
	}

	@Override
	public String defineInterface() {
		String str = "상수형 필드와 추상 메소드만을 작성할 수 있는 추상 클래스의 변형체 메소드의 \n"
				+ "통일성을 부여하기 위해 추상 메소드만 따로 모아놓은 것";
		return str;
	}

	@Override
	public String gugudan(int start, int end) {
		String str = "";
		for(int i=start; i<=end; i++) {
			str += "======" + i + " 단 ======\n";
			for(int j=1; j<=9; j++) {
				str += i + " * " + j + " = " + (i*j) + "\n";
			}
		}
		return str;
	}

	@Override
	public String reverseStar(int input) {
		String str = "";
			for(int i=0; i<input; i++) {
				for(int j=0; i<input-i; j++) {
					str += i + ", " + j;
				}
			}
		return str;
	}

}
