package com.ust.springboot;



import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="appo")

public class Appointment {

	
	
	
	private long id;
	
	private String pname;
	
	private String dname;
	
	private String date;

	private String prsn;

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPrsn() {
		return prsn;
	}

	public void setPrsn(String prsn) {
		this.prsn = prsn;
	}
	
	
	
	}