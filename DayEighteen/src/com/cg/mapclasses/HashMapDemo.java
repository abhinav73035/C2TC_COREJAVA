package com.cg.mapclasses;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> shm = new HashMap<>();
		System.out.println(shm);
		shm.put(1, 10);
		shm.put(2, 20);
		shm.put(3, 30);
		shm.put(4,40);
		shm.put(5, null);
		shm.put(34, 42);
		shm.put(6,60);
		shm.put(7, null);
		shm.put(null, 80);
		shm.put(9,90);
		System.out.println(shm);
		System.out.println("its key parameter:"+shm.get(6));
		System.out.println("its values parameter:"+shm.get(10));
		for(Map.Entry m:shm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		System.out.println(shm.values());
		HashMap<Integer,Integer> shnOne = new HashMap<Integer,Integer>();
		
		shnOne = (HashMap<Integer, Integer>) shm.clone();
		System.out.println("Copy to another hashmap:"+shnOne);
		Iterator<Integer> keySetIterator = shm.keySet().iterator();
		while(keySetIterator.hasNext()) {
			Integer key = keySetIterator.next();
			
			System.out.println(key+" "+shm.get(key));
		}
		System.out.println(shm);
       
	}
	

}
