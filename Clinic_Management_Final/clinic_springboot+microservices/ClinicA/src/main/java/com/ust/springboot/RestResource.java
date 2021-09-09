package com.ust.springboot;

//import java.awt.Color;
import java.util.ArrayList;

import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/admins")
public class RestResource {

	
	@RequestMapping("/admin")
	public Admins getColors()
	
	{
		List<Admin> admins = new ArrayList<>();
		Admin c1 = new Admin();
		c1.setId(1);
		c1.setName("Group3");
		c1.setEmail("group3@gmail.com");
		
		
		admins.add(c1);
		
		Admins colorlist=new Admins(admins);
		
		return colorlist;
	}
	
	
	
	
}
