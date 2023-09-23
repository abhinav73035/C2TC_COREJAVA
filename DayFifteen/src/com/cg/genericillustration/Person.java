package com.cg.genericillustration;
import java.util.*;

public class Person implements Comparable<Person>  {
	String name;
	String collegeName;
	int rollNumber;
	String collegeId;
	public Person(String name, String collegeName, int rollNumber, String collegeId) {
		
		this.name = name;
		this.collegeName = collegeName;
		this.rollNumber = rollNumber;
		this.collegeId = collegeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", collegeName=" + collegeName + ", rollNumber=" + rollNumber + ", collegeId="
				+ collegeId + "]";
	}
	@Override
	public int compareTo(Person o) {
		
		return this.collegeId.compareTo(o.collegeId);
	}
	

}
