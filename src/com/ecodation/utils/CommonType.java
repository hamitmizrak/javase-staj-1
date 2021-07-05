package com.ecodation.utils;

import java.util.Date;

abstract public class CommonType {
	// ortak özellikler
	
	private long id;
	private Date creationDate;
	private int year = 1980;
	
	// methods
	
	abstract public void countYear();
	
	// getter and setter
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
