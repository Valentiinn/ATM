package com.Karayvansky.ATM;

public class Main {

	public static void main(String[] args) {
		int secretCode = 4566;
		ATM atm = new ATM();
		atm.start();
		atm.enterPinCode();
		atm.selectFunctionFromMenu();
		atm.chooseOperation();
		atm.printWithdrawMoney();
	}

}
