package com.cg.hierarchical;

public class Person {
	private String personname;
	private String gender;
	public Person() {
		//super();
		// TODO Auto-generated constructor stub
		System.out.println("Person class object created");
	}
	public Person(String personname, String gender) {
		//super();
		this.personname = personname;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Person [personname=" + personname + ", gender=" + gender + "]";
	}
	public String getPersonname() {
		return personname;
	}
	public void setPersonname(String personname) {
		this.personname = personname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
