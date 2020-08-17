package com.kh.collection.set.part2.model.service;

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetService {

	public void example() {
		/*
		 * TreeSet : Set Ư¡ + ���� Ʈ�� Ư¡
		 * - �ߺ� ������ �� �ǰ�, �ԷµǴ� �����Ͱ� ���� Ʈ���� ����Ǿ�
		 * 	�ڵ����� �������� ���ĵǴ� Ư¡�� �ִ�.
		 */
		
		Set<String> set1 = new TreeSet<String>();
		
		set1.add(new String("�ٴٴ�"));
		set1.add(new String("����"));
		set1.add(new String("������"));
		set1.add(new String("������"));
		set1.add(new String("������"));
		set1.add(new String("������"));
		set1.add(new String("īīī"));
		set1.add(new String("īīī"));
		
		// ���� Ʈ�� ���� ������ ���ؼ���
		// TreeSet�� ����Ǵ� ��ü�� Comparable �������̽��� ��ӹ޾�
		// compareTo() �޼ҵ带 �������̵� �س�����
		// --> �׷��� String�� �� �Ǿ��ִ�.
		
		for(String s : set1) {
			System.out.println(s);
		}
		
		
		// ������ �����ϴ� Set�� ����� �ʹ�.
		// �׷��� Set�� ���� Collection�� ��ü�� ���� ����
		// ������ �⺻�ڷ��� �̹Ƿ� �׳��� �Ұ�����
		// ������ int�� Wrapper Class�� Integer �����ϸ� ����
		Set<Integer> set2 = new TreeSet<Integer>();
		
		set2.add(new Integer(10));
		set2.add(5); // 5�� �ڷ����� int ������
					// integer�� �����ϴ� Set�� �߰��� ������
					// ��? Auto Boxing ������
		set2.add(1);
		set2.add(7);
		set2.add(30);
		set2.add(25);
		
		System.out.println("-------------------------------");
		
		// Iterator�� �ݺ����� �Ͽ� ����ϱ�
		Iterator<Integer> it = set2.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// TreeSet�� �̿��� �ζ� ��ȣ ������
		System.out.println("-----------------------------");
		
		Set<Integer> lotto = new TreeSet<Integer>();
		
		for(int i=0; lotto.size()<6; i++) {
			int randomNum = (int)(Math.random()*45) + 1;
			lotto.add(randomNum);
		}
		System.out.println(lotto);
	}
}
