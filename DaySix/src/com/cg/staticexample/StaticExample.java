package com.cg.staticexample;

public class StaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  StaticMethod sm=new StaticMethod();
  sm.nonStaticMethodAction();
  StaticMethod.staticmethodAction();
  Student s=new Student("Abhinav Kumar","0177cs191006");
  Student.setBatchNo(2019);
  Student.setCollegeCode(177);
  Student.setCollegeName("IES COLLEGE OF TECHNOLOGY BHOPAL");
  System.out.println(s.getName());
  System.out.println(s.getRollNo());
  System.out.println(Student.getBatchNo());
  System.out.println(Student.getCollegeCode());
  System.out.println(Student.getCollegeName());
  Student s2=new Student("Aditya","0177cs191018");
  System.out.println(s2.getName());
  System.out.println(s2.getRollNo());
  System.out.println(Student.getBatchNo());
  System.out.println(Student.getCollegeCode());
  System.out.println(Student.getCollegeName());
  StaticBlock sb = new StaticBlock();
 
  
	}

}