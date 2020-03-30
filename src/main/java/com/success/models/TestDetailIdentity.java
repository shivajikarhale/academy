package com.success.models;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class TestDetailIdentity implements Serializable{
	
      @NotNull	
	  private String courseId;
      @NotNull
	  private String testNumber;
	  
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
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((courseId == null) ? 0 : courseId.hashCode());
			result = prime * result + ((testNumber == null) ? 0 : testNumber.hashCode());
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			TestDetailIdentity other = (TestDetailIdentity) obj;
			if (courseId == null) {
				if (other.courseId != null)
					return false;
			} else if (!courseId.equals(other.courseId))
				return false;
			if (testNumber == null) {
				if (other.testNumber != null)
					return false;
			} else if (!testNumber.equals(other.testNumber))
				return false;
			return true;
		}
		
		@Override
		public String toString() {
			return "TestDetailIdentity [courseId=" + courseId + ", testNumber=" + testNumber + "]";
		}
		
	  
}
