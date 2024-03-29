package com.prowings.inheritance.mappedsuperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MyWorker extends Person
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String salary;
	@Column
	private String Grade;
	
	public MyWorker() {
		super();
		
	}

	public MyWorker(String salary, String grade, int height, int weight) {
		super(height, weight);
		this.salary = salary;
		Grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	@Override
	public String toString() {
		return "MyWorker [id=" + id + ", salary=" + salary + ", Grade=" + Grade + "]";
	}
	
	
	
	

}
