package com.kh.object.chap01_abstracion.model.service;
import com.kh.object.chap01_abstracion.model.vo.Student;

public class AbstractionService {

	public void createStudent() {
		
		Student std = new Student(); // 학생 객체 생성
		
		// 비어있는 학생 객체(std)에 속성(정보) 입력
		std.name = "김지영";
		std.age = 23;
		std.gender = '여';
		std.studentNumber = 12345;
		std.schoolName = "kh";
		std.grade = "A+";
		
		// 기능 수행
		std.attendance();
		std.study();
		std.test();
		std.eat();
		System.out.printf("%s 학생은 %d세 %c자 이며 학번은 %d 입니다."
				, std.name, std.age, std.gender, std.studentNumber);
		
	}
}
