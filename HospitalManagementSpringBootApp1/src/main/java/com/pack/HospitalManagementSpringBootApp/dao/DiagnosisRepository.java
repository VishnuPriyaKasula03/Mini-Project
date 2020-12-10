package com.pack.HospitalManagementSpringBootApp.dao;

import org.springframework.data.repository.CrudRepository;

import com.pack.HospitalManagementSpringBootApp.model.Patient;
import com.pack.HospitalManagementSpringBootApp.model.PatientDiagnosis;

public interface DiagnosisRepository extends CrudRepository<PatientDiagnosis,Integer>{

}
