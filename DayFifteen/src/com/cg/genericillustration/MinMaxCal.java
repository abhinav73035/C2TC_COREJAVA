package com.cg.genericillustration;

public class MinMaxCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Float[] f = {3.3f,34.4f,56.4f,23.9f,17.45f};
      MinMaxImp<Float> obj = new MinMaxImp<>(f);
      System.out.println("Minimum values is:"+obj.min());
      System.out.println("Maximum values is:"+obj.max());
      String[] str = {"Abhinav","Shalu","Shimpi","Kamakshi","Samiksha","Deepak"};
      MinMaxImp<String> objOne = new MinMaxImp<>(str);
      System.out.println("Minimum string is:"+objOne.min());
      System.out.println("Maximum string is:"+objOne.max());
      Person[] pobject = new Person[] {new Person("Abhinav","IES",6,"0177cs191006"),new Person("Abhay","IES",4,"0177cs191004"),new Person("Shayam","IES",56,"0177cs191056"),new Person("Rahul","IES",45,"0177cs191045")};
      MinMaxImp<Person> objTwo = new MinMaxImp<>(pobject);
      System.out.println("Minimum collegeId is:"+objTwo.min());
      System.out.println("Maximum collegeId is:"+objTwo.max());
	}

}
