package com.kh.api.chap03.model.service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateService {

	public void example1() {
		// java.util.Date 클래스
		// Date() 기본 생성자 : 객체가 생성된 가장 가까운 ms 단위로 초기화
		Date now = new Date();
		
		System.out.println("현재 시간 : " + now);
		
		// Date(long date)
		Date dt1 = new Date(0L);
		System.out.println("기준 시간 : " + dt1);
		// UTC : 협정 세계시 -> 영국을 기준으로 1970년 1월 1일 0시 0분 0초를 0ms 기준으로 함
		
		// 86400000ms = 1일
		Date dt2 = new Date(86400000L);
		System.out.println("dt2 : " + dt2);
	
	}
	
	public void example2(){
		
		Date now = new Date(); // 현재 시간 저장
		System.out.println(now);
		
		// SimpleDateFormat : Date를 간단한 형식으로 변경
		SimpleDateFormat sdf = new SimpleDateFormat("G yyyy년 MM월 dd일 E요일 hh:mm:ss");
		
		String str = sdf.format(now);
		System.out.println(str);
	}
}
