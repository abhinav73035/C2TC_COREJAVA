package com.cg.streamapidemo;

import java.util.Arrays;
import java.util.List;

public class SumDemo {
	List<Integer> ls = Arrays.asList(67,34,23,9,78,56);
	public   void display() {
		ls.forEach(n->System.out.println(n));
	}

}
