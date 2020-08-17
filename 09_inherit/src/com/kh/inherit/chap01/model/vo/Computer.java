package com.kh.inherit.chap01.model.vo;

// Computer Ŭ������ Product Ŭ������ ��� --> ��� Ű���� extends(Ȯ���ϴ�)
// �θ��� ��� + �ڽ��� ���  -> �θ𺸴� ������ Ȯ��ȴ�.
public class Computer extends Product {
	
	private String cpu;
	private int ram;
//	private String pName;
//	private int price;
	
	public Computer() {
		
		// super()�� �⺻ �����ڴ� �ۼ����� �ʾƵ� JVM�� ���� ������ �ܰ迡�� �ڵ�����  ������ ���� ���ʿ� �߰��ȴ�.
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
	// �ʵ� ���� ��� ��ȯ�ϴ� �޼ҵ�
	public String selectField() {
		return cpu + " / " + ram + " / "; // + pName + " / " + price;
	}
	
}
