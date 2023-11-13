package com.cg.shaperectangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShapeRectangleTest {

	@Test
	public void test() {
		ShapeRectangle s = new ShapeRectangle();
		int actual = s.shapeRectangle(25, 5);
		int expected = 25*5;
		assertEquals(expected,actual);
	}
	@Test
	public void testOne() {
		ShapeRectangle s = new ShapeRectangle();
		int actual = s.circleShape(5);
		int expected = (int)(3.14)*(5*5);
		assertEquals(expected,actual);
	}

}
