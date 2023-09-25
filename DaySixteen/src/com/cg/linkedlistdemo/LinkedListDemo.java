package com.cg.linkedlistdemo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> llist = new LinkedList<>();
		System.out.println(llist);
		llist.add("Abhinav");
		llist.add("Smaiksha");
		llist.add("Karan");
		llist.add("Aditya");
		System.out.println(llist);
		System.out.println("Remove First:"+llist.removeFirst());
		System.out.println(llist);
		System.out.println("remove Last:"+llist.removeLast());
		System.out.println(llist);
		System.out.println("Remove at index:"+llist.remove(0));
		System.out.println(llist);
		llist.remove("Karan");
		System.out.println(llist);
		llist.add("Suman");
		llist.add("Azimuddin");
		llist.add("Rajeev");
		System.out.println(llist);
		llist.addFirst("Shrikant");
		System.out.println("Add first:"+llist);
		llist.addLast("Deepak");
		System.out.println("Add Last:"+llist);
		llist.add(2,"Gourav");
		System.out.println(llist);
		System.out.println("Peek First:"+llist.peek());
		System.out.println(llist);
		System.out.println("Peek last:"+llist.peekLast());
		System.out.println("pool :"+llist.poll());
		System.out.println(llist);
		System.out.println("Pool Laast:"+llist.pollLast());
		System.out.println(llist);
		System.out.println("Poll First:"+llist.pollFirst());
		System.out.println(llist);
		System.out.println("Get first:"+llist.getFirst());
        System.out.println("Get Last:"+llist.getLast());
        System.out.println("index of:"+llist.indexOf("Azimuddin"));
        llist.add("Azimuudin");
        
        llist.add("Rajeev");
        System.out.println(llist);
        System.out.println("Remove first occurance:"+llist.removeFirstOccurrence("Rajeev"));
        System.out.println(llist);
        System.out.println("Remove last occurance:"+llist.removeLastOccurrence("Azimuddin"));
        System.out.println(llist);

	}

}
