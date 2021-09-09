package com.ust.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppointmentServiceImpl implements AppointmentService {
	@Autowired
	AppointmentRepository apprepo;

	@Override
	public List<Appointment> getAppointments() {
		// TODO Auto-generated method stub
		return apprepo.findAll();
	}

	@Override
	public void saveAppointment(Appointment app) {
		// TODO Auto-generated method stub
		this.apprepo.save(app);
	}

	@Override
	public Appointment getAppointmentById(long id) {
		// TODO Auto-generated method stub
		Optional<Appointment> optional = apprepo.findById(id);
		Appointment app = null;
		if (optional.isPresent()) {
			app = optional.get();
		} else {
			throw new RuntimeException("Appointment not found for id :: " + id);
		}
		return app;
	}

	@Override
	public void deleteAppointmentById(long id) {
		// TODO Auto-generated method stub
		this.apprepo.deleteById(id);
		
	}
}