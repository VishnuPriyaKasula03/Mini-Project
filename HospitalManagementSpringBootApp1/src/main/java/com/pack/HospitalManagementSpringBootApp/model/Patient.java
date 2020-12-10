package com.pack.HospitalManagementSpringBootApp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pat")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer patientId;
	private String firstName;
	private String lastName;
	private String password;
	private Date dob;
	private String email;
	private Long contactNumber;
	private String state;
	private String insurancePlan;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String firstName, String lastName, String password, Date dob, String email, Long contactNumber,
			String state, String insurancePlan) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.dob = dob;
		this.email = email;
		this.contactNumber = contactNumber;
		this.state = state;
		this.insurancePlan = insurancePlan;
	}

	public Patient(Integer patientId, String firstName, String lastName, String password, Date dob, String email,
			Long contactNumber, String state, String insurancePlan) {
		super();
		this.patientId = patientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.dob = dob;
		this.email = email;
		this.contactNumber = contactNumber;
		this.state = state;
		this.insurancePlan = insurancePlan;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
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
		return "Patient [patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + ", dob=" + dob + ", email=" + email + ", contactNumber=" + contactNumber + ", state="
				+ state + ", insurancePlan=" + insurancePlan + "]";
	}

	

}
