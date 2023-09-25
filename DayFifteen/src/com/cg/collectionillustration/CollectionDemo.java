package com.cg.collectionillustration;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Collection nums = new ArrayList();
     
       System.out.println(nums.size());
      // nums.
       nums.add("Abhinav");
       nums.add(18);
       nums.add(true);
       nums.add(34.7f);
       nums.add(34.8);
       System.out.println(nums);
       //by default collection is object type
       // collection interface have not index method and get method
       // xxx nums.add(2,95);
       nums.remove(18);
       System.out.println(nums);
       Collection rnums = new ArrayList();
       rnums.add("Abhinav");
       rnums.add(true);
       System.out.println(rnums);
       System.out.println("------- after remove the elements ------");
       nums.removeAll(rnums);// it is the best use of remove method
       System.out.println(nums);
       nums.clear();
       System.out.println(nums);
       
       
       
       
	}

}
