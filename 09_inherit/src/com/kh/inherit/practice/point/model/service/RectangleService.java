package com.kh.inherit.practice.point.model.service;
import com.kh.inherit.practice.point.model.vo.Rectangle;

public class RectangleService {

	Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		int area = height * width;
		
		return "사각형 넓이 : " + r + " / " + area;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		int round = 2 * (width + height);
		
		return "사각형 둘레 : " + r + " / " + round;
	}
}
