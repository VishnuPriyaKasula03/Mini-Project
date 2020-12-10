package com.pack.HospitalManagementSpringBootApp.dao;

import org.springframework.data.repository.CrudRepository;

import com.pack.HospitalManagementSpringBootApp.model.Patient;

public interface PatientRepository extends CrudRepository<Patient,Integer>{

}
