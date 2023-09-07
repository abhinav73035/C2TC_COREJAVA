package com.cg.arrays;
import java.util.Scanner;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sobjr = new Scanner(System.in);
		// int size=sobjr.nextInt();
		Student[] s=new Student[2];//create Student array type
		System.out.println("welcome to Student board");
		for(int r=0;r<s.length;r++) {
			s[r]=new Student();//student array object
			System.out.println("Enter Information of Student"+(r+1));
			System.out.println("enter student name");
			String names=sobjr.nextLine();// 
		//	s[r].setName(names);
			System.out.println("enter Student rollnumber");
			String rollNumbers=sobjr.nextLine();
			//s[r].setRollNumber(rollNumbers);
			System.out.println("enter college name");
			String collegeNames=sobjr.nextLine();
		//	s[r].setCollegeName(collegeNames);
		//	sobjr.nextLine();
			System.out.println("enter college code");
			int collegeCodes=sobjr.nextInt();
			//s[r].setCollegeCode(collegeCodes);
		//	sobjr.nextLine();
			s[r].setValue(names, rollNumbers, collegeNames, collegeCodes);
			//System.out.println("done"+r+1);
			sobjr.nextLine();
		}
		for(int r=0;r<s.length;r++) {
			s[r].getValue();
		}
		

	}

}
