package com.ust.springboot;

//import java.awt.Color;
import java.util.ArrayList;

import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hospitals")
public class RestResource {

	
	@RequestMapping("/hosp")
	public Hospitals getColors()
	
	{
		List<Hosp> hosp = new ArrayList<>();
		Hosp c1 = new Hosp();
		c1.setId(1);
		c1.setName("Group3");
		c1.setAddress("group3");
		
		
		hosp.add(c1);
		
		Hospitals colorlist=new Hospitals(hosp);
		
		return colorlist;
	}
	
	
	
	
}
