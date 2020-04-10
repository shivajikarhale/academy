package com.success.models;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
public class StudentRegistration {
	
	private String firstName;
	private String lastName;
	private String gender;
	private String mobileNumber;
	private String email;
	@JsonFormat (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dob;
	private String password;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "StudentRegistration [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", mobileNumber=" + mobileNumber + ", email=" + email + ", dob=" + dob + ", password=" + password
				+ "]";
	}

	
}
