package com.cg.throwthrowsexample;
import java.io.*;

public class ThrowsExample {
	
     void myMethod(int num) throws Exception{
    	 if(num==1) {
    		 throw new IOException("IOException Occured");
    	 }else {
    		 throw new ClassNotFoundException("ClassNotFoundException");
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
        	 ThrowsExample th = new ThrowsExample();
        	 th.myMethod(2);
         }catch(Exception e) {
        	 System.out.println(e);
         }
	}

}
