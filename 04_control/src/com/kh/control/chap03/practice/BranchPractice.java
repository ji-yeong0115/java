package com.kh.control.chap03.practice;

import java.util.Scanner;

public class BranchPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int input = sc.nextInt();
			
			if(input>=1) {
				for(int i=1; i<=input; i++) {
					System.out.print(i + " ");
				}break;
			}else {
				System.out.println("1�̻��� ���ڸ� �Է��ϼ���. ");
			}
		}
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("1�̻��� ���ڸ� �Է����ּ��� : ");
			int input = sc.nextInt();
			
			if(input>=1) {
				for(int i=input; i>0; i--) {
					System.out.print(i + " ");
				}break;
			}else {
				System.out.println("1�̻��� ���ڸ� �Է��ϼ���.");
			}
		}
	}

	public void practice3() {
		 
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			 System.out.print("ù ��° ���� : ");
			 int num1 = sc.nextInt();
			 System.out.print("�� ��° ���� : ");
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
				 System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
			 }
			 
		}
	}

	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("���� : ");
			int input = sc.nextInt();
			
			if(input<=9) {
				for(int i=input; i<10; i++) {
					System.out.println("===== " + i + "�� =====");
					for(int j=1; j<10; j++) {
						System.out.printf("%d * %d = %d\n", i, j, i*j);
					}
				}break;
			}else {
				System.out.println("9������ ���ڸ� �Է����ּ���.");
			}
			
		}
	}

	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int start = sc.nextInt();
		System.out.print("���� : ");
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
			System.out.print("������(+, -, *, /, %) : ");
			String op = sc.next();
			
			
			if(op.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				continue;
			}
			
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			System.out.print("����2 : ");
			int num2 = sc.nextInt();
			
			if(op.equals("/") && num2==0) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
			
			switch(op) {
			case "+": System.out.printf("%d %s %d = %d\n",num1, op, num2, num1 + num2); break;
			case "-": System.out.printf("%d %s %d = %d\n",num1, op, num2, (num1 - num2)); break;
			case "*": System.out.printf("%d %s %d = %d\n",num1, op, num2, num1 * num2); break;
			case "/": System.out.printf("%d %s %d = %d\n",num1, op, num2, num1 / num2); break;
			case "%": System.out.printf("%d %s %d = %d\n",num1, op, num2, num1 % num2); break;
			default : System.out.printf("���� ������ ��ϴ�. �ٽ� �Է����ּ���."); continue;
			}
			System.out.println();
		}	
		
	}

	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
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
				System.out.println("�Ҽ��� �ƴմϴ�.");
			}else {
				System.out.println("�Ҽ��Դϴ�.");
			}
			
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("���� : ");
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
					System.out.println("�Ҽ��� �ƴմϴ�.");
				}else {
					System.out.println("�Ҽ��Դϴ�.");
				}break;
				
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}

	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("���� : ");
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
			System.out.printf("2���� %d���� �Ҽ��� ������ %d���Դϴ�.", input, count);
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}	
		
}
