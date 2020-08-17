package com.kh.object.chap02_Encapsulation.run;
import com.kh.object.chap02_Encapsulation.model.service.EncapsulationService;

public class EncapsulationRun {
	public static void main(String[] args) {
		
		EncapsulationService  es = new EncapsulationService();
		
		es.createPlayer();
	}
}
