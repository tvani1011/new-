package com.demo;

public class Student {
	private int studentId;
	private String firstname;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstname=" + firstname + "]";
	}

}
