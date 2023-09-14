package com.cg.multithreadingoperation;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	RunnableOne rone = new RunnableOne();
		
	//	RunnableTwo rtwo = new RunnableTwo();
		
		Runnable rone = new RunnableOne();
		Runnable rtwo = new RunnableTwo();
	//xxx	 rone.start(); In Runnable Interface have not start method
		
	//xx	rtwo.start();
        // we create a Thread class then you call it
		Thread tone = new Thread(rone);
		Thread ttwo = new Thread(rtwo);
		tone.start();
		ttwo.start();// you pass Runnable Interface Referance only
		
	}

}
