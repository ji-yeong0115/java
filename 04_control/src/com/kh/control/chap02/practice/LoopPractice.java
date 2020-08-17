package com.kh.control.chap02.practice;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input>=1) {
			for(int i=1; i<=input; i++) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input>=1) {
			for(int i=input; i>=1; i--) {
				System.out.print(i + " ");
			}
			
		}else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		
	}

	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum=0;
		
		for(int i=1; i<=input; i++) {
			sum += i;
			if(input != i) {
				System.out.print(i + " + ");
			}else {
				System.out.print("= " +sum);
			}
		}
	}

	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1>0 && num2>0) {
			if(num1>num2) {
				for(int i=num2; i<=num1; i++) {
					System.out.print(i + " ");
				}
			}else{
				for(int i=num1; i<=num2; i++) {
					System.out.print(i + " ");
				}
			}
		}else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		
	}

	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int row = sc.nextInt();
		
		System.out.printf("==== %d ====\n", row);
		
		for(int i=1; i<=9; i++) {
			System.out.println(row + " * " + i + " = " + row*i);
		}
	}

	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int row = sc.nextInt();
		
		if(row<=9){
			for(int i=row; i<=9; i++) {
				System.out.println("==== " + i + " ====");
				for(int j=1; j<=9; j++) {
					System.out.printf("%d * %d = %d\n",i, j, i*j);
				}
			}
		}else {
			System.out.println("9이하의 숫자만 입력해주세요.");
		}
	}

	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=0; i<input; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}

	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=0; i<input; i++) {
			for(int j=0; j<input-i; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}

	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요. : ");
		int input = sc.nextInt();
		
		int count=0;
		
		for(int i=1; i<=input; i++) {
			if(i%2==0 || i%3==0){
				System.out.print(i + " ");
			}
			if(i%2==0 && i%3==0) {
				count++;
			}
		}
		System.out.println();
		System.out.println("count : " + count);		
	}

	public void practice10() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=0; i<input; i++) {
			for(int j=0; j<input-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
			
			
			
			
			
			
			
			
		
	}

	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=0; i<input; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=input-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=input, j=1; i>0; i--, j+=2) {
			
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for(int k=0; k<j; k++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}

	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=0; i<input; i++) {
			for(int j=0; j<input; j++) {
				if(i==0 || i==input-1) {
					System.out.print("*");
				}else {
					if(j==0 || j==input-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}System.out.println();
		}
	}
}