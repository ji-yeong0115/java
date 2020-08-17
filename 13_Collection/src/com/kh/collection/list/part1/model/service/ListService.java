package com.kh.collection.list.part1.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.collection.list.part1.model.vo.Book;

public class ListService {
	
	/* �÷���(Collection) : �ڹٿ��� �����ϴ� �ڷᱸ���� ����ϴ� �����ӿ�ũ
	 * 
	 * �÷����� �� 3������ �������̽��� �̷����
	 * -> List, Set , Map
	 * 
	 * List�� Set�� �������� �������� ���� �����Ͽ� �̸� �߻�ȭ�� �������̽��� �����ϴµ�
	 * �� �������̽� �̸��� Collection
	 * 
	 * List, Set  vs  Map ������ : ������ ���� ���
	 * 1) List, Set : ��ü(�ν��Ͻ�) ����
	 * 2) Map : Key�� Value ������ �����͸� ����
	 * 			-> Key��� ���� ��ü�� ����� �̿� ��Ī�Ǵ� ���� ��ü�� Value�� �ۼ� 
	 */
	
	// List
	// 1. List�� �������� ������ �����Ѵ�.
	// 2. �ߺ����� ������ �� �ִ�.
	// --> List�� �����Ͱ� index�� ���еǾ� ������
	
	// ���׸���(Generics) : < >
	/* - Ŭ����, �޼ҵ�, �÷��� ���ο��� ����� �������� Ÿ���� �� ������ �����ϴ� ���
	 * - �÷��ǿ� ���� Ÿ���� ����Ǹ� ��� �ø��� Ÿ���� �˻��ϰ� ����ȯ �ϴ� 
	 * 	���ŷο� ������ �߰��ȴ�.
	 * -> ���׸� ��� �� �ϳ��� Ÿ�����θ� �÷��ǿ� �����Ͱ� ����ǹǷ� 
	 * 		������ �˻�, ����ȯ�� �ʿ� ����
	 * 
	 * -- ���׸� ����� ���� : ������ �ܰ迡�� ������ Ÿ�� üũ ����
	 */
	
	public void example() {
		
		// List �������̽��� ��� List�迭�� �ֻ��� �θ�
		// �������̽��� ��ü ������ �Ұ��������� �θ�Ÿ�� ���� �����δ� ��밡��
		List<Book> list = new ArrayList<Book>(3);
		// -> Book�� ������ �� �ִ� 3ĭ¥�� ArrayList ��ü ����
		// �� �ּҸ� �θ�Ÿ�� �������� list�� ����
		
		// 1. List�� ����� ���� ��� ���
		System.out.println(list); // �ȿ� �ƹ��͵� ����
		
		// 2. add(E e) : ����Ʈ�� ���� �� �κп� �����͸� �߰��ϴ� �޼ҵ�
		System.out.println("--------------------------------");
		System.out.println("add(E e)");
		list.add(new Book("�ڹ��� ����", "���ü�", 30000));
		list.add(new Book("����Ŭ�� ����", "����Ŭ", 40000));
		list.add(new Book("�����", "�����㺣��", 10000));
		
		// �ʱ� ũ�� 3���� �� ���� ������ �Է�2.
		list.add(new Book("�ظ�����", "J.K.�Ѹ�", 9000));

		System.out.println(list);
		
		// ���� for��(for each��)
		// �迭 �Ǵ� �÷��� ��ü�� ����� ���� ������� �����Ͽ�
		// �� ���� ������ ������ �����Ͽ� for�� ������ �����
		
		for(Book b : list) {
			System.out.println(b);
		}
		
		// 3. add(int index, E e) : List�� ������ index�� �����͸� �߰��ϴ� �޼ҵ�
		System.out.println("---------------------------------------");
		System.out.println("add(int index, E e)");
		
		list.add(1, new Book("�ﱹ��", "�̹���", 100000));
		
		for(Book b : list) {
			System.out.println(b);
		}
		
		// 4. set(int index, E e) : �ش� �ε����� ����  e�� �����ϴ� �޼ҵ�
		System.out.println("-------------------------------------");
		System.out.println("set(int index, E e)");
		list.set(0, new Book("�ڹ��� ���� - ������", "���ü�", 25000));
		
		for(Book b : list)
		{
			System.out.println(b);
		}
		
		// 5. size() : ����Ʈ ���ο� �����ϴ� �������� ����
		System.out.println("------------------------------------");
		System.out.println("size()");
		System.out.println("list �ȿ� �����ϴ� �������� ���� " + list.size());
		
		// 6. remove(int index) : �ش� �ε����� �ִ� ��ü�� ����
		System.out.println("--------------------------------------");
		System.out.println("remove(int index)");
		list.remove(2);
		
		for(Book b: list) {
			System.out.println(b);
		}
		
		// 7. get(int index) : �ش� �ε����� �ִ� ��ü�� ����.
		System.out.println("-----------------------------------");
		System.out.println("get(int index)");
		
		System.out.println(list.get(1)); // ��ü�迭�� ġ�� list[1]�� ���� �ǹ�
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + "�� �ε��� : " + list.get(i));
		}
		
		
		// 8. indexOf(E e)
		// list ��(0�� �ε���)�������� �˻��Ͽ� ���� ��ü�� �ִ� �ε����� ��ȯ
		// ������ -1��ȯ
		// -> ���� ��ü����(���ü) �Ǻ��ϱ� ���ؼ���  equals
		System.out.println("--------------------------------------");
		System.out.println("indexOf(E e)");
		
		int index = list.indexOf(new Book("�ﱹ��", "�̹���", 100000));
		
		System.out.println(index);
		index = list.indexOf(new Book("���� ���� �溡", "�뵿��", 0));
		System.out.println(index);
		
		// 9.isEmpty() : ����Ʈ�� ����ִ��� Ȯ���ϴ� �޼ҵ�
		System.out.println("------------------------------------");
		System.out.println("isEmpty");
		System.out.println(list.isEmpty());
		
		
		// 10. clear() : ����Ʈ�� ����� ������ ��� ����
		System.out.println("----------------------------------");
		System.out.println("clear()");
		
		list.clear();
		
		System.out.println(list.isEmpty());
		System.out.println(list);

	}

}
