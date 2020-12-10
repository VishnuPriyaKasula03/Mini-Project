package com.pack.HospitalManagementSpringBootApp.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pack.HospitalManagementSpringBootApp.model.Patient;
import com.pack.HospitalManagementSpringBootApp.model.Physician;

public interface PhysicianRepository extends CrudRepository<Physician, Integer> {

	List<Physician> findByDepartment(String dept);

	List<Physician> findByState(String state);

}
