package com.kh.collection.list.part3.model.sort;

import java.util.Comparator;

import com.kh.collection.list.part3.model.vo.Music;

public class TitleAsc implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		
		// 곡명 오름차순
		return o1.getTitle().compareTo(o2.getTitle());
	}
	
	

}
