package com.kh.object.chap07.method.model.service;
import com.kh.object.chap07.method.model.vo.TV;

public class MethodService {
	
	public void example1() {
		
		// tv ��ü �� �� ����
		TV t1 = new TV("LCD", false, 220);
		TV t2 = new TV("OLED", true, 220);
		
		t1.voltage = 400;
		
		System.out.println(t1.voltage); // 400
		System.out.println(t2.voltage); //400
		
		// static ���� �Ǵ� �޼ҵ�� static������ �Ҵ�� �� Ŭ������.������(or �޼ҵ��)���� �Ҵ�ȴ�.
		System.out.println(TV.voltage); // 400
		TV.voltage = 220;
		System.out.println(TV.voltage); // 220
		
		TV.test();
	}

}
