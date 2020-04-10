package com.success.academy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.success.models.TestsDetails;

@Repository
public interface TestsDetailsRepo extends JpaRepository<TestsDetails, String> {
	
	String courseId = null;
	String testSubject = null;

	@Query("SELECT u FROM TestsDetails u WHERE u.courseId = ?1 and u.testTopics = ?2 ORDER BY u.courseId ,u.testTopics")
    public List<TestsDetails> getTestsDetails(String courseId,String testSubject);
	
	@Query("SELECT u FROM TestsDetails u WHERE u.courseId = ?1 ORDER BY u.courseId ")
    public List<TestsDetails> getTestsDetailsByCourse(String courseId);
	
	@Query("SELECT u FROM TestsDetails u WHERE u.testTopics = ?1 ORDER BY u.testTopics")
    public List<TestsDetails> getTestsDetailsBySubject(String testSubject);

}
