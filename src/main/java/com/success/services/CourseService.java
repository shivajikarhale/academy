package com.success.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.success.academy.CourseRepo;
import com.success.academy.StudTestsScoresRepo;
import com.success.academy.TestDetailsRepo;
import com.success.models.InstituteCourses;
import com.success.models.StudentTestsScores;
import com.success.models.TestDetails;

@Service
public class CourseService {
	
	@Autowired
	CourseRepo courseRepo;
	@Autowired
	TestDetailsRepo testDetailsRepo;
	@Autowired
	StudTestsScoresRepo studTestsScoresRepo;
	
	public InstituteCourses addUpdateCourse(InstituteCourses instituteCourses) {
		Optional<InstituteCourses> courseFound=courseRepo.findById(instituteCourses.getCourseId());
		if(courseFound.isPresent()) {
			InstituteCourses courseExist=courseFound.get();
			courseExist.setCourseFees(instituteCourses.getCourseFees());
			courseExist.setCourseDesc(instituteCourses.getCourseDesc());
			courseExist.setCourseFaculties(instituteCourses.getCourseFaculties());
			courseExist.setCourseName(instituteCourses.getCourseName());
			courseExist.setEndDate(instituteCourses.getEndDate());
			courseExist.setStartDate(instituteCourses.getStartDate());
			return courseRepo.save(courseExist);
		}
		else {
			return courseRepo.save(instituteCourses);
		}
	}
	
	public TestDetails addUpdateTestDetail(TestDetails testDetail) {
		Optional<TestDetails> testFound=testDetailsRepo.findById(testDetail.getTestDetailIdentity());
		if(testFound.isPresent()) {
			TestDetails testExist=testFound.get();
			testExist.setTestDate(testDetail.getTestDate());
			testExist.setTestDesc(testDetail.getTestDesc());
			testExist.setTestTopics(testDetail.getTestTopics());
			testExist.setTestType(testDetail.getTestType());
			testExist.setTotalMarks(testDetail.getTotalMarks());
			return testDetailsRepo.save(testExist);
		}else {
		   return testDetailsRepo.save(testDetail);	
		}
	}
	
	public  StudentTestsScores addUpdateStudTestScores(StudentTestsScores studentTestsScores) {
		Optional<StudentTestsScores> scoreFound=studTestsScoresRepo.findById(studentTestsScores.getStudTestScoreIdentity());
        if(scoreFound.isPresent()) {
        	StudentTestsScores scoreExist=scoreFound.get();
        	scoreExist.setTestScore(studentTestsScores.getTestScore());
        	return studTestsScoresRepo.save(scoreExist);
        }else {
        	return studTestsScoresRepo.save(studentTestsScores);
        }
	}
	
	/*
	 * public List<StudAllTestScores> getStudTestScores(String studId){ return
	 * studTestsScoresRepo.fetchStudAllTestsScores(); }
	 */

}
