package com.success.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class InstituteCourses {
	
	private String courseName;
	@Id
	private String courseId; 
	@JsonFormat (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private	Date startDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private	Date endDate; 
	private	long courseFees;
	private String courseFaculties;
	private String courseDesc;
	
	public InstituteCourses() {
		super();
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public long getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(long courseFees) {
		this.courseFees = courseFees;
	}

	public String getCourseFaculties() {
		return courseFaculties;
	}

	public void setCourseFaculties(String courseFaculties) {
		this.courseFaculties = courseFaculties;
	}

	public String getCourseDesc() {
		return courseDesc;
	}

	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}

	@Override
	public String toString() {
		return "InstituteCourses [courseName=" + courseName + ", courseId=" + courseId + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", courseFees=" + courseFees + ", courseFaculties=" + courseFaculties
				+ ", courseDesc=" + courseDesc + "]";
	}
	
	
}
