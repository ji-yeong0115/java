package com.kh.object.chap02_Encapsulation.model.vo;

// vo(Value Object) : 값(데이터)를 보관할 수 있는 객체를 만들기 위한 클래스

public class Player { // 운동선수를 추상화한 클래스
	
	// ----- 속성 -----
	// * 캡슐화 원칙 : 클래스의 멤버 변수(필드)에 private을 붙여 외부로부터의 직접 접근을 차단

	// public String name; // 캡슐화 미적용
	
	private String name; // 이름
	private String event; // 종목
	private String uniform; // 유니폼
	private boolean kookdae; // 국가대표 여부
	
	// ----- 기능 -----
	// 클래스 내부에 만들 수 있는 기능의 종류
	// 1) 멤버 변수(필드)를 이용한 연산 처리를 하는 기능
	// 2) 속성(멤버 변수, 필드)를 외부에서 간접 접근할 수 있는 기능
	//   --> getter / setter 메소드
	
	// name에 대한 get/setter 작성
	
	// getter : 객체의 값을 외부로 반환하는 기능을 구현한 메소드 
	// 외부에서 접근할 수 있도록 public으로 선언
	public String getName() {
		// --> String (반환형) : 메소드 수행 후 반환되는 값의 자료형
		
		
		// return : 메소드 종료 시 호출한 곳으로 돌려보내는 값을 작성
		// 외부에서 getName() 호출 시 객체에 저장되어 있는 name 반환
		return name;
	}
	
	// setter : 객체에 값을 기록하는 기능을 구현한 메소드
	// 외부에서 접근할 수 있도록 public으로 선언
	public void setName(String name) {
						// 매개변수(파라미터)
						// 메소드 호풀 시 전달되는 값을 받아옴
						// 해당 기능 수행 시 필요한 값
		
		// this : 현재 객체의 시작 주소를 가리킴 (현재 객체를 가리킴)
		this.name = name;
	}
	
	// event get/setter 작성
	// getter
	// public 반환형 get 변수명() { return 필드(변수)명; } // 변수명 시작은 대문자
	public String getEvent() {
		return event;
	}
	
	// setter
	// public void set변수명(자료형 매개변수) { thils.필드명 = 매개변수명 }
	// 변수명 시작은 대문자, 매개변수는 set하려는 필드와 같은 자료형 변수명 작성
	public void setEvent(String event) {
		this.event = event;
	}
	
	// uniform get/setter
	public String getUniform() {
		return uniform;
	}
	public void setUniform(String niform) {
		this.uniform = uniform;
	}
	
	// kookdae get/setter
	public boolean getKookdae() {
		return kookdae;
	}
	public void setKookdae(boolean kookdae) {
		this.kookdae = kookdae;
	}
}
