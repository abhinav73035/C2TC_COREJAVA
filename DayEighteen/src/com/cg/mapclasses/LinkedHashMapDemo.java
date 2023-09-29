package com.cg.mapclasses;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
public static void main(String[] args) {
	/*
	 * Java LinkedHashMap contains values based on the key.
     *  Java LinkedHashMap contains unique elements.
     * Java LinkedHashMap may have one null key and multiple null values.
     *  Java LinkedHashMap is non synchronized.
     *  LinkedHashMap maintains insertion order.
     *  The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
	 */
	LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
	lhm.put(1,"Siddsrth");
	lhm.put(2,"Aditya");
	lhm.put(null, "Sonam");
	lhm.put(null, null);
	lhm.put(5, null);
	lhm.put(8,"Abhishek");
	lhm.put(48,"Sanjay");
	System.out.println(lhm);
	
}
}
