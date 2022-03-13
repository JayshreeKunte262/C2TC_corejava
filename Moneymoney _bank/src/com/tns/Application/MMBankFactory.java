package com.tns.Application;

import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;
import com.tns.framework.string;

public class MMBankFactory extends BankFactory{
	

	@Override
	public SavingAcc getNewSavingAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SavingAcc getNewSavingAccount(int AccNo, string accNm, float accBal, boolean isSalaried) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int AccNo, string accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
