package com.kh.api.chap03.model.service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateService {

	public void example1() {
		// java.util.Date Ŭ����
		// Date() �⺻ ������ : ��ü�� ������ ���� ����� ms ������ �ʱ�ȭ
		Date now = new Date();
		
		System.out.println("���� �ð� : " + now);
		
		// Date(long date)
		Date dt1 = new Date(0L);
		System.out.println("���� �ð� : " + dt1);
		// UTC : ���� ����� -> ������ �������� 1970�� 1�� 1�� 0�� 0�� 0�ʸ� 0ms �������� ��
		
		// 86400000ms = 1��
		Date dt2 = new Date(86400000L);
		System.out.println("dt2 : " + dt2);
	
	}
	
	public void example2(){
		
		Date now = new Date(); // ���� �ð� ����
		System.out.println(now);
		
		// SimpleDateFormat : Date�� ������ �������� ����
		SimpleDateFormat sdf = new SimpleDateFormat("G yyyy�� MM�� dd�� E���� hh:mm:ss");
		
		String str = sdf.format(now);
		System.out.println(str);
	}
}
