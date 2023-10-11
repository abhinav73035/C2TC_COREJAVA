package com.cg.moneymoneybankapp.client;

import java.util.Scanner;

import com.cg.moneymoneybankapp.appplication.MMBankFactory;
import com.cg.moneymoneybankapp.appplication.MMCurrentAcc;
import com.cg.moneymoneybankapp.appplication.MMSavingAcc;
import com.cg.moneymoneybankapp.framework.CurrentAcc;
import com.cg.moneymoneybankapp.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sobjr = new Scanner(System.in);
     MMBankFactory mbf = new MMBankFactory();
     SavingAcc sa = new MMSavingAcc(1234,"Abhinav",1500000.0f,true);
     System.out.println("Enter Withdrawl Amount for saving account:");
     float deposit = sobjr.nextFloat();
     sa.withdraw(deposit);
     System.out.println(sa.toString());
     CurrentAcc ca = new MMCurrentAcc(1734,"Aditya",4500000.0f,4000000.0f);
     System.out.println("Enter withdrawl amount for current account:");
     float depositcurr = sobjr.nextFloat();
     ca.withdraw(depositcurr);
     System.out.println(ca);
     
     
	}

}
