package com.kh.inherit.practice.point.model.service;
import com.kh.inherit.practice.point.model.vo.Circle;

public class CircleService {

	Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		
		// �� ���� ���
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);

		double area = Math.PI * radius * radius;
		
		return "�� ���� : " + c + " / " + area;
	}
	
	public String calcCircum(int x, int y, int radius) {
		
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		// �� �ѷ�
		double circum = 2 * Math.PI * radius;
		
							// 'c'�� �ᵵ �ȴ�.
		return "�� �ѷ� : " + c.toString() + " / " + circum;
	}
}
