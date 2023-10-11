package com.cg.moneymoneybankapp.appplication;

import com.cg.moneymoneybankapp.framework.BankFactory;
import com.cg.moneymoneybankapp.framework.CurrentAcc;
import com.cg.moneymoneybankapp.framework.SavingAcc;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		MMSavingAcc sa = new MMSavingAcc(accNo,accNm,accBal,isSalary);
		return sa;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		MMCurrentAcc ca = new MMCurrentAcc(accNo,accNm,accBal,creditLimit);
		return ca;
	}

}
