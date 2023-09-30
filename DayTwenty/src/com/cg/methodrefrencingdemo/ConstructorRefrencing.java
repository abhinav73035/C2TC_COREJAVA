package com.cg.methodrefrencingdemo;

public class ConstructorRefrencing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Messagable msgb = Messsage::new;
		msgb.getMessage("Abhinav");

	}

}
