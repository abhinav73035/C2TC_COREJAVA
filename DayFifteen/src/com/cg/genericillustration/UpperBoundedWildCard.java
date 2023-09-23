package com.cg.genericillustration;

import java.util.ArrayList;

public class UpperBoundedWildCard {
	
	public static Double sum(ArrayList<? extends Number> arr) {
		double sum = 0.0;
		for(Number o:arr) {
			sum = sum + o.doubleValue();
		}
		return sum;
	}

}
