package com.cg.genericillustration;

public class GenericMethod {
	public <E>  void genericMethod(E[] element){
		for(E elements:element) {
			System.out.println(elements);
		}
	}

}
