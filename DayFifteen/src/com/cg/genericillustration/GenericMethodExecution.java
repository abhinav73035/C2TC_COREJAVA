package com.cg.genericillustration;

import java.util.Collections;

public class GenericMethodExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethod gm =  new GenericMethod();
	String str[]= {"Abhinav","Deepak","Shalu","Aditya","Kamakshi"};
		gm.genericMethod(str);
	//	Collections.sort(gm.genericMethod());
		gm.genericMethod(new Person[] {new Person("Abhinav","IES",6,"0177cs191006"),new Person("Aditya","IES",18,"0177cs191018")});
		
		

	}

}
