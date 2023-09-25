package com.cg.setdemo;

import java.util.Collection;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet<String> hs = new HashSet<>();
        hs.add("Abhinav");
        hs.add("Aditya");
        hs.add("rajesh");
        System.out.println(hs);
        HashSet<String> hss = (HashSet<String>) hs.clone();
        System.out.println(hss);
        hss.clear();
        System.out.println(hss);
      // cant do it  Collection.sort(hs); we use comperable and comperator
	}

}
