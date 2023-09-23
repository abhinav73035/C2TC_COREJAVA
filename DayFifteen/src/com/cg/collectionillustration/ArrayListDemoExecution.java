package com.cg.collectionillustration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemoExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayObject = new ArrayList<Integer>();
		System.out.println("Ensure capacity of arraylist:"+arrayObject.subList(0, 0));
		ArrayListDemo.addListValue(arrayObject);
		ArrayListDemo.show(arrayObject);
		arrayObject.set(2, 35);
		System.out.println("set element at index two:"+arrayObject);
		arrayObject.add(2,67);
		System.out.println("Add element at index 2:"+arrayObject);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(34);
		list.add(23);
		list.add(234);
		list.add(123);
		//list.subList(0, 0)
		
		System.out.println(arrayObject.subList(1, 4));
		Iterator<Integer> itr =arrayObject.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		} 
		ListIterator it = list.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
