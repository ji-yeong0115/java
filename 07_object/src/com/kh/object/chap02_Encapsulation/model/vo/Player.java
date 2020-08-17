package com.kh.object.chap02_Encapsulation.model.vo;

// vo(Value Object) : ��(������)�� ������ �� �ִ� ��ü�� ����� ���� Ŭ����

public class Player { // ������� �߻�ȭ�� Ŭ����
	
	// ----- �Ӽ� -----
	// * ĸ��ȭ ��Ģ : Ŭ������ ��� ����(�ʵ�)�� private�� �ٿ� �ܺηκ����� ���� ������ ����

	// public String name; // ĸ��ȭ ������
	
	private String name; // �̸�
	private String event; // ����
	private String uniform; // ������
	private boolean kookdae; // ������ǥ ����
	
	// ----- ��� -----
	// Ŭ���� ���ο� ���� �� �ִ� ����� ����
	// 1) ��� ����(�ʵ�)�� �̿��� ���� ó���� �ϴ� ���
	// 2) �Ӽ�(��� ����, �ʵ�)�� �ܺο��� ���� ������ �� �ִ� ���
	//   --> getter / setter �޼ҵ�
	
	// name�� ���� get/setter �ۼ�
	
	// getter : ��ü�� ���� �ܺη� ��ȯ�ϴ� ����� ������ �޼ҵ� 
	// �ܺο��� ������ �� �ֵ��� public���� ����
	public String getName() {
		// --> String (��ȯ��) : �޼ҵ� ���� �� ��ȯ�Ǵ� ���� �ڷ���
		
		
		// return : �޼ҵ� ���� �� ȣ���� ������ ���������� ���� �ۼ�
		// �ܺο��� getName() ȣ�� �� ��ü�� ����Ǿ� �ִ� name ��ȯ
		return name;
	}
	
	// setter : ��ü�� ���� ����ϴ� ����� ������ �޼ҵ�
	// �ܺο��� ������ �� �ֵ��� public���� ����
	public void setName(String name) {
						// �Ű�����(�Ķ����)
						// �޼ҵ� ȣǮ �� ���޵Ǵ� ���� �޾ƿ�
						// �ش� ��� ���� �� �ʿ��� ��
		
		// this : ���� ��ü�� ���� �ּҸ� ����Ŵ (���� ��ü�� ����Ŵ)
		this.name = name;
	}
	
	// event get/setter �ۼ�
	// getter
	// public ��ȯ�� get ������() { return �ʵ�(����)��; } // ������ ������ �빮��
	public String getEvent() {
		return event;
	}
	
	// setter
	// public void set������(�ڷ��� �Ű�����) { thils.�ʵ�� = �Ű������� }
	// ������ ������ �빮��, �Ű������� set�Ϸ��� �ʵ�� ���� �ڷ��� ������ �ۼ�
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
