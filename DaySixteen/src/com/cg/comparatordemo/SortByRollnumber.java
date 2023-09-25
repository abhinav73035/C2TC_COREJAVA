package com.cg.comparatordemo;

import java.util.Comparator;

public class SortByRollnumber implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.rollNumber-s2.rollNumber;
	}

}
