package com.kh.object.practice.model.service;
import com.kh.object.practice.model.vo.Book;

public class BookService {
	
	public void practice() {
		
		// 1) �⺻ �����ڸ� �̿��Ͽ� ù ��° Book ��ü ����
		Book book1 = new Book();
		
		// 2) �Ű����� �����ڸ� �̿��Ͽ� �� ��° Book ��ü ����
		Book book2 = new Book("�ڹ��� ����", 30000, 0.2, "���ü�");
		
		// 3) ��ü�� ���� �ʵ� �� ��� Ȯ��
		System.out.println(book1.selctBook());
		System.out.println(book2.selctBook());
		
		// 4) ù ��° ��ü�� ���� ���� setter�� �̿��Ͽ� ����
		book1.setTitle("C���");
		book1.setPrice(30000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("ȫ�浿");
		
		System.out.println("============================");

		// 5) ������ ���� ��� Ȯ��
		System.out.println("������ ��� Ȯ��");
		
		System.out.println(book1.selctBook());
		
		System.out.println("============================");
		
		// 6) �� ��ü�� �������� ������ å ������ ����ؼ� ���
		// ���ε� ���� = ���� - (���� * ������)
		int sum1 = (int)(book1.getPrice() - (book1.getPrice() * book1.getDiscountRate()));
		int sum2 = (int)(book2.getPrice() - (book2.getPrice() * book2.getDiscountRate()));
		
		System.out.println("������  = " + book1.getTitle());
		System.out.println("���ε� ���� = " + sum1 + "��");
		System.out.println("������  = " + book2.getTitle());
		System.out.println("���ε� ���� = " + sum2 + "��");
	}
}
