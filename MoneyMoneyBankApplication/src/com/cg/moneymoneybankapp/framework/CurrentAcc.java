package com.cg.moneymoneybankapp.framework;

public abstract class CurrentAcc extends BankAcc{
	private final float creditLimit;
	
	
	
	public void withdraw(float creditLimit) {
		if(this.creditLimit>=creditLimit) {
			System.out.println(creditLimit+" will be debited from your Current bank account: and remaining amount is:"+(getAccBal()-creditLimit));
			setAccBal(getAccBal()-creditLimit);
		}else {
			System.out.println("Credit limit is Exceed:");
		}
	}
	
	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
		this.creditLimit=creditLimit;
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	public float getCreditLimit() {
		return creditLimit;
	}
	

}
