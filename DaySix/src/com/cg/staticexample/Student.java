package com.cg.staticexample;

public class Student {
	private String rollNo;
	private String name;
	private static int batchNo;
	private static int collegeCode;
	private static String collegeName;
	
	public Student(String rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getBatchNo() {
		return batchNo;
	}
	public static void setBatchNo(int batchNo) {
		Student.batchNo = batchNo;
	}
	public static int getCollegeCode() {
		return collegeCode;
	}
	public static void setCollegeCode(int collegeCode) {
		Student.collegeCode = collegeCode;
	}
	public static String getCollegeName() {
		return collegeName;
	}
	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}
	

}
