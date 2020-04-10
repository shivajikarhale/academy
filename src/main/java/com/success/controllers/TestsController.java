package com.success.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.success.models.TestsDetails;
import com.success.services.TestsService;

@RestController
@RequestMapping("/tests")
public class TestsController {
	
	@Autowired
	TestsService testsService;
	
	@PostMapping("/addTestDetails")
	public ResponseEntity<String> addTestDetails(@RequestBody TestsDetails testsDetails){
		String testnumber= testsService.addTestDetails(testsDetails);
		return new ResponseEntity<String>(testnumber,new HttpHeaders(),HttpStatus.OK);
	}
	
	@GetMapping(path = "/getAllTestsDetails")
	public ResponseEntity<List<TestsDetails>> getAllTestsDetais(){
		List<TestsDetails> testDetails=testsService.getAllTestsDetails();
		return new ResponseEntity<List<TestsDetails>>(testDetails, new HttpHeaders(), HttpStatus.OK);
		
	}
	
	@GetMapping(path = "/getTestsDetails")
	public ResponseEntity<List<TestsDetails>> getTestsDetais(@RequestParam(required = false) String courseId, @RequestParam(required = false) String testSubject){
		List<TestsDetails> testDetails=testsService.getTestsDetails(courseId,testSubject);
		return new ResponseEntity<List<TestsDetails>>(testDetails, new HttpHeaders(), HttpStatus.OK);
		
	}

}
