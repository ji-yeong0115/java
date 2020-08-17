package com.kh.poly.chap02.ex1.model.vo;

public abstract class Bird implements Animal {

	public static final int BIRD_LEG = 2;
	private String wingType;
	
	// �⺻ ������ : �����ڸ� ���� �� ������ �ش� �����ڷ� ���� ��ü ������ ���� �� ��
	// 			�ڽ��� super()�����ڸ� ����ؾ� �ǹǷ�
	public Bird() {}
	
	// �� �� �ְų�, �� �� ���ų�. ���ƴ� �ٴϳ� ����� �ٸ��ų� �� �� �ִ�.
	// -> ��ü������ �ʰ�, ��Ȯ���� --> �߻� �޼ҵ�
	public abstract String fly();

	public String flappingWing() {
		return "������ �ĴڰŸ�";
	}
	
	public String getWingType() {
		return wingType;
	}

	public void setWingType(String wingType) {
		this.wingType = wingType;
	}

}
