package com.cg.collectionillustration;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> cin = new ArrayList<Integer>();
		cin.add(34);
		cin.add(56);
		cin.add(32);
		cin.add(78);
		cin.add(23);
		cin.add(34);
		// we add duplicate value
		cin.remove(32);
		System.out.println(cin);
		System.out.println(cin.hashCode());
		System.out.println(cin.isEmpty());
		System.out.println(cin.equals(34));
		Collection<Integer> cinn = new ArrayList<Integer>();
		cinn.add(34);
		System.out.println(cin.equals(cinn));
		cin.retainAll(cinn);// its remove unmatched item
		System.out.println(cin);
		System.out.println(cinn);
		Object a[] = cinn.toArray();
		System.out.println(cinn);
		System.out.println(cinn.getClass());
		System.out.println(a[0] + " Class is "+ a.getClass());
		String s = cinn.toString();
		System.out.println("String "+s + "Class is "+s.getClass());

	}

}
