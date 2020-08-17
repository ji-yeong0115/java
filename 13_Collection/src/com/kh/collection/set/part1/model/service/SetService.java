package com.kh.collection.set.part1.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.kh.collection.set.part1.model.vo.Student2;

public class SetService {
	/*
	 * Set(집합, 주머니를 연상!)
	 * - 저장 순서가 유지되지 않는다.
	 * - 중복값을 허용하지 않는다.
	 * - Set은 index가 존재하지 않는다.
	 */
	public void example1() {
		
		Set<String> set1 = new HashSet<String>();
		// HashSet : Hash 함수를 이용하여 중복검사 및 처리속도를 증가시킨 Set
		// --> HashXXX 사용 조건 : 내부에 저장하려는 객체들이
		//						HashCode()와 equals() 메소드가 오버라이딩 되어 있어야 한다.
		// HashCode()와 equals()가 오버라이딩 되어있는 String을 이용해서
		// Set의 특징을 파악해보자
		
		set1.add(new String("원격 들을만 하세요?"));
		set1.add(new String("네"));
		set1.add(new String("편해요?"));
		set1.add(new String("네"));
		
		System.out.println(set1); // 순서 유지 x, 중복 저장 x
		
		// HashCode(), equals()를 정말로 오버라이딩 해야되나 확인
		// 기존 Student2 클래스는 오버라이딩 안되어있다.
		Set<Student2> set2 = new HashSet<>();
								// 생성자에 제네릭을 <> 이런식으로 적으면
								// 변수 선언부의 제네릭을 자동으로 따라함 --> 타입 추론

		set2.add(new Student2("홍길동", 50, 20));
		set2.add(new Student2("고길동", 80, 40));
		set2.add(new Student2("아이유", 100, 28));
		set2.add(new Student2("홍길동", 50, 20));
		
		System.out.println(set2); // 홍길동의 중복제거 여부 확인
		
		// Set은 일반 for으로 다룰 수 있을까?
		// Set --> index가 없다 --> 순서 유지가 안 된다.
		// 일반 for문 이용한 접근 시 --> index가 필요함
		
		System.out.println("----------------------------------------");
		
		// 1. 향상된 for문(for each문)
		for(Student2 std : set2) {
			System.out.println(std);
		}
		
		System.out.println("----------------------------------------");
		
		// 2. Set -> List에 순서대로 담는다 --> 순서(index)가 생김
		List<Student2> list = new ArrayList<Student2>(set2);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("----------------------------------------");
		
		// 3. Iterator 반복자(반복접근자)를 이용해서 순서대로 접근
		Iterator<Student2> it = set2.iterator();
		
		while(it.hasNext()) {
			// hasNext() : 다음에 반복 접근할 객체가 존재하는지 -> 있으면 true 없으면 false
			System.out.println(it.next());
			// next() : 다음 요소를 꺼내옴(반환 받음)
			
			
		}
		
		
		
		
		
		
	}


}
