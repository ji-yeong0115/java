package com.kh.collection.list.part3.model.vo;

public class Music implements Comparable<Music>{
	
	private String title;
	private String artist;
	
	
	// �⺻ ������
	public Music() {
		
	}
	
	// �Ű����� ������
	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	// getter / setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	// toString() �������̵�
	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}

	@Override
	public int compareTo(Music o) {
		// �⺻ ���� ������ ������ ��������
		// --> �������� �ڷ���? String
		// --> String�� Java���� �����ϴ� ���� �� ������� Ŭ����
		// --> String ���ο��� compartTo()�� �̹� �������̵� �Ǿ� ����
		// 		--> ���ĺ� ������������ ���ĵǰ� �Ǿ��ִ�.
		
		return this.artist.compareTo(o.getArtist());
		// compareTo() -> ���� ��ü�� �ٸ� ��ü�� ��
		// �� �� ����, 0, ������� ���´�.
		// ������ ��� -> �� ��ü�� ���� ���� ����
		// 0�� ��� -> �� ��ü�� ���� ���� ����
		// 1�� ��� -> �� ��ü�� ��ġ�� swap(�ٲ�)
	}
	
}
