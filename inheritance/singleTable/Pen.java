package com.prowings.inheritance.singleTable;

public class Pen extends MyProduct
{
	private String color;
	private int price;
	
	public Pen() {
		super();
		
	}

	public Pen(String name,String color, int price) {
		super(name);
		this.color = color;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pen [color=" + color + ", price=" + price + ", Name=" + this.getName() +"]";
	}
	
	
	
	
	

}
