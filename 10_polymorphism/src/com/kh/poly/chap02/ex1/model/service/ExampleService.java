package com.kh.poly.chap02.ex1.model.service;

public interface ExampleService {
	
	public abstract String javaFeatures();
	// �ڹ��� Ư¡�� ��ȯ
	
	public abstract String defineInheritance();
	// ����� ���Ǹ� ��ȯ
	
	public abstract String definePolymorphism();
	// �������� ���Ǹ� ��ȯ
	
	public abstract String defineAbstractClass();
	// �߻�Ŭ������ ���Ǹ� ��ȯ
	
	public abstract String defineInterface();
	// �������̽��� ���Ǹ� ��ȯ
	
	public abstract String gugudan(int start, int end);
	// start ���� end������ �� ����ϱ�
	// ���� : 2��
	// ���� : 4��
	// ===== 2�� =====
	// 2 * 1 = 2
	// ...
	// ===== 3�� =====
	// ...
	// ===== 4�� =====
	// ...
	
	public abstract String reverseStar(int input);  
	// �Ʒ��� ���� �Է� ���� ����ŭ �� ��� ���ڿ� ��ȯ
	// �Է� : 4
	// ****
	// ***
	// **
	// *
}
