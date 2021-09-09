package com.ust.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClinicalController {
	
	@Autowired
	UserService useservice;
	
	@Autowired
	MedService clinicservice;
	
	@Autowired
	PatientServices patservice;
	
	@Autowired
	AppointmentService appservice;
	
	
	
	
	
	@RequestMapping("/")
    public String index() {
		return "login.html";
	}

	
	@RequestMapping("/adminlogin")
	public String iindex() {
		return "adminlogin.html";
	}
	

	@GetMapping("/viewuser")
	public String viewusers(Model model)
	{
		model.addAttribute("listUsers",useservice.getUsers());
		return "viewuser";
	}
	
	@GetMapping("adduser")
	public String adduser(Model model)
	
	{
		User use=new User();
		model.addAttribute("use",use);
		return "adduser";
	}
	
	@PostMapping("/saveuse")
	public String saveMedicine(@ModelAttribute ("use") User use)
	
	{
	useservice.saveUser(use);
	return "redirect:/adminlogin";
		
	}
	
	@GetMapping("/updateusers/{id}")
	public String updateUsers(@PathVariable (value="id") long id, Model model)
	
	{
		User use=useservice.getUserById(id);
		model.addAttribute("use",use);
		return "updateusers";
	}
	

	@GetMapping("/deleteUsers/{id}")
	public String deleteUser(@PathVariable (value="id") long id)
	
	{
		this.useservice.deleteUserById(id);
		
		return "redirect:/adminlogin";
	}
	

	@GetMapping("/viewmedicine")
	public String viewmedicines(Model model)
	{
		model.addAttribute("listMedicine",clinicservice.getMedicine());
		return "viewmedicine";
	}
	
	@GetMapping("/addmedicine")
	public String addmedicine(Model model)
	
	{
		Med medicine=new Med();
		model.addAttribute("medicine",medicine);
		return "addmedicine";
	}
	
	@PostMapping("/savemed")
	public String saveMedicine(@ModelAttribute ("medicine") Med medicine)
	
	{
	clinicservice.saveMedicine(medicine);
	return "redirect:/adminlogin";
		
	}
	
	@GetMapping("/updateform/{id}")
	public String updateform(@PathVariable (value="id") long id, Model model)
	
	{
		Med medicine=clinicservice.getMedicineById(id);
		model.addAttribute("medicine",medicine);
		return "updateform";
	}
	

	@GetMapping("/deleteMedicine/{id}")
	public String deleteform(@PathVariable (value="id") long id)
	
	{
		this.clinicservice.deleteMedicineById(id);
		
		return "redirect:/adminlogin";
	}
	
	
	
	
	
	
	@GetMapping("/viewpatients")
	public String viewpatients(Model model)
	{
		model.addAttribute("listPatients",patservice.getPatients());
		return "viewpatients";
	}
	
	@GetMapping("/addpatients")
	public String addpatients(Model model)
	
	{
		Patients pat=new Patients();
		model.addAttribute("pat",pat);
		return "addpatients";
	}
	
	@PostMapping("/save")
	public String savePatients(@ModelAttribute ("pat") Patients pat)
	
	{
		patservice.savePatients(pat);
	return "redirect:/adminlogin";
		
	}
	
	@GetMapping("/updatepatients/{id}")
	public String updatepatients(@PathVariable (value="id") long id, Model model)
	
	{
		Patients pat=patservice.getPatientsById(id);
		model.addAttribute("pat",pat);
		return "updatepatients";
	}

	@GetMapping("/deletePatients/{id}")
	public String deletepatients(@PathVariable (value="id") long id)
	
	{
		this.patservice.deletePatientsById(id);
		
		return "redirect:/adminlogin";
	}
	
	
	@GetMapping("/viewapp")
	public String viewAppo(Model model)
	{
		model.addAttribute("listAppointments",appservice.getAppointments());
		return "viewapp";
	}
	
	@GetMapping("/addapp")
	public String addAppointment(Model model)
	
	{
		Appointment app=new Appointment();
		model.addAttribute("app",app);
		return "addapp";
	}
	
	@PostMapping("/saveapp")
	public String saveAppointment(@ModelAttribute ("app") Appointment app)
	
	{
		appservice.saveAppointment(app);
	return "redirect:/adminlogin";
		
	}
	
	@GetMapping("/updateapp/{id}")
	public String updateapp(@PathVariable (value="id") long id, Model model)
	
	{
		Appointment app=appservice.getAppointmentById(id);
		model.addAttribute("app",app);
		return "updateapp";
	}
	

	@GetMapping("/deleteAppointment/{id}")
	public String deleteform1(@PathVariable (value="id") long id)
	
	{
		this.appservice.deleteAppointmentById(id);
		
		return "redirect:/adminlogin";
	}
	
	
	
	
	
	
	
	
	
	
}