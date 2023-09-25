package com.cg.setdemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s =new HashSet<>();
		s.add(2);
		s.add(34);
		s.add(46);
		s.add(2);
		s.add(null);
		s.add(34);
		SetExample.show(s);
		Set<Integer> sobj = new HashSet<>();
		sobj.add(23);
		sobj.add(96);
		sobj.add(29);
		sobj.add(2);
		s.removeAll(sobj);// difference between two set
		// SetExample.show(s);
		System.out.println("Difference:"+s);
		System.out.println("Union Operation:"+s.addAll(sobj));
		System.out.println("Union all Result:"+s);
		s.retainAll(sobj);
		System.out.println("intersection:"+s);
	    System.out.println(s.isEmpty());
	    
		
		
		
		

	}

}
