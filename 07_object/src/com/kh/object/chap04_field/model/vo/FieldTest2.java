package com.kh.object.chap04_field.model.vo;

public class FieldTest2 {
	
	public void print() {
		
		FieldTest1 f1 = new FieldTest1();
		System.out.println(f1.num1);
		System.out.println(f1.num2);
		System.out.println(f1.num3);
		
		// num4�� ���������ڴ� private���� Ŭ���� �ܺο����� ���� ������ �Ұ���
		//System.out.println(f1.num4);
	}

}
