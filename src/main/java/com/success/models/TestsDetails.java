package com.success.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Component
@Table(name="TestsDetails")
public class TestsDetails {
	  
	private String courseId;
	@Id
	private String testNumber; 
	private String testType;
	private float totalMarks;
    private String testTopics;
	private String testDesc;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date   testDate;
	
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
	public String getTestTopics() {
		return testTopics;
	}
	public void setTestTopics(String testTopics) {
		this.testTopics = testTopics;
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
		return "TestsDetails [courseId=" + courseId + ", testNumber=" + testNumber + ", testType=" + testType
				+ ", totalMarks=" + totalMarks + ", testTopics=" + testTopics + ", testDesc=" + testDesc + ", testDate="
				+ testDate + "]";
	}
	

}
