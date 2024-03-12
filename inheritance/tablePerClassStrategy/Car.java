package com.prowings.inheritance.tablePerClassStrategy;

import javax.persistence.Entity;

@Entity
public class Car extends Vehicle
{
	private String company;
	
	private int numberOfWheels;

	public Car() {
		super();
		
	}

	public Car(String manufacturer, String company, int numberOfWheels) {
		super(manufacturer);
		this.company = company;
		this.numberOfWheels = numberOfWheels;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", numberOfWheels=" + numberOfWheels + "]";
	}
	
	
	

}
