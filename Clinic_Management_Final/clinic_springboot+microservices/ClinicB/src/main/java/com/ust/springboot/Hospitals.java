package com.ust.springboot;

import java.util.List;

public class Hospitals {

	List<Hosp> hos;

	public Hospitals(List<Hosp> hos) {
		super();
		this.hos= hos;
	}

	public List<Hosp> gethos() {
		return hos;
	}

	public Hospitals() {
		super();
	}

	public void setadm(List<Hosp> hos) {
		this.hos = hos;
	}

	@Override
	public String toString() {
		return "hosp [hos=" + hos + "]";
	}
}
