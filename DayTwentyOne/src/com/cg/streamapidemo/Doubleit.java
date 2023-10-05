package com.cg.streamapidemo;

import java.util.Arrays;
import java.util.List;

public class Doubleit {
	public   void doubleit(int i) {
		System.out.println(i*2);
	}

	public static void main(String[] args) {
		Doubleit d = new Doubleit();
		// TODO Auto-generated method stub
		List<Integer> is = Arrays.asList(7,2,56,78,6);
		is.forEach(i->d.doubleit(i));
		is.forEach(d::doubleit);

	}

}
