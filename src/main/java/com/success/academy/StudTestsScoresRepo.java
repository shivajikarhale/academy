package com.success.academy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.success.models.StudTestScoreIdentity;
import com.success.models.StudentTestsScores;

@Repository
public interface StudTestsScoresRepo extends JpaRepository<StudentTestsScores, StudTestScoreIdentity>{
	
	/*
	 * @Query("SELECT new com.success.academy.StudAllTestScores(sts.studentId,sts.courseId,sts.testNumber,td.testType,td.totalMarks,td.testScore,td.testDesc,td.testDate) "
	 * + "FROM StudentTestsScores sts,TestsDetails td ") List<StudAllTestScores>
	 * fetchStudAllTestsScores();
	 */

}
