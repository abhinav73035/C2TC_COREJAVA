package com.cg.lambdademo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ls = new ArrayList<>();
		ls.add("Aditya");
		ls.add("Abhinav");
		ls.add("Rajeev");
		ls.add(34);
	/*	
         for(Object o: ls) {
        	 System.out.println(o);
         }
         //// it is external support
         Iterator itr = ls.iterator();
         while(itr.hasNext()) {
        	 System.out.println(itr.next());
         } */
         //it is internal support
         ls.forEach((n)->System.out.println(n));
		

	}

}
