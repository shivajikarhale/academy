package com.success.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.success.models.Login;
import com.success.models.StudPersonalDetails;
import com.success.models.StudentRegistration;
import com.success.services.LoginService;
import com.success.services.StudentService;

@RestController
@RequestMapping("/academy")
public class StudentController {
	@Autowired
	StudentService studentService;
	@Autowired
	LoginService loginService;
	@Autowired
	StudPersonalDetails studPersonalDetails;
	@Autowired
	Login login;
	
	@CrossOrigin(origins = "http://localhost:4200")
	
	@PostMapping(path = "/addstudpersonalinfo")
    public ResponseEntity<StudPersonalDetails> addStudentPersonalInfo(@RequestBody StudPersonalDetails studDetails) {
		
		StudPersonalDetails studId = studentService.addStudPersonalInfo(studDetails);
        return new ResponseEntity<StudPersonalDetails>(studId, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping(path = "/registerStudent")
	public ResponseEntity<String> registerStudent(@RequestBody StudentRegistration studentRegistration) {
		
		studPersonalDetails.setFirstName(studentRegistration.getFirstName());
		studPersonalDetails.setLastName(studentRegistration.getLastName());
		studPersonalDetails.setEmail(studentRegistration.getEmail());
		studPersonalDetails.setMobileNo(studentRegistration.getMobileNumber());
		studPersonalDetails.setGender(studentRegistration.getGender());
		studPersonalDetails.setDateOfBirth(studentRegistration.getDob());
		StudPersonalDetails studDetails = studentService.addStudPersonalInfo(studPersonalDetails);
		
		login.setUserName(studDetails.getStudentId());
		login.setPassword(studentRegistration.getPassword());
		login.setRole("Student");
		loginService.addUserLoginDetails(login);
	   return new ResponseEntity<String>(studDetails.getStudentId(), new HttpHeaders(), HttpStatus.OK);
	}
}