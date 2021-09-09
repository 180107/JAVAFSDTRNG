package com.ust.springboot;




import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="crud")
public class Med {
    
    
	private long id;
	
	
	private String mname;
	
	private int price;
	
	private int qty;
	
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}

