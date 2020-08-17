package com.kh.collection.list.part3.model.sort;

import java.util.Comparator;

import com.kh.collection.list.part3.model.vo.Music;

public class TitleDesc implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		
		// 곡명 내림차순
		return o2.getTitle().compareTo(o1.getTitle());
	}
	
	

}
