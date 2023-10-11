package com.cg.moneymoneybankapp.appplication;

import com.cg.moneymoneybankapp.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	
    private static final float MINBAL = 1500.0f;
    
	
	

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		// TODO Auto-generated constructor stub
	}

	public static float getMinbal() {
		return MINBAL;
	}

	public void withdraw(float accBal) {
		if((getAccBal()-MINBAL)>= accBal) {
		System.out.println(accBal+" :will be Debited From Your account: and Remaining Balance is :"+(getAccBal()-accBal));
		setAccBal(getAccBal()-accBal);
		}else {
			System.out.println("Insufficient Balance:");
		}
	}

	@Override
	public String toString() {
		return "MMSavingAcc [isSalary()=" + isSalary() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + "]";
	}

	
	
}
