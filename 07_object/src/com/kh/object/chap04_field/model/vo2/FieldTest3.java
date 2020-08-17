package com.kh.object.chap04_field.model.vo2;

import com.kh.object.chap04_field.model.vo.FieldTest1;

public class FieldTest3 {
	
	public void print() {
		
		FieldTest1 f1 = new FieldTest1();
		
		// 같은 패키지가 아니므로  (default) 접근 제한자였던 num3 직접 접근 불가
		// 상속 관계가 아니므로 protected 접근 제한자였던 num2 직접 접근 불가
		System.out.println(f1.num1);
	}

}
