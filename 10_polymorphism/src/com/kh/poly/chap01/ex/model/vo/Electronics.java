package com.kh.poly.chap01.ex.model.vo;

public class Electronics {
	
	private boolean power; // ���� on/off
	private String brand; // ������
	private String sNum; // �ø��� �ѹ�(��ǰ��ȣ)
	
	// �⺻������
	public Electronics() {}

	// �Ű����� �ִ� ������
	public Electronics(boolean power, String brand, String sNum) {
		super();
		this.power = power;
		this.brand = brand;
		this.sNum = sNum;
	}

	// getter / setter
	public boolean isPower() {
		return power;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getsNum() {
		return sNum;
	}
	
	public void setsNum(String sNum) {
		this.sNum = sNum;
	}

	// toString
	@Override
	public String toString() {
		return "power = " + power + ", brand = " + brand + ", sNum = " + sNum ;
	}

}
