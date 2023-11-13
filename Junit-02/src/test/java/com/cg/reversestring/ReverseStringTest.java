package com.cg.reversestring;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void test() {
		ReverseString s = new ReverseString();
		String actual = s.reverseString("abhinav");
		String expected = "vanihba";
		assertEquals(expected,actual);
	}

}
