package com.kh.inherit.chap02.model.sevice;
import com.kh.inherit.chap02.model.vo.Book;
import com.kh.inherit.chap02.model.vo.JavaBook;

public class OverrideService {
		public void example1() {
			Book book1 = new Book();
			
			book1.setTitle("�ڹ��� ����");
			book1.setAuthor("���� ��");
			book1.setPrice(30000);
			
			System.out.println("book1.toString : " + book1.toString());
			
			// toString()�� �������̵� �ؼ� ����� ��� ���������� ����ϴ� ��쿡 
			// JVM�� ���� ������ �ܰ迡�� �ڵ����� .toString()�� �߰��� 
			System.out.println("book1 : " + book1);
			
			
/*			// �⺻ �ڷ����� ==�̶�� �񱳿����ڸ� ����Ͽ� ���� �������� ��
			int num1 = 10;
			int num2 = 20;
			if(num1 == num2) {
				System.out.println("num1�� num2�� ����.");
			}
			
			// String �� ��
			// String.equals()�� �� ���ڿ����� �� ���ڵ��� ���� �������� �Ǻ��ϵ���
			// �������̵��� �Ǿ� ����
			String str1 = "Hello";
			String str2 = "Hello";
			
			if(str1.equals(str2)) {
				System.out.println("str1�� str2�� ����.");
			}
*/

			// equals �������̵� �׽�Ʈ
			Book book2 = new Book("�ڹ��� ����", "���� ��", 30000);
			
			if(book1.equals(book2)){ // book1�� book2�� ���� ��ü���� ��
				System.out.println("���� å�̴�.");
			}else {
				System.out.println("�ٸ� å�̴�.");
			}
			
			Book book3 = new Book("������ ����", "������", 20000);
			
			if(book1.equals(book3)) {
				System.out.println("���� å�̴�.");
			}else {
				System.out.println("�ٸ� å�̴�.");
			}
			
			System.out.println("=============================");
			
			JavaBook jb = new JavaBook();
			System.out.println(jb.informationTransfer());
			
			/* ���ε�(Binding)
			 * 
			 * 
			 * 
			 * 
			 */
			
			
			
		}
}
