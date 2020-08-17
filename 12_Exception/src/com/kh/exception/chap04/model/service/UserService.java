package com.kh.exception.chap04.model.service;

import java.util.Scanner;

import com.kh.exception.chap04.model.exception.InputZeroException;

public class UserService {
	
	public void method1() {
		
		// method2() 호출
		try {
			method2();
			System.out.println("프로그램 정상 종료");
		}catch(InputZeroException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void method2() throws InputZeroException {
		//메소드 호출부로  InputZeroException 전달
		
		// 숫자 3개를 입력받아 합을 출력
		// 단, 입력되는 숫자가 0일 경우 예외를 발생시키고 프로그램 강제 종료
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int input = 0;
		
		for(int i=1; i<=3; i++) {
			System.out.print("입력" + i + " : ");
			input = sc.nextInt();
			
			if(input == 0 ) {
				throw new InputZeroException("0이 입력되어 강제종료됨.");
			}
			
			sum += input;
		}
		System.out.println("합 : " + sum);
	}

}
