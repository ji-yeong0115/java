package com.kh.object.chap04_field.model.vo2;

import com.kh.object.chap04_field.model.vo.FieldTest1;

public class FieldTest3 {
	
	public void print() {
		
		FieldTest1 f1 = new FieldTest1();
		
		// ���� ��Ű���� �ƴϹǷ�  (default) ���� �����ڿ��� num3 ���� ���� �Ұ�
		// ��� ���谡 �ƴϹǷ� protected ���� �����ڿ��� num2 ���� ���� �Ұ�
		System.out.println(f1.num1);
	}

}
