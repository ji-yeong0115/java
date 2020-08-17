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
		// Map에 K, V 쌍으로 된 값을 추가하는 메소드
		map.put("새우깡", new Snack(1000, "새우맛", 450));
		map.put("다이제", new Snack(2000, "초코맛", 1500));
		map.put("꼬북칩", new Snack(2000, "콘스프맛", 350));
		
		System.out.println(map);
		// Map은 Key를 기준으로 함
		// Key는 Set의 특징을 지님 --> 순서 유지 X, 중복 X
		// 단, 중복되는 Key가 입력되는 경우 value만 덮어씌워진다.
		
		map.put("새우깡", new Snack(1200, "매운새우맛", 500));
		System.out.println(map);
		
		// 2. get(K key)
		// Map에서 해당하는 Key값의 Value를 반환함
		System.out.println("-----------------------------------");
		System.out.println("get(K key)");
		
		System.out.println(map.get("다이제"));
		System.out.println(map.get("꼬북칩"));
		System.out.println(map.get("새우깡"));
	
		// 3. size() : Map에 담겨있는 K = V 쌍의 개수를 반환
		System.out.println("-----------------------------------");
		System.out.println("size()");
		System.out.println("map에 저장된 데이터의 수 : " + map.size());
		
		// 4. replace(k Key, V Value) : 해당하는 Key의 Value를 수정
		map.replace("다이제", new Snack(3000, "디크초코맛", 2000));
		System.out.println("-----------------------------------");
		System.out.println("replace(K Key, V Value)");
		System.out.println(map);
		
		// 5. remove(K Key) : 해당하는 Key값을 가진 데이터 삭제
		System.out.println("-----------------------------------");
		System.out.println("remove(K Key)");
		
		map.remove("새우깡");
		System.out.println(map);
		
		// Map도 index라는 개념이 존재하지 않음
		// 순서대로 반복 접근하는 방법이 별도로 존재함
		
		// 1. KeySet()을 이용하는 방법
		// Key만을 별도의 Set으로 뽑아내서 Set을 이용한 접근방법을 사용함
		
		System.out.println("-----------------------------------");
		System.out.println("Iterator를 이용하여 반복접근");
		
		Set<String> KeySet = map.keySet();
		
		Iterator<String> it = KeySet.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			
			// key = value 형대로 출력
			System.out.println(key + " = " + map.get(key));
			
		}
		
		System.out.println("----------------------------------");
		System.out.println("for each문으로 반복접근");
		
		for(String key : KeySet) {
			System.out.println(key + " = " + map.get(key));
		}
		
		System.out.println("----------------------------------");
		
		// 2. entrySet()을 이용하는 방법
		// Map.entry : Key와 Value를 쌍으로 묶어서 관리하는 단이ㅜ로
		// Map 클래스 내부 인터페이스로 존재함
		Set<Entry<String, Snack>> entrySet = map.entrySet();
		
		Iterator<Entry<String, Snack>> enIt = entrySet.iterator();
		
		while(enIt.hasNext()) {
			Entry<String, Snack> entry = enIt.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}

}
