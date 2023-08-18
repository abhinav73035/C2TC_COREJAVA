package com.cg.assosotation;

public class Assositation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Address a=new Address();
		 Person p=new Person("Abhinav Kumar",a); 
		 */
		/*
		Person p=new Person("Abhinav Kumar",new Address("st-10","sec-A-30","NEWDELHI",460011));
		*/
		
		Address a=new Address("st-10","sec-A-30","NEWDELHI",460011);
		Person p=new Person("Abhinav Kumar",a);
		System.out.println(p.getName());
		String s=String.valueOf(a.toString());
		System.out.println(s.toString());
		

	}

}
