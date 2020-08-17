package com.kh.object.chap04_field.model.service;
import com.kh.object.chap04_field.model.vo.Field;

public class FieldService {
	
	public void example1() {
		
		Field f1 = new Field();
		
		f1.number = 100;
		f1.setCh('A');
		
		System.out.println("f1.number : " + f1.number);
		System.out.println("f1.getCh : " + f1.getCh());
		
		Field f2 = new Field();
		
		f2.number = 200;
		f2.setCh('Z');
		
		System.out.println("f2.number : " + f2.number);
		System.out.println("f2.getCh : " + f2.getCh());
	}

}
