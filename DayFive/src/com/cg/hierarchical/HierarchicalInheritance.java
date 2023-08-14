package com.cg.hierarchical;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(1,"IES COLLEGE OF TECHNOLOGY","cse");
		System.out.println(s);
		Employee e=new Employee(70000,"software Developer");
		System.out.println(e);
		s.setGender("Male");
		s.setPersonname("Abhinav Kumar");
        System.out.println(s);
        System.out.println(e);
	}

}
