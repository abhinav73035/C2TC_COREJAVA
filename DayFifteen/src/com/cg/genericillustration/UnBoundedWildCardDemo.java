package com.cg.genericillustration;

import java.util.Arrays;
import java.util.List;

public class UnBoundedWildCardDemo {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3);
		UnBoundedWildcard.display(l);
		List<Double> lNumber = Arrays.asList(43.8,56.4,32.9);
		UnBoundedWildcard.display(lNumber);
		List<Float> lFloat = Arrays.asList(2.0f,43.5f,42.5f);
		UnBoundedWildcard.display(lFloat);
		List<String> lString = Arrays.asList("Abhinav","Shalu","Aditya","Deepak");
		UnBoundedWildcard.display(lString);
		Person p[] = new Person[] {new Person("Ankit","IES",34,"0177cs191034"),new Person("Shashank","VNS",23,"0122191023")};
		List<Person> objectPerson = Arrays.asList(p);
		UnBoundedWildcard.display(objectPerson);

	}

}
