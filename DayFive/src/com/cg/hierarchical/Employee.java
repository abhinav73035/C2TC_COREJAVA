package com.cg.hierarchical;

public class Employee  extends Person{
	private float salary;
	private String desingnation;
public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String personname, String gender) {
		super(personname, gender);
		// TODO Auto-generated constructor stub
	}

public Employee(float salary, String desingnation) {
	super();
	this.salary = salary;
	this.desingnation = desingnation;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public String getDesingnation() {
	return desingnation;
}
public void setDesingnation(String desingnation) {
	this.desingnation = desingnation;
}
@Override
public String toString() {
	return "Employee [salary=" + salary + ", desingnation=" + desingnation + ", getPersonname()=" + getPersonname()
			+ ", getGender()=" + getGender() + "]";
}


}
