package com.kh.object.chap04_field.model.vo;

public class FieldTest1 {
	// ���� �����ڿ� ���� �ʵ� ���� ���� ���� ����
	
	// num1�� 1�� ����� �ʱ�ȭ, ��ü�� �����ʰ� ���ÿ� ���� ����Ǿ� �ִ�.
	// (+)public : ���� ������Ʈ ������ ��𼭵� ���� ���� ����
	public int num1 = 1; 
	
	// (#)proteted : ���� ��Ű�� �� + �ܺ� ��Ű�� �� ��Ӱ��迡�� ���� ���� ����
	
	protected int num2 = 2;
	
	//(~)default : ���� ��Ű�� ������ ���� ���� ����
	int num3 = 3;
	
	// (-)private : ���� Ŭ���� ������ ���� ���� ����
	private int num4 = 4;
	
	public void print() {
		
		// ���� ��Ű��, Ŭ���� �����̱� ������ ���� ������ ���� ���� ��� ���� ����
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}
}
