package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.PatientsDao;
import com.springrest.springrest.entities.Patients;

@Service
public class PatinetsServiceImpl implements PatientsService {
	@Autowired
	private PatientsDao patientsDao;
	
	 public PatinetsServiceImpl()
	{
		}
@Override
	public List<Patients> getPatients()
{
		return patientsDao.findAll();
		
}
@Override
	public Patients getPatient(long patientId) 
{
	
	return  patientsDao.getOne(patientId);
	}

@Override
	public Patients addPatient(Patients patient)
{

	      patientsDao.save(patient);
		return patient;
}
@Override
	public Patients updatePatient( Patients patient)
	{
		
	patientsDao.save(patient);
	return patient;
		 }
	
@Override
public void deletePatient(long parseLong)
{ Patients entity= patientsDao.getOne(parseLong);
patientsDao.delete(entity);


}



}
