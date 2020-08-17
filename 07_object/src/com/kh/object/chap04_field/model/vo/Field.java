package com.kh.object.chap04_field.model.vo;

public class Field {

	/*�ʵ� (Field, ��� ����) 
	 * - Ŭ���� ������ �ۼ��ϴ� ������ ���� Ŭ���� �� ��𼭵� ���(����) ����
	 */
	
	private int num; // Ŭ���� ������ �����  int�� ���� == �ʵ�
	
	public void example1() {
		
		/* ���� ����(Local variable)
		 * - �޼ҵ�, ������, ���(�б⹮ ����)
		 *  : Ư���� ����({ })���� �����Ǵ� ����(���� ����)�� �ش� ���������� ��� ���� 
		 */
		
		int num2 = 10; // ���� ������ 10�� �ʱ�ȭ
		num = 1; // �ʵ�� Ŭ���� ���� ��𼭵��� ���� ����
	}
	
	public void exampl2() {
		num = 100;
		// num2 = 300; num2�� ������ ����� ������ ���� �Ұ�
	}
	
	// �ʵ� ����ȭ
	// 1) ��� ����(�ν��Ͻ� ����)
	// ���� : new�� ���� heap ������ ��ü(�ν��Ͻ�) ���� �� �޸𸮿� �Ҵ��
	// �Ҹ� : ��ü�� �Ҹ� �� �Ҹ� --> ��ü�� ���� �Ҹ�
	//                     --> ��ü�� � ������ �������� �������� ���� �� GC�� ���� �Ҹ�
	private char ch;
	private double db;
	
	// 2) Ŭ���� ����(static ����)
	// - static ���� ���� �ʵ�
	// ���� : ���α׷� �ǻ� �� static �޸� ������ �Ҵ�
	// �Ҹ� : ���α׷� ���� �� �Ҹ�
	public static int number;
	
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
	
	// final : ��� Ű����
	// private final double PI = 3.14;
	
	// static final (���� ��� ����)
	// ���α׷� ������ �����Ǵ� ���
	// --> �� public ? : �̷��� ������ ��𼭵� ���� �����ϵ��� ���������ڸ� public���� �δ� ���� "�Ծ�"
	public final static double PI = 3.141592;
	
}
