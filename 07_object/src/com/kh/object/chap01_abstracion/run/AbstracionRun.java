package com.kh.object.chap01_abstracion.run;
import com.kh.object.chap01_abstracion.model.service.AbstractionService;

public class AbstracionRun {
	public static void main(String[] args) {
		
		AbstractionService aService = new AbstractionService();
		
		aService.createStudent();
	}

}
