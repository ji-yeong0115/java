package com.kh.object.chap04_field.model.vo;

public class FieldTest2 {
	
	public void print() {
		
		FieldTest1 f1 = new FieldTest1();
		System.out.println(f1.num1);
		System.out.println(f1.num2);
		System.out.println(f1.num3);
		
		// num4의 접근제한자는 private으로 클래스 외부에서는 직접 접근이 불가능
		//System.out.println(f1.num4);
	}

}
