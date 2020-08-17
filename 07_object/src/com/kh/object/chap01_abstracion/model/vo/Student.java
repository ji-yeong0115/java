package com.kh.object.chap01_abstracion.model.vo;

// ��ǻ�� ���ο� �л��̶�� ��ü�� ����� ���� ���赵(Ŭ����) �ۼ�
// * Ŭ���� �ۼ� �� ��ü�������� Ư¡ �� �ϳ��� �߻�ȭ�� ���� �Ǿ�� ��
public class Student { // �л��� �߻�ȭ�� Ŭ����

	// ----- �Ӽ� -----
	// �̸�. ����. ����, �й�, �б�, ����
	
	public String name; // �̸�
	public int age; // ����
	public char gender; // ����
	public int studentNumber; // �й�
	public String schoolName; // �б�
	public String grade; // ����
	
	// ----- ��� -----
	// ����, �⼮, ����, �޽�
	
	public void study() {
		System.out.println(name + "�л��� ���θ� �����߽��ϴ�.");
	}
	
	public void attendance() {
		System.out.println(name + "�л��� " + schoolName + "�б��� �⼮�߽��ϴ�.");
	}
	
	public void test() {
		System.out.println(name + "�л��� ������ ���� " + grade + "�� �޾ҽ��ϴ�.");
	}
	
	public void eat() {
		System.out.println(name + "�л��� �޽��� �Ծ����ϴ�.");
	}
	
}
