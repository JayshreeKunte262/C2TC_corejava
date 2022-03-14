package com.tns.client;

import com.tns.Application.MMCurrentAcc;
import com.tns.Application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class Clientt {

public static void main(String[] args) {

BankFactory BF = new MMBankFactory();
SavingAcc SA = new MMSavingAcc(123,"jayshree",200,true);
SA. withdraw(SA.getaccBa());
SA.toString();
CurrentAcc CA = new MMCurrentAcc(246,"jayu",200,50);
CA.withdraw(SA.creditLimit());
CA.toString();



}

}







