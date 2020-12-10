package com.pack.HospitalManagementSpringBootApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phy")
public class Physician {

	@Id
	private Integer id;
	
	private String firstName;

	private String lastName;

	private String department;

	private String educationalQualification;

	private Integer yearsOfExperience;

	private String state;

	private String insurancePlan;

	public Physician() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Physician(String firstName, String lastName, String department, String educationalQualification,
			Integer yearsOfExperience, String state, String insurancePlan) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.educationalQualification = educationalQualification;
		this.yearsOfExperience = yearsOfExperience;
		this.state = state;
		this.insurancePlan = insurancePlan;
	}

	public Physician(Integer id, String firstName, String lastName, String department, String educationalQualification,
			Integer yearsOfExperience, String state, String insurancePlan) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.educationalQualification = educationalQualification;
		this.yearsOfExperience = yearsOfExperience;
		this.state = state;
		this.insurancePlan = insurancePlan;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEducationalQualification() {
		return educationalQualification;
	}

	public void setEducationalQualification(String educationalQualification) {
		this.educationalQualification = educationalQualification;
	}

	public Integer getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(Integer yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getInsurancePlan() {
		return insurancePlan;
	}

	public void setInsurancePlan(String insurancePlan) {
		this.insurancePlan = insurancePlan;
	}

	@Override
	public String toString() {
		return "Physician [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", department="
				+ department + ", educationalQualification=" + educationalQualification + ", yearsOfExperience="
				+ yearsOfExperience + ", state=" + state + ", insurancePlan=" + insurancePlan + "]";
	}
	
	
}
