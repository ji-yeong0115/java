package com.kh.object.chap01_abstracion.model.vo;

// 컴퓨터 내부에 학생이라는 객체를 만들기 위한 설계도(클래스) 작성
// * 클래스 작성 시 객체지향언언의 특징 중 하나인 추상화가 적용 되어야 함
public class Student { // 학생을 추상화한 클래스

	// ----- 속성 -----
	// 이름. 나이. 성별, 학번, 학교, 성적
	
	public String name; // 이름
	public int age; // 나이
	public char gender; // 성별
	public int studentNumber; // 학번
	public String schoolName; // 학교
	public String grade; // 성적
	
	// ----- 기능 -----
	// 공부, 출석, 시험, 급식
	
	public void study() {
		System.out.println(name + "학생이 공부를 시작했습니다.");
	}
	
	public void attendance() {
		System.out.println(name + "학생이 " + schoolName + "학교에 출석했습니다.");
	}
	
	public void test() {
		System.out.println(name + "학생이 시험을 보고 " + grade + "를 받았습니다.");
	}
	
	public void eat() {
		System.out.println(name + "학생이 급식을 먹었습니다.");
	}
	
}
