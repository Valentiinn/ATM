package com.Karayvansky.ATM;

public class Main {

	public static void main(String[] args) throws ExceptionCardNotSuitable, ExceptionWrongInsertCard, ExceptionMaxSum {
		ATMOdessa atm = new ATMOdessa();
		atm.start();
		atm.enterPinCode();
		while (atm.chooseOperation() != 6) {
			atm.chooseOperation();
		}
	}
}
