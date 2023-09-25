package com.cg.setdemo;

import java.util.Iterator;
import java.util.Set;



public class SetExample {
	public static void show(Set<Integer> s) {
		Iterator itr = s.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
	}

}
