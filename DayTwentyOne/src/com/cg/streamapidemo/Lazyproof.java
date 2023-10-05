package com.cg.streamapidemo;

import java.util.Arrays;
import java.util.List;

public class Lazyproof {
	public static boolean isDivisible(int i) {
		System.out.println("In Divisible :"+i);
		return i%5==0;
	}
	public static int mapDouble(int i) {
		System.out.println("In mapDouble :"+i);
		return i*2;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,20,35,45,13,47,26,65,16,19,55);
		System.out.println(list.stream()
				               .filter(Lazyproof::isDivisible)
				               .map(Lazyproof::mapDouble)
				               .findFirst()
				               .orElse(0));
	}

}
