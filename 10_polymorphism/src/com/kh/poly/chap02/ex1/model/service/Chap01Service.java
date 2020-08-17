package com.kh.poly.chap02.ex1.model.service;

import com.kh.poly.chap02.ex1.model.vo.Bird;
import com.kh.poly.chap02.ex1.model.vo.Chicken;

public class Chap01Service {
	
	public void example1() {
		
		//자식 참조 변수 = 자식 객체
		Chicken c =  new Chicken();
		
		// 부모 참조 변수 = 부모 객체
		// --> 추상 클래스는 객체화(객체 생성)가 불가능
		// 미완성된 클래스로는 완전한 객체를 만들 수 없음
		//Bird b = new Bird();
		
		// 부모 참조 변수 = 자식 객체(다형성)
		Bird b2 = new Chicken();
		
	}

}
