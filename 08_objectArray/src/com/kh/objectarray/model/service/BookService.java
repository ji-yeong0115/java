package com.kh.objectarray.model.service;
import java.util.Scanner;
import com.kh.objectarray.model.vo.Book;

public class BookService {
	// Book ��ü 5���� �Ű����� �ִ� �����ڸ� �̿��Ͽ� ���� �� å ������ �Է� �޾� 
	// �ش� å�� �ִ��� �˻��Ͽ� ������ Book ��ü�� �ʵ����� ���
	// ������ "�ش��ϴ� å�� �����ϴ�."���

	// �ʵ忡 ��ĳ�� ��ü�� �����Ͽ� Ŭ���� ���ο��� ��� ��� ����
	private Scanner sc = new Scanner(System.in);
	
	public void serchBookV1() {
		
		// ý 5�� ��ü ����
		Book book1 = new Book("�ڹ��� ����", 30000, 0.2, "���ü�");
		Book book2 = new Book("c����� ����", 50000, 0.1, "��ö��");
		Book book3 = new Book("�� �ڹ� ��մ�", 100000, 0.05, "�鵿��");
		Book book4 = new Book("�����", 10000, 10, "�����㺣��");
		Book book5 = new Book("�ظ�����", 12000, 0.3, "����K�Ѹ�");
		
		// �˻��� å ���� �Է� �ޱ�
		System.out.print("�˻��� å ������ �Է��ϼ��� : ");
		String title = sc.nextLine();
		
		if(book1.getTitle().equals(title)) {
			// book1�� ����� �Է¹��� ������ ���� ���
			System.out.println(book1.selectBook());
			
		}else if(book2.getTitle().equals(title)) {
			System.out.println(book2.selectBook());
			
		}else if(book3.getTitle().equals(title)) {
			System.out.println(book3.selectBook());
		}
		else if(book4.getTitle().equals(title)) {
			System.out.println(book4.selectBook());
		}
		else if(book5.getTitle().equals(title)) {
			System.out.println(book5.selectBook());
		}else{	
			System.out.println("�ش��ϴ� å�� �����ϴ�.");
		}
	}
	
	// ��ü �迭�� �̿��Ͽ� å �˻��ϱ�
	public void serchBookV2() {
		
		Book[] books = new Book[5];
		
		books[0] = new Book("�ڹ��� ����", 30000, 0.2, "���ü�");
		books[1] = new Book("c����� ����", 50000, 0.1, "��ö��");
		books[2] = new Book("�� �ڹ� ��մ�", 100000, 0.05, "�鵿��");
		books[3] = new Book("�����", 10000, 10, "�����㺣��");
		books[4] = new Book("�ظ�����", 12000, 0.3, "����K�Ѹ�");
		
		/* ����, �Ҵ�, �ʱ�ȭ�� ����
		 * 
		 * Book[] books = {
		 * 		new Book("�ڹ��� ����", 30000, 0.2, "���ü�"),
		 * 		new Book("c����� ����", 50000, 0.1, "��ö��"),
		 * 		new Book("�� �ڹ� ��մ�", 100000, 0.05, "�鵿��"),
		 *  	new Book("�����", 10000, 10, "�����㺣��"),
		 *  	new Book("�ظ�����", 12000, 0.3, "����K�Ѹ�")
		 * };
		 * 
		 */
		
		// å ���� �Է� �ޱ�
		System.out.print("�˻��� å ������ �Է��ϼ��� : ");
		String title = sc.nextLine();
		
		boolean flag = true;
		
		for(int i=0; i<books.length; i++) {
			if(books[i].getTitle().equals(title)) {
				// book�� i��° �ε��� ����� Title�� �Է¹��� ���� ���ٸ�
				System.out.println(books[i].selectBook());
				flag = false; // �˻��� �� ���
				break;
			}
		}
		if(flag) {
			System.out.println("�ش�Ǵ� å�� �����ϴ�.");
		}
	}
}
