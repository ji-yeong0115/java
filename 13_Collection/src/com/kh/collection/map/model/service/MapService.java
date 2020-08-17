package com.kh.collection.map.model.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.collection.map.model.vo.Snack;

public class MapService {
	public void example() {
		Map<String, Snack> map = new HashMap<String, Snack>();
		
		// 1. put(K key, V value)
		// Map�� K, V ������ �� ���� �߰��ϴ� �޼ҵ�
		map.put("�����", new Snack(1000, "�����", 450));
		map.put("������", new Snack(2000, "���ڸ�", 1500));
		map.put("����Ĩ", new Snack(2000, "�ܽ�����", 350));
		
		System.out.println(map);
		// Map�� Key�� �������� ��
		// Key�� Set�� Ư¡�� ���� --> ���� ���� X, �ߺ� X
		// ��, �ߺ��Ǵ� Key�� �ԷµǴ� ��� value�� ���������.
		
		map.put("�����", new Snack(1200, "�ſ�����", 500));
		System.out.println(map);
		
		// 2. get(K key)
		// Map���� �ش��ϴ� Key���� Value�� ��ȯ��
		System.out.println("-----------------------------------");
		System.out.println("get(K key)");
		
		System.out.println(map.get("������"));
		System.out.println(map.get("����Ĩ"));
		System.out.println(map.get("�����"));
	
		// 3. size() : Map�� ����ִ� K = V ���� ������ ��ȯ
		System.out.println("-----------------------------------");
		System.out.println("size()");
		System.out.println("map�� ����� �������� �� : " + map.size());
		
		// 4. replace(k Key, V Value) : �ش��ϴ� Key�� Value�� ����
		map.replace("������", new Snack(3000, "��ũ���ڸ�", 2000));
		System.out.println("-----------------------------------");
		System.out.println("replace(K Key, V Value)");
		System.out.println(map);
		
		// 5. remove(K Key) : �ش��ϴ� Key���� ���� ������ ����
		System.out.println("-----------------------------------");
		System.out.println("remove(K Key)");
		
		map.remove("�����");
		System.out.println(map);
		
		// Map�� index��� ������ �������� ����
		// ������� �ݺ� �����ϴ� ����� ������ ������
		
		// 1. KeySet()�� �̿��ϴ� ���
		// Key���� ������ Set���� �̾Ƴ��� Set�� �̿��� ���ٹ���� �����
		
		System.out.println("-----------------------------------");
		System.out.println("Iterator�� �̿��Ͽ� �ݺ�����");
		
		Set<String> KeySet = map.keySet();
		
		Iterator<String> it = KeySet.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			
			// key = value ����� ���
			System.out.println(key + " = " + map.get(key));
			
		}
		
		System.out.println("----------------------------------");
		System.out.println("for each������ �ݺ�����");
		
		for(String key : KeySet) {
			System.out.println(key + " = " + map.get(key));
		}
		
		System.out.println("----------------------------------");
		
		// 2. entrySet()�� �̿��ϴ� ���
		// Map.entry : Key�� Value�� ������ ��� �����ϴ� ���̷̤�
		// Map Ŭ���� ���� �������̽��� ������
		Set<Entry<String, Snack>> entrySet = map.entrySet();
		
		Iterator<Entry<String, Snack>> enIt = entrySet.iterator();
		
		while(enIt.hasNext()) {
			Entry<String, Snack> entry = enIt.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}

}
