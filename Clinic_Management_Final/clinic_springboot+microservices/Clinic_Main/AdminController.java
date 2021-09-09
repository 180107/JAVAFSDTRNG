package com.ust.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	
	@RequestMapping("/admins")
	public ModelAndView home1() {
		ModelAndView model=new ModelAndView("admins");
		
		//ModelAndView m=new ModelAndView("color");
		RestTemplate resttemplate=new RestTemplate();
		
		Admins result=resttemplate.getForObject("http://localhost:8085/admins/admin",Admins.class);
		System.out.println(result);
		//System.out.println(result.getColo());
		model.addObject("admins",result.getadm());
	
		return model;
		
		
	}
	
	@RequestMapping("/hospitals")
	public ModelAndView home2() {
		ModelAndView model=new ModelAndView("hospitals");
		
		//ModelAndView m=new ModelAndView("color");
		RestTemplate resttemplate=new RestTemplate();
		
		Hospitals result=resttemplate.getForObject("http://localhost:8086/hospitals/hosp",Hospitals.class);
		System.out.println(result);
		//System.out.println(result.getColo());
		model.addObject("hospitals",result.gethos());
	
		return model;
		
		
	}

}
