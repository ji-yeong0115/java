package com.kh.collection.map.model.vo;

public class Snack {
	
	private int price; // °¡°Ý
	private String flavor; // ¸À
	private int calories; // Ä®·Î¸®
	
	 public Snack() {
		// TODO Auto-generated constructor stub
	}

	public Snack(int price, String flavor, int calories) {
		super();
		this.price = price;
		this.flavor = flavor;
		this.calories = calories;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Snack [price=" + price + ", flavor=" + flavor + ", calories=" + calories + "]";
	}
	
	
	
	
	

}
