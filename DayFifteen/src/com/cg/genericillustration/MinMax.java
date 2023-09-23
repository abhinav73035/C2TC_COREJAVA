package com.cg.genericillustration;

public interface MinMax<T extends Comparable<T> >{
	T min();
	T max();

}
