package com.cg.collectionillustration;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void  addListValue(ArrayList<Integer> as) {
		as.add(23);
		as.add(33);
		as.add(43);
		as.add(54);
		
	}
	public static void show(ArrayList<Integer> as) {
		for(int r=0;r<as.size();r++) {
			System.out.println(as.get(r));
		}
	}

}
