package com.cg.genericillustration;

import java.util.ArrayList;

public class UpperBoundedWildCardDemo {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> objectOne = new ArrayList<>();
        objectOne.add(2);
        objectOne.add(34);
        objectOne.add(23);
        System.out.println("Integer sum " +UpperBoundedWildCard.sum(objectOne));
        ArrayList<Float> objectTwo = new ArrayList<>();
        objectTwo.add(23.6f);
        objectTwo.add(12.9f);
        System.out.println("Float sum " + UpperBoundedWildCard.sum(objectTwo));
        ArrayList<Double> objectThree = new ArrayList<>();
        objectThree.add(45.9);
        objectThree.add(234.87);
        System.out.println("Double sum " +UpperBoundedWildCard.sum(objectThree));
        ArrayList<String> objectFour = new ArrayList<>();
        objectFour.add("2");
        objectFour.add("5");
     // xxx string not supported only support long byte short integer float double   System.out.println("String value sum " +UpperBoundedWildCard.sum(objectFour));
	}

}
