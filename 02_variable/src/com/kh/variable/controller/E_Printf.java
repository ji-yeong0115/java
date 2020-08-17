package com.kh.variable.controller;

public class E_Printf {
	
	public void printfMethod() {
		
		System.out.printf("a"); // a
		System.out.printf("\n%c\n", 'b'); // (�� �ٲ�) b (�� �ٲ�)
		System.out.printf("%c %c %d %s\n", 'x', 'y', 50, "������");
		
		// ���ϴ� ��� �� 
		// 100  1000  10000
		//  50   500   5000
		System.out.printf("%3d  %4d  %5d\n", 100, 1000, 10000);
		System.out.printf("%3d  %4d  %5d\n", 50, 500, 5000);
		
		System.out.printf("%f\n", 3.14);
		System.out.printf("%.2f\n", 3.14);
		
		String name = "������";
		int age = 23;
		char gender = '��';
		
		// �������� 23�� �����Դϴ�.
		System.out.println(name + "�� " + age + "�� " + gender + "�� �Դϴ�.");
		System.out.printf("%s�� %d�� %c�� �Դϴ�.\n", name, age, gender);
		
	}
}
