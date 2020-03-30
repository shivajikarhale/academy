package com.success.academy;

import java.util.Date;

public class StudAllTestScores  {
	
	private String studentId;
	private String courseId;
	private String testNumber;
	private String testType;
	private float totalMarks;
	private float testScore;
	private String testDesc;
	private Date testDate;
	
	
	public StudAllTestScores() {
		super();
	}
    
	
	public StudAllTestScores( String studentId, String courseId, String testNumber, String testType, float totalMarks,
			 float testScore, String testDesc,  Date testDate) {
		super();
		this.studentId = studentId;
		this.courseId = courseId;
		this.testNumber = testNumber;
		this.testType = testType;
		this.totalMarks = totalMarks;
		this.testScore = testScore;
		this.testDesc = testDesc;
		this.testDate = testDate;
	}

	public String getStudentId() {
		return studentId;
	}


	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}


	public String getCourseId() {
		return courseId;
	}


	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}


	public String getTestNumber() {
		return testNumber;
	}


	public void setTestNumber(String testNumber) {
		this.testNumber = testNumber;
	}


	public String getTestType() {
		return testType;
	}


	public void setTestType(String testType) {
		this.testType = testType;
	}


	public float getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(float totalMarks) {
		this.totalMarks = totalMarks;
	}

	public float getTestScore() {
		return testScore;
	}

	public void setTestScore(float testScore) {
		this.testScore = testScore;
	}

	public String getTestDesc() {
		return testDesc;
	}

	public void setTestDesc(String testDesc) {
		this.testDesc = testDesc;
	}
    

	public Date getTestDate() {
		return testDate;
	}

	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

	@Override
	public String toString() {
		return "StudAllTestScores [studentId=" + studentId + ", courseId=" + courseId + ", testNumber=" + testNumber
				+ ", testType=" + testType + ", totalMarks=" + totalMarks + ", testScore=" + testScore + ", testDesc="
				+ testDesc + ", testDate=" + testDate + "]";
	}

}
