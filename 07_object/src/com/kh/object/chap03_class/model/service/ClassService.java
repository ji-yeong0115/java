package com.kh.object.chap03_class.model.service;
import com.kh.object.chap03_class.model.vo.Person;

public class ClassService {
	
	public void createPerson() {
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setName("������");
		p1.setAge(41);
		p1.setGender('��');
		p1.setAddress("�����");
		p1.setHeight(175);
		
		p2.setName("������");
		p2.setAge(40);
		p2.setGender('��');
		p2.setAddress("�����");
		p2.setHeight(165);
		
		System.out.println("p1 : " + p1.selectInformation());
		System.out.println("p2 : " + p2.selectInformation());
	}
}
