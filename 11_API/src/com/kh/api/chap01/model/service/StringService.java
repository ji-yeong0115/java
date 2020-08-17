package com.kh.api.chap01.model.service;

import java.util.Scanner;

public class StringService {
	// String 클래스
	// - immutable(불변) 객체로 한 번 지정된 문자열은 수정 불가능
	// --> 수정 시 새로운 문자열 객체가 생성되고 해당 주소를 반환함
	
	public void example1() {
		
		// 1) String 값 수정 시 주소가 바뀌는지 확인

		String s1 = "ABC";
		
		// String의 hashCode()는 문자열을 이용하여 동일 비교하는 것이기 때문에
		// 주소가 같은지 확인하는데는 부적절
		//System.out.println(s1.hashCode());
		
		
		// --> System.identityHashCode() 사용
		// : 객체의 실제 저장 주소를 이용하여 hashCode()를 만드는 메소드
		System.out.println("변경 전 s1 : " + System.identityHashCode(s1));
		
		s1 = "ABCD"; // s1 수정
		
		System.out.println("변경 후 s1 : " + System.identityHashCode(s1));
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		
		// String LIteral(리터럴)로  String 값 지정 시 같은 문자열일 경우 같은 주소를 반환한다.
		// + String Pool
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str1 == str2 : " + (str1 == str2));
		
		String str3 = new String("Hello");
		System.out.println("str3 : " + str3);
		
		System.out.println("str1 == str3 : " + (str1 == str3));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("st4 입력 : ");
		String str4 = sc.nextLine();
		
		System.out.println("변경 후 s1 : " + System.identityHashCode(str1));
		System.out.println("변경 후 s1 : " + System.identityHashCode(str4));
		System.out.println("str1 == str4 : " + (str1 == str4));
		
		System.out.println("String 동등비료가 필요하면 .equals() 사용할 것");
		System.out.println("String은 불변이다.");
		
		
		
	}

	public void example2() {	
		//StringBuffer
		// -> 문자열 수정이 가능한 mutable(가변) 객체
		
		// StringBuffer 객체를 기본생성자로 생성 시 기본 버퍼크기 16을 할당함
		StringBuffer sb = new StringBuffer();
		
		// capacity() : 용량 확인
		System.out.println("sb.capacity() : " + sb.capacity());
		
		// StringBuffer 클래스는 hashCode()를 오버라이딩 하지 않음
		// object.hashCode() : 객체 주소를 이용하여 해시코드 생성 
		System.out.println("추가 후 sb.hashCode : " + sb.hashCode());
		
		// append() : 기존 문자열 뒤에 추가
		sb.append("java api");
		System.out.println("sb.capacity() : " + sb.capacity());
		System.out.println("추가 후 sb.hashCode : " + sb.hashCode());
		
		
		 // 기존 용량인 16을 초과 (현재 18) -> (기존용량 + 1) * 2
		sb.append("1234567890");
		System.out.println("sb.capacity() : " + sb.capacity());
		System.out.println("추가 후 sb.hashCode : " + sb.hashCode());
		// 기존에 있었던 주소 그대로 용량만 늘어난다.
		
		// 참조변수를 출력하면 자동으로 toString()이 붙는다.
		System.out.println("sb : " + sb /* toString() */);
		
		// StringBuffer를 String으로 반환한는 방법
		// toString() : 필드 정보를 문자열로 출력/반환
		String str = sb.toString();
	
	}

	public void example3() {
		// String.split(구분자);
		// --> 문자열을 해당 구분자를 기준으로 쪼개어 String[] 형태로 반환
		
		String str  = "사과, 포도, 참외, 오렌지, 수박, 멜로, 복숭아, 자두";
		
		// , (공백)을 구분자로 하여 분해
		String[] arr = str.split(", ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
















}
