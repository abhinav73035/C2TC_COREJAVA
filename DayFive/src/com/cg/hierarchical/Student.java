package com.cg.hierarchical;

public class Student extends Person {
	private int id;
	private String collegename;
	private String branch;
	public Student(int id, String collegename, String branch) {
		super();
		this.id = id;
		this.collegename = collegename;
		this.branch = branch;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", collegename=" + collegename + ", branch=" + branch + ", getPersonname()="
				+ getPersonname() + ", getGender()=" + getGender() + "]";
	}
	
	

}
