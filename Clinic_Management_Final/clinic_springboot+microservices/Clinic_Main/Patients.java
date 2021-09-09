package com.ust.springboot;



import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="pat")
	public class Patients {
	
		
	private	long id;
	
	private String pname;
		
	private int age;

	private String gender;
		
	private String address;
		
	private String phoneno;
		
		
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
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhoneno() {
			return phoneno;
		}
		public void setPhoneno(String phoneno) {
			this.phoneno = phoneno;
		}
		

	}




