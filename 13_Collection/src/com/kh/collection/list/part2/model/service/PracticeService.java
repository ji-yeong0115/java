package com.kh.collection.list.part2.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.collection.list.part2.model.vo.Student;

public class PracticeService {
	
	private List<Student> list = new ArrayList<Student>();
	// Student 객체(객체 참조 변수)를 저장할 수 있는
	// ArrayList를 할당 받아 그 주소를  list에 저장
	// + ArrayList 생성 시 기본생성자를 사용하면 기본 10칸이 할당된다.
	
	public boolean addStudent(Student std) {
		return list.add(std);
		
	}
	
	public List<Student> selectAllStudent() { 
		return list;
		// 부모타입의 참조변수로 자식타입을 참조
	}
	
	
	public Student removeStudent(int index) { 

		Student std = null; // 삭제되는 학생의 정보를 저장할 변수
		
		// 1) 전달받은 index의 값이 배열의 범위 내에 있는 값인가?
		if(index >= 0 && index < list.size()) {
			
			// 2) 삭제 된 학생 정보를 변화 -> 삭제 전에 별도의 변수에 저장
			// + 뒤쪽 값 당겨주기
			std = list.remove(index);
		}
		
		return std;
	}
}

