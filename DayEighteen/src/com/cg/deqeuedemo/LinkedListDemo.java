package com.cg.deqeuedemo;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> qlink = new LinkedList<>();
		qlink.add(1);
		qlink.add(null);
		qlink.add(2);
		qlink.add(3);
		qlink.add(4);
		qlink.add(5);
		qlink.add(6);
		System.out.println(qlink);
		System.out.println(qlink.peek());
        System.out.println(qlink.remove());
        System.out.println(qlink.poll());
        System.out.println(qlink);
        System.out.println();
	}

}
