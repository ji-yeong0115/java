package com.kh.control.chap01.practice;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		
		System.out.print("�޴� ��ȣ�� �Է��ϼ���: ");
		int mNum = sc.nextInt();
		
		switch(mNum) {
		case 1: System.out.println("�Է� �޴� �Դϴ�."); break;
		case 2: System.out.println("���� �޴� �Դϴ�."); break;
		case 3: System.out.println("��ȸ �޴� �Դϴ�."); break;
		case 4: System.out.println("���� �޴� �Դϴ�."); break;
		case 7: System.out.println("���α׷��� ����˴ϴ�."); break;
		
		default : System.out.println("�ٽ� �Է����ּ���.");
		}
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �� �� �Է��ϼ���: ");
		int input = sc.nextInt();
		
		if(input>0) {
			if(input%2==0) {
				System.out.println("¦����.");
			}else {
				System.out.println("Ȧ����.");
			}	
		}else {
			System.out.println("����� �Է����ּ���.");
		}
	}

	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = (kor + eng + math)/3;
		
		if(kor>=40 && eng>=40 && math>=40 && avg>=60) {
			System.out.println("���� : " + kor);
			System.out.println("���� : " + eng);
			System.out.println("���� : " + math);
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + avg);
			
			System.out.println("�����մϴ�, �հ��Դϴ�!");
			
		}else {
			System.out.println("���հ��Դϴ�.");
		}
	}

	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 ������ ���� �Է�: ");
		int month = sc.nextInt();
		
		if(month>=1 && month<=12) {
			switch(month) {
			case 1: case 2: case 12:
				System.out.println(month +"���� �ܿ��Դϴ�.");
				break;
			case 3: case 4: case 5:
				System.out.println(month +"���� ���Դϴ�.");
				break;
			case 6: case 7: case 8:
				System.out.println(month +"���� �����Դϴ�.");
				break;
			case 9: case 10: case 11:
				System.out.println(month +"���� �����Դϴ�.");
			default : System.out.println("�ش��ϴ� ������ �����ϴ�.");
			}
			
		}else {
			System.out.println(month + "���� �߸� �Էµ� ���Դϴ�.");
		}
		
	}

	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		String id = "myId";
		String pwd = "myPassword12";
		
		System.out.print("���̵� : ");
		String iId = sc.nextLine();
		System.out.print("���̵� : ");
		String iPwd = sc.nextLine();
		
		if(id.equals(iId)) {
			if(pwd.equals(iPwd)) {
				System.out.println("�α��� ����");
			}else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		}else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
	}

	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String auth = sc.nextLine();
		
		switch(auth) {
		case "������": System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, ��� �ۼ�, �Խñ� ��ȸ");
					break;
		case "ȸ��": System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
					break;
		case "��ȸ��": System.out.println("�Խñ� ��ȸ"); break;
		default : System.out.println("�ٽ� �Է��� �ּ���.");
		}
	}

	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		if(bmi>=30) {
			System.out.println("�� ��");
		}else if(bmi>=25) {
			System.out.println("��");
		}else if(bmi>=23) {
			System.out.println("��ü��");
		}else if(bmi>=18.5) {
			System.out.println("����ü��");
		}else{
			System.out.println("��ü��");
		}
	}

	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);
		
		switch(op) {
		case '+': System.out.printf("%d %c %d = %d\n", num1, op, num2, num1+num2); break;
		case '-': System.out.printf("%d %c %d = %d\n", num1, op, num2, num1-num2); break;
		case '*': System.out.printf("%d %c %d = %d\n", num1, op, num2, num1*num2); break;
		case '/': System.out.printf("%d %c %d = %f\n", num1, op, num2, (double)num1/num2); break;
		case '%': System.out.printf("%d %c %d = %d\n", num1, op, num2, num1%num2); break;
		}
	}

	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰� ��� ���� : ");
		int middle = sc.nextInt();
		System.out.print("�⸻ ��� ���� : ");
		int ending = sc.nextInt();
		System.out.print("���� ���� : ");
		int task = sc.nextInt();
		System.out.print("�⼮ Ƚ�� : ");
		int atd = sc.nextInt();
		
		System.out.println("=============== ��� ===============");
		
		double mRate = middle * 0.2;
		double eRate = ending * 0.3;
		double tRate = task * 0.3;
		double aRate = atd;
		
		double sum = mRate + eRate + tRate + aRate;
		
		if(atd>=20 * 0.7) {
			if(sum>=70) {
				System.out.println("�߰� ��� ����(20) : " + mRate);
				System.out.println("�⸻ ��� ����(30) : " + eRate);
				System.out.println("���� ����(30) : " + tRate);
				System.out.printf("�⼮ ����(20) : %.1f\n", (double)atd);
				System.out.println("�� �� : " + sum);
				System.out.println("PASS");
			}else {
				System.out.println("�߰� ��� ����(20) : " + mRate);
				System.out.println("�⸻ ��� ����(30) : " + eRate);
				System.out.println("���� ����(30) : " + tRate);
				System.out.printf("�⼮ ����(20) : %.1f\n", (double)atd);
				System.out.println("�� �� : " + sum);
				System.out.println("Fail [���� �̴�]");
			}
		}else {
			System.out.println("Fail [�⼮ Ƚ�� ���� (" + atd +"/20)]");
		}
		
	}

	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦�� /Ȧ��");
		System.out.println("3. �հ� / ���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. PASS / FIAL");
		
		System.out.print("���� : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1: practice1(); break;
		case 2: practice2(); break;
		case 3: practice3(); break;
		case 4: practice4(); break;
		case 5: practice5(); break;
		case 6: practice6(); break;
		case 7: practice7(); break;
		case 8: practice8(); break;
		case 9: practice9(); break;
		}
		
	}
}
