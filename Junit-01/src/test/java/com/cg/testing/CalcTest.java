package com.cg.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		Calc c  =new Calc();
		int actualResult = c.divide(45, 5);
		int expectedResult = 9;
		assertEquals(expectedResult,actualResult);
		
		
	}

}
