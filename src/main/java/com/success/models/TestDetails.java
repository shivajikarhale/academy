package com.success.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="TestsDetails")
public class TestDetails implements Serializable {
	 
	  @EmbeddedId
      private TestDetailIdentity testDetailIdentity;	
	  private String testType;
	  private float totalMarks;
	  private String testTopics;
	  private String testDesc;
	  @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")
	  private Date testDate;
	/*
	 * @OneToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "course_id", insertable = false, updatable = false)
	 * 
	 * @Fetch(FetchMode.JOIN) private Set<StudentTestsScores> studentTestsScores;
	 */
	  
		public TestDetails() {
			super();
		}

		public TestDetailIdentity getTestDetailIdentity() {
			return testDetailIdentity;
		}

		public void setTestDetailIdentity(TestDetailIdentity testDetailIdentity) {
			this.testDetailIdentity = testDetailIdentity;
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
			return "TestDetails [testDetailIdentity=" + testDetailIdentity + ", testType=" + testType + ", totalMarks="
					+ totalMarks + ", testTopics=" + testTopics + ", testDesc=" + testDesc + ", testDate=" + testDate
					+ "]";
		}

}
