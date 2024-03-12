package com.prowings.inheritance.tablePerClassStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Truck extends Vehicle
{
	@Column
	private String company;
	@Column
	private int numberOfWheels;
	
	public Truck() {
		super();
	
	}

	public Truck(String manufacturer, String company, int numberOfWheels) {
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
		return "Truck [company=" + company + ", numberOfWheels=" + numberOfWheels + "]";
	}
	
	

}
