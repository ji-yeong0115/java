package com.kh.collection.list.part3.model.sort;

import java.util.Comparator;

import com.kh.collection.list.part3.model.vo.Music;

public class ArtistDesc implements Comparator<Music>{
	
	/*
	 * Comparator : 기본 정렬 기준 이외에 다른 정렬 기준으로 정렬하고자 할 때 사용
	 * 1) 별도의 클래스를 생성하여 Comparator 인터페이스를 상속 받음
	 * 2) public int compare(Object1 o1, Object o2) 오버라이딩
	 * 3) Collections.sort(list명, 정렬기준이 작성된 객체); 호출
	 * 
	 */

	@Override
	public int compare(Music o1, Music o2) {
		return o2.compareTo(o1);
		// return o2.getTitle().compareTo(o1.getTitle());
	}

}
