package com.cg.multithreadingoperation;

public class RunnableOne implements Runnable{
	// this is Runnable class
	// in runnable class have a not start method its cantain run method
	
  public void run() {
	  for(int r=0;r<10;r++) {
		  System.out.println("hi");
	  }
  }
}
