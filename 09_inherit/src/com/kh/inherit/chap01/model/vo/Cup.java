package com.kh.inherit.chap01.model.vo;

public class Cup extends Product {
	
	private String brand;
	private double capacity;
//	private String pName;
//	private int price;

	public Cup() {}

	// ��ü�� �����ʰ� ���ÿ� �ʵ带 �Ű������� �Է¹��� ������ �ʱ�ȭ
	public Cup(String brand, double capacity, String pName, int price) {
		this.brand = brand;
		this.capacity = capacity;
		
		// �θ�κ��� ��ӹ��� pName�� price�� ���������ڰ� private�̹Ƿ� ���� ������ ���� ������
		// �θ�κ��� ��ӹ��� ���� ���� ��� setpName(), setPrice()�� �̿��Ͽ�
		// pName, price�� �ʱ�ȭ �� �� �ִ�.
		setpName(pName);
		setPrice(price);
		
//		this.pName = pName;
//		this.price = price;
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
// -------------------------------------------------
	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
// -------------------------------------------------
/*	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
// -------------------------------------------------
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
*/
	public String selectField() {
										// �θ� ��������� ���� ����
		return brand + " / " + capacity + " / " + getpName() + " / " + getPrice();
			//	+ pName + " / " + price;  --> �θ��� ��� ������ �������� �Ұ�
	}
	
	
}
