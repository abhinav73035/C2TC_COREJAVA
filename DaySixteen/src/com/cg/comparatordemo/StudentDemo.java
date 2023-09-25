package com.cg.comparatordemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList< Student> ls = new ArrayList<Student>();
		Student[] sone = {new Student(6,"Abhinav"),new Student(34,"Shimpi"),new Student(23,"Princee"),new Student(45,"Krishna")};
		for(int i=0;i<sone.length;i++) {
			ls.add(sone[i]);
		}
		SortByRollnumber sbrn = new SortByRollnumber();
		Collections.sort(ls,sbrn);
		System.out.println(ls);
		Collections.sort(ls,new SortByName());
		
		
		

	}

}
