package com.cg.setdemo;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedHashSet<String> lhs = new LinkedHashSet<>();
     System.out.println(lhs.isEmpty());
     lhs.add("Patna");
     lhs.add(null);
     lhs.add("Bhagalpur");
     lhs.add("Saharsa");
     lhs.add("Delhi");
     System.out.println(lhs);
     System.out.println(lhs.size());
     System.out.println(lhs.contains("Patna")); 
     
	}
    

}
