package com.ust.springboot;

import java.util.List;

public interface AppointmentService {
	
List <Appointment> getAppointments();
	
	void saveAppointment(Appointment app);
	Appointment getAppointmentById(long id);
	void deleteAppointmentById(long id);

	

}

