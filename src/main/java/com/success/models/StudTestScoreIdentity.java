package com.success.models;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class StudTestScoreIdentity implements Serializable{
	
     @NotNull
	 private String courseId;
     @NotNull
	 private String studentId;
     @NotNull
	 private String testNumber;
     
		public String getCourseId() {
			return courseId;
		}
		public void setCourseId(String courseId) {
			this.courseId = courseId;
		}
		public String getStudentId() {
			return studentId;
		}
		public void setStudentId(String studentId) {
			this.studentId = studentId;
		}
		public String getTestNumber() {
			return testNumber;
		}
		public void setTestNumber(String testNumber) {
			this.testNumber = testNumber;
		}
		
		@Override
		public String toString() {
			return "StudTestScoreIdentity [courseId=" + courseId + ", studentId=" + studentId + ", testNumber=" + testNumber
					+ "]";
		}
		 
}
