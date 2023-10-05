package com.cg.streamapidemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDistinctElement {

	public static void main(String[] args) {
		// if you want a operation using stream 1st you convert stream using stream() function
		// TODO Auto-generated method stub
     List<Integer> ls = new ArrayList<>();
     ls.add(34);
     ls.add(78);
     ls.add(89);
     ls.add(34);
     ls.add(78);
     ls.stream().distinct().forEach(System.out::println);
     Integer sum = ls.stream().distinct().reduce(0,(c,e)->c+e);
     System.out.println("Sum of Distinct Element:"+sum);
     List<String> str = Arrays.asList("Abhinav","Aditya","Shiksha","Suman","Deepak");
     Long counts =  str.stream().count();// str-- convert into stream and then count it
     System.out.println("Count is:"+counts);
	}

}
