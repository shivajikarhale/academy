package com.success.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.success.models.InstituteCourses;
import com.success.models.StudentTestsScores;
import com.success.models.TestDetails;
import com.success.services.CourseService;

@RestController
@RequestMapping("/academy")
public class CoursesController {
	
	@Autowired
	CourseService courseService;
	
	@PostMapping("/addcourses")
	public ResponseEntity<InstituteCourses> addCourses(@RequestBody InstituteCourses instituteCourses) {
		InstituteCourses newCourse= courseService.addUpdateCourse(instituteCourses);
		return new ResponseEntity<InstituteCourses>(newCourse, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping("/addTestDeatils")
	public ResponseEntity<TestDetails> addTestDetails(@RequestBody TestDetails testDetails) {
		TestDetails newTest= courseService.addUpdateTestDetail(testDetails);
		return new ResponseEntity<TestDetails>(newTest, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping("/addStudTestScores")
	public ResponseEntity<StudentTestsScores> addStudTestScores(@RequestBody StudentTestsScores studentTestsScores) {
		StudentTestsScores newScore=courseService.addUpdateStudTestScores(studentTestsScores);
		return new ResponseEntity<StudentTestsScores>(newScore,new HttpHeaders(), HttpStatus.OK);
	}
	
	/*
	 * @GetMapping("/getStudAllTestScores") public
	 * ResponseEntity<List<StudAllTestScores>> getStudAllTestsScores(){
	 * List<StudAllTestScores> testScores=courseService.getStudTestScores("");
	 * return new ResponseEntity<List<StudAllTestScores>>(testScores, new
	 * HttpHeaders(),HttpStatus.OK); }
	 */
	
}
