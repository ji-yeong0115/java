package com.kh.object.chap05_initblock.run;

import com.kh.object.chap05_initblock.model.vo.Product;

public class InitBlockRun {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		
		System.out.println(p1.selectProduct());
		
		Product p2 = new Product();
		
		System.out.println(p2.selectProduct());

	}

}
