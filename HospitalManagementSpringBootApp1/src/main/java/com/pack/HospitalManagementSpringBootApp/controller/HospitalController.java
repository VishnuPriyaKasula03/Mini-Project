package com.pack.HospitalManagementSpringBootApp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
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

import com.pack.HospitalManagementSpringBootApp.HospitalManagementSpringBootAppApplication;
import com.pack.HospitalManagementSpringBootApp.dao.DiagnosisRepository;
import com.pack.HospitalManagementSpringBootApp.dao.PatientRepository;
import com.pack.HospitalManagementSpringBootApp.dao.PhysicianRepository;
import com.pack.HospitalManagementSpringBootApp.model.Patient;
import com.pack.HospitalManagementSpringBootApp.model.PatientDiagnosis;
import com.pack.HospitalManagementSpringBootApp.model.Physician;

@CrossOrigin(origins = "http://localhost:1811")
@RestController
@RequestMapping("/api")
public class HospitalController {
	@Autowired
	PatientRepository patientRepository;

	@Autowired
	DiagnosisRepository diagnosisRepository;

	@Autowired
	PhysicianRepository physicianRepository;

	private static final Logger log = LoggerFactory.getLogger(HospitalController.class);

	@PostMapping(value = "/patient")
	public ResponseEntity<Patient> postPatient(@RequestBody Patient patient) {
		try {
			log.info("Patient is being added");
			String isInsured = "No";
			if (patient.getInsurancePlan().equals("true"))
				isInsured = "Yes";
			Patient patientObj = patientRepository.save(
					new Patient(patient.getFirstName(), patient.getLastName(), patient.getPassword(), patient.getDob(),
							patient.getEmail(), patient.getContactNumber(), patient.getState(), isInsured));
			return new ResponseEntity<>(patientObj, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
	}

	@PostMapping(value = "/physician")
	public ResponseEntity<Physician> postPhysician(@RequestBody Physician physician) {
		try {
			log.info("Physician is being added");
			Random r = new Random();
			int pid = r.nextInt(899) + 100;
			// physician.setId(pid);
			String isInsured = "No";
			if (physician.getInsurancePlan().equals("true"))
				isInsured = "Yes";
			Physician physicianObj = physicianRepository.save(new Physician(pid, physician.getFirstName(),
					physician.getLastName(), physician.getDepartment(), physician.getEducationalQualification(),
					physician.getYearsOfExperience(), physician.getState(), isInsured));
			return new ResponseEntity<>(physicianObj, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
	}

	@GetMapping("/patient")
	public ResponseEntity<List<Patient>> getAllPatients() {
		List<Patient> patients = new ArrayList<Patient>();
		try {
			log.info("Getting all patients");

			patientRepository.findAll().forEach(patients::add);
			System.out.println(patients);
			if (patients.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(patients, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping(value = "physician/department/{department}")
	public ResponseEntity<List<Physician>> findByDepartment(@PathVariable String department) {
		try {
			log.info("Searching physician by department");
			List<Physician> physicians = physicianRepository.findByDepartment(department);
			if (physicians.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(physicians, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}
	}

	@GetMapping(value = "physician/state/{state}")
	public ResponseEntity<List<Physician>> findByState(@PathVariable String state) {
		try {
			log.info("Searching physician by state");

			List<Physician> physicians = physicianRepository.findByState(state);
			if (physicians.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(physicians, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}
	}

	@GetMapping("/diagnosis")
	public ResponseEntity<List<Physician>> getPhysicianList() {
		List<Physician> physicians = new ArrayList<Physician>();
		try {
			log.info("Getting all physicians");

			physicianRepository.findAll().forEach(physicians::add);
			if (physicians.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(physicians, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping(value = "/diagnosis")
	public ResponseEntity<PatientDiagnosis> postCustomer(@RequestBody PatientDiagnosis patientDiagnosis) {
		try {
			log.info("Diagnoisis details are being stored");

			PatientDiagnosis _patientDiagnosis = diagnosisRepository
					.save(new PatientDiagnosis(patientDiagnosis.getPatientId(), patientDiagnosis.getSymptoms(),
							patientDiagnosis.getDiagnosisProvided(), patientDiagnosis.getAdministeredBy(),
							patientDiagnosis.getDateOfDiagnosis(), patientDiagnosis.getFollowUpRequired(),
							patientDiagnosis.getDateOfFollowUp(), patientDiagnosis.getBillAmount(),
							patientDiagnosis.getCardNumber(), patientDiagnosis.getModeOfPayment()));
			return new ResponseEntity<>(_patientDiagnosis, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
	}

	@GetMapping(value = "patient/id/{id}")
	public ResponseEntity<Patient> findById(@PathVariable Integer id) {
		try {
			log.info("getting patient details by id");

			System.out.println(id);
			Optional<Patient> patient = patientRepository.findById(id);
			if (patient != null) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			System.out.println("lll" + patient.get());
			return new ResponseEntity<>(patient.get(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}
	}

}
