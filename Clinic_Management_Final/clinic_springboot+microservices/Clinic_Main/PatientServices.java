package com.ust.springboot;
import java.util.List;

public interface PatientServices {
	List <Patients> getPatients();
	void savePatients(Patients pat);
	Patients getPatientsById(long id);
	void deletePatientsById(long id);

}
