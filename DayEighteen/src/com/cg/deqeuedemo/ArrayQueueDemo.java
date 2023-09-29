package com.cg.deqeuedemo;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> arde = new ArrayDeque<>();
		//arde.add(null); its follow insertion order
		arde.add(2);
		arde.add(3);
		arde.add(34);
		//arde.add(null);
		arde.add(5);
		arde.add(48);
		System.out.println(arde);
		arde.addFirst(58);
		System.out.println(arde);
		arde.addLast(23);
		Iterator<Integer> itr = arde.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
        System.out.println("get first:"+arde.getFirst());
        System.out.println("get last:"+arde.getLast());
        System.out.println("Peekfirst:"+arde.peekFirst());
        System.out.println("Peek last:"+arde.peekLast());
        System.out.println("Pool first"+arde.pollFirst());
        System.out.println("Pool last:"+arde.pollLast());
        System.out.println("Pop :"+arde.pop());
        System.out.println(arde);
        System.out.println("remove:"+arde.remove());
        System.out.println("remove:"+arde.removeFirst());
        System.out.println("remove:"+arde.removeLast());
        System.out.println(arde);
	}

}
