package com.cg.sortedtreesetdemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * SortedSet s = new TreeSet<>(); //s.add(null); s.add("rajiv");
		 * s.add("Abhinav"); s.add(23); s.add(true); s.add(null);
		 */
		// System.out.println(s); its gives runtime exception because they not sort the element(hetrogenius type)
		TreeSet<Integer> sOne = new TreeSet<>();
		sOne.add(23);
		sOne.add(45);
		sOne.add(13);
		// sOne.add(null);
		sOne.add(19);
		System.out.println(sOne);
		System.out.println(sOne.ceiling(23));
		System.out.println(sOne.tailSet(19, true));
		SortedSet<Integer> s = sOne.tailSet(19,false);
		System.out.println(s);
		s = sOne.subSet(13, 23);
		System.out.println(s.first()+" "+s.last());
		System.out.println(s.headSet(23));
		System.out.println(sOne.floor(22));
		System.out.println(sOne.higher(35));
		System.out.println(sOne.lower(14));
		System.out.println(sOne.descendingSet());
		System.out.println(sOne.pollFirst());
		System.out.println(sOne.pollLast());
		
		
		

	}

}
