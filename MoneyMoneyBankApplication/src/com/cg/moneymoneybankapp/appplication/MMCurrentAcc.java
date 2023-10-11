package com.cg.moneymoneybankapp.appplication;

import com.cg.moneymoneybankapp.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{
	public void withdraw(float creditLimit) {
		if(getCreditLimit()>=creditLimit) {
			System.out.println(creditLimit+" :will be debited from your account: and Remaining Balance is:"+(getAccBal()-creditLimit));
			setAccBal(getAccBal()-creditLimit);
		}else {
			System.out.println("Your credit limit is less than deposit money:");
		}
	}

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [getCreditLimit()=" + getCreditLimit() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() + "]";
	}

	
	

}
