package com.cg.deqeuedemo;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new ArrayDeque<>();
	//	queue.add(null);  not accept null value
		queue.add("Abhinav");
		queue.add("Shyam");
		queue.add("Rishabh");
		System.out.println(queue);
		queue.offer("Shyam");
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println("Poll operation:"+queue.poll());
		System.out.println("after poll operation:"+queue);
		System.out.println("remove operation:"+queue.remove());
		System.out.println("After removal operation:"+queue);
		System.out.println("elements method:"+queue.element());
		System.out.println(queue);
		System.out.println(queue.getClass());
		System.out.println("is empty:"+queue.isEmpty());
		System.out.println("Hashcode:"+queue.hashCode());
		

	}

}
