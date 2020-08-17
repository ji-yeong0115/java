package com.kh.collection.list.part3.model.vo;

public class Music implements Comparable<Music>{
	
	private String title;
	private String artist;
	
	
	// 기본 생성자
	public Music() {
		
	}
	
	// 매개변수 생성자
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
	
	// toString() 오버라이딩
	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}

	@Override
	public int compareTo(Music o) {
		// 기본 정렬 기준을 가수명 오름차순
		// --> 가수명의 자료형? String
		// --> String은 Java에서 제공하는 아주 잘 만들어진 클래스
		// --> String 내부에도 compartTo()가 이미 오버라이딩 되어 있음
		// 		--> 알파벳 오름차순으로 정렬되게 되어있다.
		
		return this.artist.compareTo(o.getArtist());
		// compareTo() -> 현재 객체와 다른 객체를 비교
		// 비교 시 음수, 0, 양수값이 나온다.
		// 음수인 경우 -> 두 객체의 현재 순서 유지
		// 0인 경우 -> 두 객체의 현재 순서 유지
		// 1인 경우 -> 두 객체의 위치를 swap(바꿈)
	}
	
}
