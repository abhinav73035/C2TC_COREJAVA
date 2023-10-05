package com.cg.streamapidemo;

import java.util.Arrays;
import java.util.List;

public class FindFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst = Arrays.asList(1,3,15,78,55,89,60,67,35);// static input of list
		// find first multiple of 5
		
		for(Integer n:lst) {
			if(n%5==0) {
				System.out.println("First occurence multiple of 5 is:"+n);
				break;
			}
		}
		// you can use to print a list using stream and method referance
		lst.stream().limit(4).forEach(System.out::println);
		
		// you can use stream api as well as
		System.out.println(lst.
				stream().
				filter(i->i%5==0).
				map(i->i*2).
				findFirst());
		

	}

}
