package com.cg.genericillustration;

public class MinMaxImp<T extends Comparable<T>> implements MinMax<T> {
	T[] values;

	public MinMaxImp(T[] arr) {
	   values=arr;
	}
	
	public T max() {
		T o1 = values[0];
		for(int r=1;r<values.length;r++) {
			if(o1.compareTo(values[r])<0)
				o1 = values[r];
		}
		return o1;
	}
    
	public T min() {
		T o1 = values[0];
		for(int r=1;r<values.length;r++) {
			if(o1.compareTo(values[r])>0)
				o1 = values[r];
		}
		return o1;
	}

	}
