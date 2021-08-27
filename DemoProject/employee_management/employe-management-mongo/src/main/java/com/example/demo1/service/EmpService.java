package com.example.demo1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.entity.Employee;
import com.example.demo1.repository.EmpRepository;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepository repo;
	
	public void addEmp(Employee e) {
		repo.save(e);
	}
	
	public List<Employee> getAllEmp() {
		return repo.findAll();
	}
	
	public Employee getEmpById(String id) {
		Optional<Employee> e= repo.findById(id);
		if(e.isPresent()) {
			return e.get();
		}
		return null;
	}
	
	public void deleteEmp(String id) {
		repo.deleteById(id);
	}

}
