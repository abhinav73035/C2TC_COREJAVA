package com.cg.moneymoneybankapp.framework;

public abstract class SavingAcc extends BankAcc{
	private  boolean isSalary;
	private static final float MINBAL = 1500;
	
	
	
	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalary) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
		this.isSalary = isSalary;
	}
	
	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	public static float getMinbal() {
		return MINBAL;
	}

	public void withdraw(float accBal) {
		if((getAccBal()-MINBAL)>= accBal) {
			System.out.println(accBal+"will be Debited from your account: and remaining amount is:"+(getAccBal()-accBal));
			setAccBal(getAccBal()-accBal);
		}else {
			System.out.println("Insufficient Balance");
		}
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", isSalary()=" + isSalary() + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
