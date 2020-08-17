package com.kh.collection.list.part1.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.collection.list.part1.model.vo.Book;

public class ListService {
	
	/* 컬렉션(Collection) : 자바에서 제공하는 자료구조를 담당하는 프레임워크
	 * 
	 * 컬렉션은 총 3가지의 인터페이스로 이루어짐
	 * -> List, Set , Map
	 * 
	 * List와 Set은 구조적인 공통점인 많이 존재하여 이를 추상화한 인터페이스가 존재하는데
	 * 그 인터페이스 이름도 Collection
	 * 
	 * List, Set  vs  Map 차이점 : 데이터 보관 방식
	 * 1) List, Set : 객체(인스턴스) 저장
	 * 2) Map : Key와 Value 쌍으로 데이터를 저장
	 * 			-> Key라는 별도 객체를 만들고 이에 매칭되는 실제 객체를 Value에 작성 
	 */
	
	// List
	// 1. List는 데이터의 순서를 유지한다.
	// 2. 중복값을 저장할 수 있다.
	// --> List는 데이터가 index로 구분되어 관리됨
	
	// 제네릭스(Generics) : < >
	/* - 클래스, 메소드, 컬렉션 내부에서 사용할 데이터의 타입을 한 종류로 제한하는 기능
	 * - 컬렉션에 여러 타입이 저장되면 사용 시마다 타입을 검사하고 형변환 하는 
	 * 	번거로운 과정이 추가된다.
	 * -> 제네릭 사용 시 하나의 타입으로만 컬렉션에 데이터가 저장되므로 
	 * 		별도의 검사, 형변환이 필요 없음
	 * 
	 * -- 제네릭 사용의 이점 : 컴파일 단계에서 강력한 타입 체크 가능
	 */
	
	public void example() {
		
		// List 인터페이스는 모든 List계열의 최상위 부모
		// 인터페이스는 객체 생성은 불가능하지만 부모타입 팜조 변수로는 사용가능
		List<Book> list = new ArrayList<Book>(3);
		// -> Book만 저장할 수 있는 3칸짜리 ArrayList 객체 생성
		// 그 주소를 부모타입 참조변수 list에 저장
		
		// 1. List에 저장된 내용 모두 출력
		System.out.println(list); // 안에 아무것도 없음
		
		// 2. add(E e) : 리스트의 제일 끝 부분에 데이터를 추가하는 메소드
		System.out.println("--------------------------------");
		System.out.println("add(E e)");
		list.add(new Book("자바의 정석", "남궁성", 30000));
		list.add(new Book("오라클의 정석", "오라클", 40000));
		list.add(new Book("어린왕자", "생택쥐베리", 10000));
		
		// 초기 크기 3보다 더 많은 데이터 입력2.
		list.add(new Book("해리포터", "J.K.롤링", 9000));

		System.out.println(list);
		
		// 향상된 for문(for each문)
		// 배열 또는 컬렉션 객체에 저장된 값을 순서대로 접근하여
		// 그 값을 지정된 변수에 저장하여 for문 내에서 사용함
		
		for(Book b : list) {
			System.out.println(b);
		}
		
		// 3. add(int index, E e) : List에 지정된 index에 데이터를 추가하는 메소드
		System.out.println("---------------------------------------");
		System.out.println("add(int index, E e)");
		
		list.add(1, new Book("삼국지", "이문열", 100000));
		
		for(Book b : list) {
			System.out.println(b);
		}
		
		// 4. set(int index, E e) : 해당 인덱스의 값을  e로 변경하는 메소드
		System.out.println("-------------------------------------");
		System.out.println("set(int index, E e)");
		list.set(0, new Book("자바의 정석 - 기초편", "남궁성", 25000));
		
		for(Book b : list)
		{
			System.out.println(b);
		}
		
		// 5. size() : 리스트 내부에 존재하는 데이터의 개수
		System.out.println("------------------------------------");
		System.out.println("size()");
		System.out.println("list 안에 존재하는 데이터의 개수 " + list.size());
		
		// 6. remove(int index) : 해당 인덱스에 있는 객체를 제거
		System.out.println("--------------------------------------");
		System.out.println("remove(int index)");
		list.remove(2);
		
		for(Book b: list) {
			System.out.println(b);
		}
		
		// 7. get(int index) : 해당 인덱스의 있는 객체를 얻어옴.
		System.out.println("-----------------------------------");
		System.out.println("get(int index)");
		
		System.out.println(list.get(1)); // 객체배열로 치면 list[1]과 같은 의미
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + "번 인덱스 : " + list.get(i));
		}
		
		
		// 8. indexOf(E e)
		// list 앞(0번 인덱스)에서부터 검사하여 같은 객체가 있는 인덱스를 반환
		// 없으면 -1반환
		// -> 같은 객체인지(동등객체) 판별하기 위해서는  equals
		System.out.println("--------------------------------------");
		System.out.println("indexOf(E e)");
		
		int index = list.indexOf(new Book("삼국지", "이문열", 100000));
		
		System.out.println(index);
		index = list.indexOf(new Book("원격 수업 방벙", "노동부", 0));
		System.out.println(index);
		
		// 9.isEmpty() : 리스트가 비어있는지 확인하는 메소드
		System.out.println("------------------------------------");
		System.out.println("isEmpty");
		System.out.println(list.isEmpty());
		
		
		// 10. clear() : 리스트에 저장된 내용을 모두 삭제
		System.out.println("----------------------------------");
		System.out.println("clear()");
		
		list.clear();
		
		System.out.println(list.isEmpty());
		System.out.println(list);

	}

}
