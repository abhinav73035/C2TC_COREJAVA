/**
 * 
 */
package com.cg.genericillustration;

import java.util.Arrays;
import java.util.List;

public class LoweBoundedWildCardDemo {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3);
		LowerBoundedWildCard.display(l);
		List<Number> lNumber = Arrays.asList(4,5,6);
		LowerBoundedWildCard.display(lNumber);
		List<Float> lFloat = Arrays.asList(2.0f,43.5f,42.5f);
	// xxx	LowerBoundedWildCard.display(lFloat); 

	}

}
