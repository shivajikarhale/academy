package com.success.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.success.academy.TestsDetailsRepo;
import com.success.models.TestsDetails;

@Service
public class TestsService {
	
	@Autowired
	TestsDetailsRepo testsDetailsRepo;
  
	public String addTestDetails(TestsDetails testsDetails) {
		
		testsDetails=testsDetailsRepo.save(testsDetails);
		return testsDetails.getTestNumber();
	}
	
	public List<TestsDetails> getAllTestsDetails(){
		return testsDetailsRepo.findAll();
	}
	
	public List<TestsDetails> getTestsDetails(String courseId,String testSubject){
		
		if(courseId!=null && !courseId.isEmpty() && (testSubject!=null && !testSubject.isEmpty()))
			return testsDetailsRepo.getTestsDetails(courseId,testSubject);
		else if(courseId!=null && !courseId.isEmpty()) 
			return testsDetailsRepo.getTestsDetailsByCourse(courseId);
		else if(testSubject!=null && !testSubject.isEmpty()) 
			return testsDetailsRepo.getTestsDetailsBySubject(testSubject);
		else
		return testsDetailsRepo.findAll();
	}
}
