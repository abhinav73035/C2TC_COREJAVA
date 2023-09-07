package com.cg.arrays;

import java.util.Arrays;
//import java.util.Arrays.*;
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr= {45,34,98,23,6};
      String s=Arrays.toString(arr);
    Arrays.sort(arr);
    for(int r:arr) {
    System.out.println(r);}
    System.out.println(s);
    int[] arr2=Arrays.copyOf(arr, 0);// no element here---0
    for(int r:arr2) {
        System.out.println(r);}
    int[] arr3=Arrays.copyOf(arr,7);// you customized it according to you
    for(int r:arr3) {
        System.out.println(r);}
    Arrays.fill(arr, 3);
    for(int r:arr)
        System.out.println(r);
      
	}

}
