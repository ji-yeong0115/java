package com.kh.control.chap03.practice;

import java.util.Scanner;

public class BranchPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int input = sc.nextInt();
			
			if(input>=1) {
				for(int i=1; i<=input; i++) {
					System.out.print(i + " ");
				}break;
			}else {
				System.out.println("1이상의 숫자를 입력하세요. ");
			}
		}
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("1이상의 숫자를 입력해주세요 : ");
			int input = sc.nextInt();
			
			if(input>=1) {
				for(int i=input; i>0; i--) {
					System.out.print(i + " ");
				}break;
			}else {
				System.out.println("1이상의 숫자를 입력하세요.");
			}
		}
	}

	public void practice3() {
		 
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			 System.out.print("첫 번째 숫자 : ");
			 int num1 = sc.nextInt();
			 System.out.print("두 번째 숫자 : ");
			 int num2 = sc.nextInt();
			 
			 if(num1>=1 && num2>=1) {
				 if(num1>num2) {
					 for(int i=num2; i<=num1; i++) {
						 System.out.print(i + " ");
					 }
				 }else {
					 for(int i=num1; i<=num2; i++) {
						 System.out.print(i + " ");
					 }
				 } break;
			 }else {
				 System.out.println("1이상의 숫자를 입력해주세요.");
			 }
			 
		}
	}

	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("숫자 : ");
			int input = sc.nextInt();
			
			if(input<=9) {
				for(int i=input; i<10; i++) {
					System.out.println("===== " + i + "단 =====");
					for(int j=1; j<10; j++) {
						System.out.printf("%d * %d = %d\n", i, j, i*j);
					}
				}break;
			}else {
				System.out.println("9이하의 숫자만 입력해주세요.");
			}
			
		}
	}

	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		System.out.print("공차 : ");
		int input = sc.nextInt();
		
		int count=0;
		
		for(int i=start; ; i+=input) {
			System.out.print(i + " ");
			count++;
			if(count==10) {
				break;
			}
		}

	}

	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.next();
			
			
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				continue;
			}
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			if(op.equals("/") && num2==0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;
			}
			
			switch(op) {
			case "+": System.out.printf("%d %s %d = %d\n",num1, op, num2, num1 + num2); break;
			case "-": System.out.printf("%d %s %d = %d\n",num1, op, num2, (num1 - num2)); break;
			case "*": System.out.printf("%d %s %d = %d\n",num1, op, num2, num1 * num2); break;
			case "/": System.out.printf("%d %s %d = %d\n",num1, op, num2, num1 / num2); break;
			case "%": System.out.printf("%d %s %d = %d\n",num1, op, num2, num1 % num2); break;
			default : System.out.printf("없는 연산자 잆니다. 다시 입력해주세요."); continue;
			}
			System.out.println();
		}	
		
	}

	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		boolean flag = false;
		
		if(input>=2) {
			for(int i=2; i<input; i++) {
				if(input%i==0) {
					flag=true;
					break;
				}
			}
			if(flag) {
				System.out.println("소수가 아닙니다.");
			}else {
				System.out.println("소수입니다.");
			}
			
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("숫자 : ");
			int input = sc.nextInt();
			
			boolean flag = false;
			
			if(input>=2) {
				for(int i=2; i<input; i++) {
					if(input%i==0) {
						flag = true;
						break;
					}
				}
				if(flag) {
					System.out.println("소수가 아닙니다.");
				}else {
					System.out.println("소수입니다.");
				}break;
				
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		boolean flag = false;
		int count=0;
		
		if(input>=2) {
			for(int i=2; i<=input; i++) {
				for(int j=2; j<i; j++) {
					if(i%j==0) {
						flag=true;
						break;
					}
				}
				if(!flag) {
					System.out.print(i + " ");
					count++;
				}
				flag=false;
			}
			System.out.println();
			System.out.printf("2부터 %d까지 소수의 개수는 %d개입니다.", input, count);
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}	
		
}
