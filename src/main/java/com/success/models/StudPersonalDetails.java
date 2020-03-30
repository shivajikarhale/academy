package com.success.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="StudentPersonalDetails")
public class StudPersonalDetails {
	@Id
	private String studentId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String motherName;
	private String gender;
	private String dateOfBirth;
	private String aadharNumber;
	private String govtIdType;
	private String govtId;
	private String mobileNo;
	private String email;
	private String fatherOccupation;
	private String motherOccupation;
	private String firstCourse;
	@JsonFormat (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date registrationDate;
	
	
	public StudPersonalDetails() {
		super();
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getGovtIdType() {
		return govtIdType;
	}

	public void setGovtIdType(String govtIdType) {
		this.govtIdType = govtIdType;
	}

	public String getGovtId() {
		return govtId;
	}

	public void setGovtId(String govtId) {
		this.govtId = govtId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFatherOccupation() {
		return fatherOccupation;
	}

	public void setFatherOccupation(String fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}

	public String getMotherOccupation() {
		return motherOccupation;
	}

	public void setMotherOccupation(String motherOccupation) {
		this.motherOccupation = motherOccupation;
	}
	
	public String getFirstCourse() {
		return firstCourse;
	}

	public void setFirstCourse(String firstCourse) {
		this.firstCourse = firstCourse;
	}


	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Override
	public String toString() {
		return "StudPersonalDetails [studentId=" + studentId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", motherName=" + motherName + ", gender=" + gender + ", dateOfBirth="
				+ dateOfBirth + ", aadharNumber=" + aadharNumber + ", govtIdType=" + govtIdType + ", govtId=" + govtId
				+ ", mobileNo=" + mobileNo + ", email=" + email + ", fatherOccupation=" + fatherOccupation
				+ ", motherOccupation=" + motherOccupation + ", firstCourse=" + firstCourse + ", registrationDate="
				+ registrationDate + "]";
	}


}
