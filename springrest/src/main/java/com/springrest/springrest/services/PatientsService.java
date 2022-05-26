package com.springrest.springrest.services;

import java.util.List;


import com.springrest.springrest.entities.Patients;

public interface PatientsService {

	public List<Patients> getPatients();
	
	public Patients getPatient(long patientId);
	
	public Patients addPatient( Patients patient);

	public Patients updatePatient(Patients patient);
	
	public void deletePatient (long parseLong);
}
