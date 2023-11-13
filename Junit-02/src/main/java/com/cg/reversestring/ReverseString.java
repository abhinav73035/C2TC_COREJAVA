package com.cg.reversestring;

import java.util.Arrays;

public class ReverseString {
	 public String reverseString(String str) { // shr
	    	char c[]= str.toCharArray();
	    	
	    	for(int r=0;r<str.length()/2;r++) {
	    		char ch =c[r];
	    		c[r]=c[str.length()-1-r];
	    		c[str.length()-1-r]=ch;
	    	}
	    	
	    	return new String(c);
	    }
}
