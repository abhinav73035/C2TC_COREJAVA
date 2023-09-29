package com.cg.mapclasses;

import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedWithTreemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// its give the resul in sorted form(key is sorted)
		SortedMap<Integer,String> srt = new TreeMap<>();
		System.out.println(srt);
		srt.put(1,"Abhinav");
		srt.put(43, null);
		srt.put(2,"Abhishek");
		//srt.put(null, null);
		srt.put(4,"Sonal" );
		srt.put(5, null);
		//srt.put(null, "Shimpi"); you cant pass null as a keyword
		srt.put(7,"Shalu");
		srt.put(3, null);
		System.out.println("Sorted map:"+srt);
	    Iterator<String> itrValues = srt.values().iterator();
	    while(itrValues.hasNext()) {
	    	String s = itrValues.next();
	    	System.out.println(s);
	    }
	    System.out.println("Sub method:"+srt.subMap(1,3));// key value
	    System.out.println("Tail method:"+srt.tailMap(2));
	    System.out.println("head map:"+srt.headMap(4));
	    
	    
		

	}

}
