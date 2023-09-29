package com.cg.deqeuedemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> prq = new PriorityQueue<>();
		prq.add("Ashish");
		prq.add("Patna");
		prq.add("Hyderabad");
		prq.add("Banglore");
		//prq.add(null);
		prq.add("Saharsa");
		prq.add("Madhepura");
		System.out.println(prq);
		System.out.println(prq.remove());
		System.out.println(prq.size());
		System.out.println(prq.equals("Saharsa"));

	}

}
