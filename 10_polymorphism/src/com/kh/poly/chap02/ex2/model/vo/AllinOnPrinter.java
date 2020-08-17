package com.kh.poly.chap02.ex2.model.vo;

public abstract class AllinOnPrinter implements Printer, Scanner {
	// �������̽��� ���� ����� �����ϴ�.
	// Ŭ���� ���� ��ӿ����� ���� ���
	
	// �߻� Ŭ���� -> �߻� �޼ҵ尡 0�� �̻� �����ϴ� Ŭ����
	
	private String brand; // ������
	private String pName; // ��ǰ��
	
	public AllinOnPrinter() {} // �⺻ ������
	// �߻� Ŭ����, �������̽��� �̿��Ͽ� ��ü�� ���� �� ����
	// --> �̿ϼ� Ŭ�����δ� ��ü ������ �Ұ���

	// �߻�Ŭ������ �� �����ڸ� �ۼ�?
	// �ڽ� ��ü ���� �� ���ο� �θ� �κ��� �����ϱ� ���ؼ� �ʿ�� ������
	// �̸� �̿��Ͽ� ���� �θ� ��ü�� ���� �� ����.
	
	public AllinOnPrinter(String brand, String pName) {
		super();
		this.brand = brand;
		this.pName = pName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	// �θ�ü�� ���ٸ� object�� �޼ҵ带 �������̵�
	@Override
	public String toString() {
		return "AllinONePrinter [ brand = " + brand + ", pName = " + pName + " ]";

	}
}
