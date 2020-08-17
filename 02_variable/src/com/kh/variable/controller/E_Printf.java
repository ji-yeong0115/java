package com.kh.variable.controller;

public class E_Printf {
	
	public void printfMethod() {
		
		System.out.printf("a"); // a
		System.out.printf("\n%c\n", 'b'); // (줄 바꿈) b (줄 바꿈)
		System.out.printf("%c %c %d %s\n", 'x', 'y', 50, "졸지마");
		
		// 원하는 출력 값 
		// 100  1000  10000
		//  50   500   5000
		System.out.printf("%3d  %4d  %5d\n", 100, 1000, 10000);
		System.out.printf("%3d  %4d  %5d\n", 50, 500, 5000);
		
		System.out.printf("%f\n", 3.14);
		System.out.printf("%.2f\n", 3.14);
		
		String name = "김지영";
		int age = 23;
		char gender = '여';
		
		// 김지영은 23세 여자입니다.
		System.out.println(name + "은 " + age + "세 " + gender + "자 입니다.");
		System.out.printf("%s은 %d세 %c자 입니다.\n", name, age, gender);
		
	}
}
