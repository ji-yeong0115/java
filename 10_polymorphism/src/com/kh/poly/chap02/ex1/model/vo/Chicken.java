package com.kh.poly.chap02.ex1.model.vo;

public class Chicken extends Bird {

	@Override
	public String fly() {
		return "날긴 나는데 오래 못 남.";
	}

	// animal 인터페이스로부터 상속받은 메소드
	@Override
	public String breath() {
		return "우렁찬 꼬기오를 위해 복식호흡을 한다.";
	}

	@Override
	public String eat() {
		return "모이를 부리로 쪼아 먹는다.";
	}

}
