package com.kh.inherit.chap01.model.vo;

public class Product {
	// Computer, Cup, Car Ŭ�������� ����Ǿ��� �κ��� �ۼ���
	
	private String pName;
	private int price;
	
	// �⺻ ������
	public Product() {}

	// �Ű� ������ �ִ� ������
	public Product(String pName, int price) {
		this.pName = pName;
		this.price = price;
	}

	// ����� get / setter ����
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
// -----------------------------------------------------
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String selectField() {
		return pName + " / " + price;
	}
}
