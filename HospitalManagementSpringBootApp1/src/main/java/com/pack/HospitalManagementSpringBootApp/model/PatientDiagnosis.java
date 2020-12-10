package com.pack.HospitalManagementSpringBootApp.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "diagn")
public class PatientDiagnosis {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private Integer patientId;

	/*@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="patientId")
	private Patient patient;*/
	
	private String symptoms;
	private String diagnosisProvided;
	private String administeredBy;
	private Date dateOfDiagnosis;
	private String followUpRequired;
	private Date dateOfFollowUp;
	private Integer billAmount;
	private Integer cardNumber;
	private String modeOfPayment;

	public PatientDiagnosis() {
		super();
	}

	public PatientDiagnosis(Integer id, Integer patientId, String symptoms, String diagnosisProvided,
			String administeredBy, Date dateOfDiagnosis, String followUpRequired, Date dateOfFollowUp,
			Integer billAmount, Integer cardNumber, String modeOfPayment) {
		super();
		this.id = id;
		this.patientId = patientId;
		this.symptoms = symptoms;
		this.diagnosisProvided = diagnosisProvided;
		this.administeredBy = administeredBy;
		this.dateOfDiagnosis = dateOfDiagnosis;
		this.followUpRequired = followUpRequired;
		this.dateOfFollowUp = dateOfFollowUp;
		this.billAmount = billAmount;
		this.cardNumber = cardNumber;
		this.modeOfPayment = modeOfPayment;
	}

	public PatientDiagnosis(Integer patientId, String symptoms, String diagnosisProvided, String administeredBy,
			Date dateOfDiagnosis, String followUpRequired, Date dateOfFollowUp, Integer billAmount, Integer cardNumber,
			String modeOfPayment) {
		super();
		this.patientId = patientId;
		this.symptoms = symptoms;
		this.diagnosisProvided = diagnosisProvided;
		this.administeredBy = administeredBy;
		this.dateOfDiagnosis = dateOfDiagnosis;
		this.followUpRequired = followUpRequired;
		this.dateOfFollowUp = dateOfFollowUp;
		this.billAmount = billAmount;
		this.cardNumber = cardNumber;
		this.modeOfPayment = modeOfPayment;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public String getDiagnosisProvided() {
		return diagnosisProvided;
	}

	public void setDiagnosisProvided(String diagnosisProvided) {
		this.diagnosisProvided = diagnosisProvided;
	}

	public String getAdministeredBy() {
		return administeredBy;
	}

	public void setAdministeredBy(String administeredBy) {
		this.administeredBy = administeredBy;
	}

	public Date getDateOfDiagnosis() {
		return dateOfDiagnosis;
	}

	public void setDateOfDiagnosis(Date dateOfDiagnosis) {
		this.dateOfDiagnosis = dateOfDiagnosis;
	}

	public String getFollowUpRequired() {
		return followUpRequired;
	}

	public void setFollowUpRequired(String followUpRequired) {
		this.followUpRequired = followUpRequired;
	}

	public Date getDateOfFollowUp() {
		return dateOfFollowUp;
	}

	public void setDateOfFollowUp(Date dateOfFollowUp) {
		this.dateOfFollowUp = dateOfFollowUp;
	}

	public Integer getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Integer billAmount) {
		this.billAmount = billAmount;
	}

	public Integer getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	
}
