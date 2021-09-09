package com.ust.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component

public class PatientServicesImpl implements PatientServices {
    
	@Autowired
	PatientsRepository patientrep;
	@Override
	public List<Patients> getPatients() {
		// TODO Auto-generated method stub
	
		return patientrep.findAll();
	}

	@Override
	public void savePatients(Patients pat) {
		// TODO Auto-generated method stub
		this.patientrep.save(pat);
		
	}
	
    
	@Override
	public Patients getPatientsById(long id) {
		// TODO Auto-generated method stub
		Optional<Patients> optional = patientrep.findById(id);
		Patients patients = null;
		if (optional.isPresent()) {
			patients = optional.get();
		} else {
			throw new RuntimeException(" Patients not found for id :: " + id);
		}
		return patients;
	}

	@Override
	public void deletePatientsById(long id) {
		// TODO Auto-generated method stub
		this.patientrep.deleteById(id);
	}


}
