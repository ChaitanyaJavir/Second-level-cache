package com.prowings.inheritance.singleTable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("My_Book")
public class Book extends MyProduct
{
	@Column
	private String auther;
	@Column
	private int ISBN;
	
	public Book() {
		super();		
	}

	public Book(String name, String auther, int ISBN) {
		super( name);
		this.auther = auther;
		ISBN = ISBN;
	}


	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	@Override
	public String toString() {
		return "Book [auther=" + auther + ", ISBN=" + ISBN + ", Name=" + this.getName() +"]";
	}
	
	
	

}
