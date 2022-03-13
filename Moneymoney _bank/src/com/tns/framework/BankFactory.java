package com.tns.framework;

public abstract class BankFactory {
	
	public abstract SavingAcc getNewSavingAccount(int AccNo,string accNm,float accBal,boolean isSalaried);
	
	public abstract CurrentAcc getNewCurrentAccount(int AccNo, string accNm, float accBal, float creditLimit);

	public SavingAcc getNewSavingAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	public CurrentAcc getNewCurrentAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBa, boolean isSalary) {
		// TODO Auto-generated method stub
		return null;
	}

}
