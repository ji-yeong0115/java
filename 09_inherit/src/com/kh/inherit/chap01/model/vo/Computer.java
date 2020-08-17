package com.kh.inherit.chap01.model.vo;

// Computer 클래스가 Product 클래스를 상속 --> 상속 키워드 extends(확장하다)
// 부모의 멤바 + 자식의 멤버  -> 부모보다 몸집이 확장된다.
public class Computer extends Product {
	
	private String cpu;
	private int ram;
//	private String pName;
//	private int price;
	
	public Computer() {
		
		// super()의 기본 생성자는 작성하지 않아도 JVM에 의해 컴파일 단계에서 자동으로  생성자 제일 위쪽에 추가된다.
		super(); 
	}

	// alt + shift + s -> o
	public Computer(String cpu, int ram, String pName, int price) {
		this.cpu = cpu;
		this.ram = ram;
//		this.pName = pName;
//		this.price = price;
	}

	// alt + shift + s -> r : gettter / setter
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
// ---------------------------------------------------
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
// ---------------------------------------------------
/*	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
// ---------------------------------------------------
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
*/	
	// 필드 정보 모두 반환하는 메소드
	public String selectField() {
		return cpu + " / " + ram + " / "; // + pName + " / " + price;
	}
	
}
