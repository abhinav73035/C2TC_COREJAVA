package com.cg.genericillustration;

public class GenericExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericDemo<Integer> gint = new GenericDemo<Integer>();
		gint.setValues(45);
		System.out.println(gint.getValues());
		GenericDemo<Float> gfloat = new GenericDemo<Float>();
		gfloat.setValues(56.6f);
		System.out.println(gfloat.getValues());
		GenericDemo<String> gstring = new GenericDemo<String>();
		gstring.setValues("Abhinav");
		System.out.println(gstring.getValues());
		GenericDemo<Person> gperson = new GenericDemo<Person>();
		gperson.setValues(new Person("Abhinav","IES",6,"0177cs191006"));
		System.out.println(gperson);
		

	}

}
