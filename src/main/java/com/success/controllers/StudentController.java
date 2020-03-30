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

import com.success.models.StudPersonalDetails;
import com.success.services.StudentService;

@RestController
@RequestMapping("/academy")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(path = "/addstudpersonalinfo")
    public ResponseEntity<StudPersonalDetails> addStudentPersonalInfo(@RequestBody StudPersonalDetails studDetails) {
		
		StudPersonalDetails studId = studentService.addStudPersonalInfo(studDetails);
        return new ResponseEntity<StudPersonalDetails>(studId, new HttpHeaders(), HttpStatus.OK);
	}
	
}