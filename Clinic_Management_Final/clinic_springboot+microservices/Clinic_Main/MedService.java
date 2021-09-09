package com.ust.springboot;

import java.util.List;

public interface MedService {

	List <Med> getMedicine();
	void saveMedicine(Med medicine);
	Med getMedicineById(long id);
	void deleteMedicineById(long id);
}
