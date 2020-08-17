package com.kh.collection.list.part3.model.sort;

import java.util.Comparator;

import com.kh.collection.list.part3.model.vo.Music;

public class ArtistDesc implements Comparator<Music>{
	
	/*
	 * Comparator : �⺻ ���� ���� �̿ܿ� �ٸ� ���� �������� �����ϰ��� �� �� ���
	 * 1) ������ Ŭ������ �����Ͽ� Comparator �������̽��� ��� ����
	 * 2) public int compare(Object1 o1, Object o2) �������̵�
	 * 3) Collections.sort(list��, ���ı����� �ۼ��� ��ü); ȣ��
	 * 
	 */

	@Override
	public int compare(Music o1, Music o2) {
		return o2.compareTo(o1);
		// return o2.getTitle().compareTo(o1.getTitle());
	}

}
