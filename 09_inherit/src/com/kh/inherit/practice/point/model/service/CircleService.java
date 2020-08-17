package com.kh.inherit.practice.point.model.service;
import com.kh.inherit.practice.point.model.vo.Circle;

public class CircleService {

	Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		
		// 원 넓이 계산
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);

		double area = Math.PI * radius * radius;
		
		return "원 넓이 : " + c + " / " + area;
	}
	
	public String calcCircum(int x, int y, int radius) {
		
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		// 원 둘레
		double circum = 2 * Math.PI * radius;
		
							// 'c'만 써도 된다.
		return "원 둘레 : " + c.toString() + " / " + circum;
	}
}
