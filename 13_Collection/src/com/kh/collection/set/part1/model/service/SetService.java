package com.kh.collection.set.part1.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.kh.collection.set.part1.model.vo.Student2;

public class SetService {
	/*
	 * Set(����, �ָӴϸ� ����!)
	 * - ���� ������ �������� �ʴ´�.
	 * - �ߺ����� ������� �ʴ´�.
	 * - Set�� index�� �������� �ʴ´�.
	 */
	public void example1() {
		
		Set<String> set1 = new HashSet<String>();
		// HashSet : Hash �Լ��� �̿��Ͽ� �ߺ��˻� �� ó���ӵ��� ������Ų Set
		// --> HashXXX ��� ���� : ���ο� �����Ϸ��� ��ü����
		//						HashCode()�� equals() �޼ҵ尡 �������̵� �Ǿ� �־�� �Ѵ�.
		// HashCode()�� equals()�� �������̵� �Ǿ��ִ� String�� �̿��ؼ�
		// Set�� Ư¡�� �ľ��غ���
		
		set1.add(new String("���� ������ �ϼ���?"));
		set1.add(new String("��"));
		set1.add(new String("���ؿ�?"));
		set1.add(new String("��"));
		
		System.out.println(set1); // ���� ���� x, �ߺ� ���� x
		
		// HashCode(), equals()�� ������ �������̵� �ؾߵǳ� Ȯ��
		// ���� Student2 Ŭ������ �������̵� �ȵǾ��ִ�.
		Set<Student2> set2 = new HashSet<>();
								// �����ڿ� ���׸��� <> �̷������� ������
								// ���� ������� ���׸��� �ڵ����� ������ --> Ÿ�� �߷�

		set2.add(new Student2("ȫ�浿", 50, 20));
		set2.add(new Student2("��浿", 80, 40));
		set2.add(new Student2("������", 100, 28));
		set2.add(new Student2("ȫ�浿", 50, 20));
		
		System.out.println(set2); // ȫ�浿�� �ߺ����� ���� Ȯ��
		
		// Set�� �Ϲ� for���� �ٷ� �� ������?
		// Set --> index�� ���� --> ���� ������ �� �ȴ�.
		// �Ϲ� for�� �̿��� ���� �� --> index�� �ʿ���
		
		System.out.println("----------------------------------------");
		
		// 1. ���� for��(for each��)
		for(Student2 std : set2) {
			System.out.println(std);
		}
		
		System.out.println("----------------------------------------");
		
		// 2. Set -> List�� ������� ��´� --> ����(index)�� ����
		List<Student2> list = new ArrayList<Student2>(set2);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("----------------------------------------");
		
		// 3. Iterator �ݺ���(�ݺ�������)�� �̿��ؼ� ������� ����
		Iterator<Student2> it = set2.iterator();
		
		while(it.hasNext()) {
			// hasNext() : ������ �ݺ� ������ ��ü�� �����ϴ��� -> ������ true ������ false
			System.out.println(it.next());
			// next() : ���� ��Ҹ� ������(��ȯ ����)
			
			
		}
		
		
		
		
		
		
	}


}
