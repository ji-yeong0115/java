package com.kh.poly.chap02.ex1.model.service;

import java.util.Scanner;

public class ExampleServiceImpl implements ExampleService{
	
	private Scanner sc = new Scanner(System.in);

	@Override
	public String javaFeatures() {
		String str = "1. �ü���� ������ \n"
				+ "2. ��ü ���� ��� \n"
				+ "3. ����ϱ� ���� ��� \n"
				+ "- �ɷ����̰� ��Ȯ�� �ڵ� �ۼ�����\n"
				+ "- �ٸ� ����� ���� ����(������, �޸� ����)\n"
				+ "4. �ڵ� �޸� ����(Garbage Collection)\n"
				+ "5. ���� �ε� ���� \n"
				+ "6. ��Ƽ������ ����\n"
				+ "7. ��Ʈ��ũ�� �л�ȯ�� ����";
		return str;
	}

	@Override
	public String defineInheritance() {
		String str = "�ٸ� Ŭ������ ������ �ִ� ���(�ʵ�, �޼ҵ�)���� ���� �ۼ��� Ŭ�������� ���� ������ �ʰ�, \n"
				+ "����� �������ν� �� Ŭ������ �ڽ��� ���ó�� ����� �� �ִ� ���";
		return str;
	}

	@Override
	public String definePolymorphism() {
		String str = "'�������� ���¸� ���´�'�� �ǹ� �ϳ��� �ൿ���� �������� ���� �����ϴ� ���� ����� �̿���\n"
				+ "����� �θ� Ŭ���� Ÿ�� �������� �ϳ��� ��� ���迡 �ִ� ���� Ÿ���� �ڽ� ��ü�� ������ �� �ִ� ���";
		return str;
	}

	@Override
	public String defineAbstractClass() {
		String str = "��ü ���� �޼ҵ带 ������ Ŭ����";
		return str;
	}

	@Override
	public String defineInterface() {
		String str = "����� �ʵ�� �߻� �޼ҵ常�� �ۼ��� �� �ִ� �߻� Ŭ������ ����ü �޼ҵ��� \n"
				+ "���ϼ��� �ο��ϱ� ���� �߻� �޼ҵ常 ���� ��Ƴ��� ��";
		return str;
	}

	@Override
	public String gugudan(int start, int end) {
		String str = "";
		for(int i=start; i<=end; i++) {
			str += "======" + i + " �� ======\n";
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
