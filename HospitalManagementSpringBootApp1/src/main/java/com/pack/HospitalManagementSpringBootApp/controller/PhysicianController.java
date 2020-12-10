package com.pack.HospitalManagementSpringBootApp.controller;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pack.HospitalManagementSpringBootApp.dao.PatientRepository;
import com.pack.HospitalManagementSpringBootApp.dao.PhysicianRepository;
import com.pack.HospitalManagementSpringBootApp.model.Patient;
import com.pack.HospitalManagementSpringBootApp.model.Physician;


@CrossOrigin(origins = "http://localhost:18110")
@RestController
@RequestMapping("/api")
public class PhysicianController {
		/*@Autowired
		PhysicianRepository physicianRepository;
		

		//@RequestMapping(value="/add/physician",method=RequestMethod.POST)
	    
		
		@PostMapping(value = "/physician")
		public ResponseEntity<Physician> postPhysician(@RequestBody Physician physician) {
	        try {
	        	System.out.println("Heeee");
	        	System.out.println(physician.getDepartment());
				Physician physicianObj = physicianRepository
	                    .save(new Physician(physician.getFirstName(),physician.getLastName(),physician.getDepartment(),physician.getEducationQualification(),physician.getYearsOfExperience(),physician.getState(),physician.getInsurancePlan()));
	            return new ResponseEntity<>(physicianObj, HttpStatus.CREATED);
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
	        }
	   }*/
	 
	 
}
