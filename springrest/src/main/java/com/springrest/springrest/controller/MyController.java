package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Patients;
import com.springrest.springrest.services.PatientsService;

@RestController
public class MyController {
	
	@Autowired
	private PatientsService patientsService;
  
	
	//Get the Patients
	@GetMapping("/patients")
	public List <Patients> getPatients()
	{return this.patientsService.getPatients();}
	
	//get by id
	@GetMapping("/patients/{patientsId}")
	public Patients getPatient(@PathVariable String patientsId)
	{ return this.patientsService.getPatient(Long.parseLong(patientsId)); }
	
	//Add record
	@PostMapping("/patients")
	public Patients addPatient(@RequestBody Patients patient)
	{
		return this.patientsService.addPatient(patient);
	}
	
	//update record
	@PutMapping ("/patients")
	public Patients updatePatient(@RequestBody Patients patient)
	{
		return this.patientsService.updatePatient(patient);
	}
	
	//Delete record
		@DeleteMapping("/patients/{patientsId}")
		
		public ResponseEntity<HttpStatus> deletePatient(@PathVariable String patientsId)
		{ try { this.patientsService. deletePatient(Long.parseLong(patientsId));
			return new ResponseEntity<>(HttpStatus.OK); }
		
		catch (Exception e) { return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); }
		}
	
	
}

