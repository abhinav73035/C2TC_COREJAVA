package com.cg.genericillustration;

import java.util.List;

public class LowerBoundedWildCard {
	
	public static void display(List<? super Integer> l) {
		for(Object o:l) {
			System.out.println(o);
		}
		
	}

}
