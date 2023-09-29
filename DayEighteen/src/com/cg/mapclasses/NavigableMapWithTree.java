package com.cg.mapclasses;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapWithTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableMap<Character,Integer> nmt = new TreeMap<>();
		nmt.put('A', 65);
		nmt.put('B', 66);
		nmt.put('C', 67);
		nmt.put('F', 70);
		nmt.put('D', 68);
		//nmt.put(null, 87);
		nmt.put('@',null);
		nmt.put('Z', 90);
		System.out.println(nmt);
		System.out.println(nmt.ceilingEntry('E'));
		System.out.println(nmt);
		System.out.println("First Key:"+nmt.firstKey());
		System.out.println("Last Key:"+nmt.lastKey());
		System.out.println("Higher Key:"+nmt.higherKey('D'));
		System.out.println("Lower Key:"+nmt.lowerKey('D'));
		System.out.println("Descending Key Set:"+nmt.descendingKeySet());
		System.out.println("Descending map:"+nmt.descendingMap());
		NavigableMap<Character,Integer> ndesc = nmt.descendingMap();
		System.out.println(ndesc);
		System.out.println(ndesc.headMap('A'));
		System.out.println("navigable key set:"+ndesc.navigableKeySet());
		System.out.println("Pull first entry:"+ndesc.pollFirstEntry());
		System.out.println("After pull first:"+ndesc);
		System.out.println("Pull last entry:"+ndesc.pollLastEntry());
		System.out.println("After pull last:"+ndesc);
        System.out.println("floor key"+ndesc.floorKey('D'));
        System.out.println("Entry set"+ndesc.entrySet());
        System.out.println("values"+ndesc.values());
        System.out.println("replace values:"+ndesc.replace('A', 65, 656));
        System.out.println(ndesc);
        



	}

}
