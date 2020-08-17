package com.kh.collection.list.part3.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.collection.list.part3.model.sort.ArtistDesc;
import com.kh.collection.list.part3.model.sort.TitleAsc;
import com.kh.collection.list.part3.model.sort.TitleDesc;
import com.kh.collection.list.part3.model.vo.Music;

public class MusicService {
	
	// ���� ��� ����� List ���� �� ����
	private List<Music> list = new ArrayList<Music>();
	
	/**
	 * list�� ���޹��� ������ �߰��ϴ� service
	 * @param m
	 * @return true
	 */
	public boolean addMusic(Music m) {
		return list.add(m);
		
	}
	
	
	/**
	 * ������ ����Ǿ� �ִ� list�� ��ȯ�ϴ� service
	 * @return list
	 */
	public List<Music> selectAllMusic(){
		return list;
	}
	
	/**
	 * ���޹��� Ű���带 �������� ������ �ִ� ���ǰ˻� service
	 * @param keyword
	 * @return serchList (�˻��� ��� ���� (0�� �̻�))
	 */
	public List<Music> searchMusic(String keyword){
		
		// �˻��� ������ ������ list�� ���� �� ����
		List<Music> searchList = new ArrayList<>();
		
		// ���� �˻� ���
		for(Music m : list) {
			if(m.getTitle().contains(keyword)) {
				// ���� ������ Music ��ü(m)�� ���� ��
				// ���޹��� keyword�� ���ԵǾ� �ִٸ� if�� ����
				// --> �ش� ��ü�� serahList�� �߰�
				searchList.add(m);
			}
		}
		
		return searchList;
	}
	
	/**
	 * ���޹��� ����� ��ġ�ϯH ������ ���� ������ �����ϴ� service
	 * @param title
	 * @return m
	 */
	public Music removeMusic(String title) {
		
		// ������ ���� ��ü�� �ӽ� ����(����)�� ���� ����
		Music m = null;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				// ���� ������ Music ��ü�� ������ ���޹��� title�� ���ٸ� if ����
				m = list.remove(i);
				// list���� i��° �ε��� ��Ҹ� �����ϸ鼭
				// ��[���� ��Ҹ� ��ȯ�Ͽ� m�� ����
			}
		}
		return m;
		
	}
	
	/**
	 * ���� ���� title�� ���� ������ ���� ������ ��Ͽ��� �˻��Ͽ�
	 * �ش������� ���޹��� m���� �����ϴ� service
	 * @param title
	 * @param m
	 * @return 1(���� ����) / -1(���� ����)
	 */
	public int updateMusic(String title, Music m) {
		
		Music old = null;
		// ������ ���� Music ��ü�� ������ �ӽ� ���� ����
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				old = list.set(i, m);
				// list i��° �ε����� ���޹��� Music ��ü m�� �����ϰ�
				// ���� �� ��ü�� old�� ����
				break;
			}
		}
		
		// old�� �����ϴ� ���� ������ --> ���� ����
		if(old != null) {
			return 1;
		}else {
			return -1;
		}
	}
	
	/**
	 * ���޹��� ���� ��ȣ�� ���� ���ĵ� list�� ��ȯ�ϴ� service
	 * @param sel
	 * @return list
	 */
	public List<Music> sortMusic(int sel){
		
		switch(sel) {
		case 1: // ������ �������� --> Music�� �⺻ ����
			Collections.sort(list); break;
		case 2: // ������ �������� --> ������ ���� ���
			Collections.sort(list, new ArtistDesc()); break;
		case 3: // ���� �������� --> ������ ���� ���
			Collections.sort(list, new TitleAsc()); break;
		case 4: // ���� �������� --> ������ ���� ���
			Collections.sort(list, new TitleDesc()); break;
		}
		return list;
	}

}
