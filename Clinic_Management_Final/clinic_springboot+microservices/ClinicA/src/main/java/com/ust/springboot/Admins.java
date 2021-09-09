package com.ust.springboot;

import java.util.List;

public class Admins {
	List<Admin> adm;

	public Admins(List<Admin> adm) {
		super();
		this.adm = adm;
	}

	public List<Admin> getadm() {
		return adm;
	}

	public Admins() {
		super();
	}

	public void setadm(List<Admin> adm) {
		this.adm = adm;
	}

	@Override
	public String toString() {
		return "adms [adm=" + adm + "]";
	}

}
