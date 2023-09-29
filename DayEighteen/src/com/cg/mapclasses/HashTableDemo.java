package com.cg.mapclasses;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,Integer> htable = new Hashtable<>();
		htable.put(67, 6700);
		htable.put(68, 6800);
		htable.put(69, 6900);
		// htable.put(70, null);
		htable.put(78,65);
		//.put(null, 96); its not accept null values and null key
		System.out.println(htable);
		System.out.println(htable.contains(78));
		System.out.println(htable.containsKey(68));
		

	}

}
