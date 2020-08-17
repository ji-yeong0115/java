package com.kh.poly.chap02.ex2.model.service;

import com.kh.poly.chap02.ex2.model.vo.AllinOnPrinter;
import com.kh.poly.chap02.ex2.model.vo.KoreaElectronics;
import com.kh.poly.chap02.ex2.model.vo.LgAP;
import com.kh.poly.chap02.ex2.model.vo.SamsungAP;
import com.kh.poly.chap02.ex2.model.vo.SmartPhone;

public class Example2Service {
	
	public void example1() {
		
		// 복합기 객체 배열
		AllinOnPrinter[] ap = new AllinOnPrinter[2];
		
		ap[0] = new SamsungAP("삼성", "삼성 1호");
		ap[1] = new LgAP();
		
		for(int i=0; i<ap.length; i++) {
			ap[i].powerOn();
		}
		
		// 복합기 + 스마트폰을 한 번에 관리하기
		KoreaElectronics[] ke = new KoreaElectronics[3];
		
		ke[0] = new SmartPhone();
		ke[1] = new SamsungAP();
		ke[2] = new LgAP();
	}

}
