package com.ust.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class MedServiceImpl implements MedService{
    @Autowired
    MedRespository medrep;
	@Override
	public List<Med> getMedicine() {
		// TODO Auto-generated method stub
		return medrep.findAll();
	}

	@Override
	public void saveMedicine(Med medicine) {
		// TODO Auto-generated method stub
		this.medrep.save(medicine);
		
	}

	@Override
	public Med getMedicineById(long id) {
		// TODO Auto-generated method stub
		Optional<Med> optional = medrep.findById(id);
		Med medicine = null;
		if (optional.isPresent()) {
			medicine = optional.get();
		} else {
			throw new RuntimeException(" Medicine not found for id :: " + id);
		}
		return medicine;
	}

	@Override
	public void deleteMedicineById(long id) {
		// TODO Auto-generated method stub
		this.medrep.deleteById(id);
	}
	
	
}
