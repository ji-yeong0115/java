package com.kh.inherit.chap02.model.vo;

public class JavaBook extends Book{
	
	@Override
	public String informationTransfer() {
		return "자바 공부를 하는 사람들에게 자바 정보를 전달한다.";
	}
}
