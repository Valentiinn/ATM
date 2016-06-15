package com.Karayvansky.ATM;

public class Main {

	public static void main(String[] args) {
		BaseOfBankCards bankCards = new BaseOfBankCards();
		ATM atm = new ATM();
		atm.start();
		atm.enterPinCode(4456);
	}

}
