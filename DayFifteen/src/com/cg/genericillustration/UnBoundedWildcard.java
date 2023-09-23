package com.cg.genericillustration;

import java.util.List;

public class UnBoundedWildcard {
	public static void display(List<?>  arr) {
		for(Object o:arr) {
			System.out.println(o);
		}
	}

}
