package com.Karayvansky.ATM;

public class Main {

	public static void main(String[] args) throws ExceptionCardNotSuitable, ExceptionWrongInsertCard, ExceptionMaxSum {
		ATM atm = new ATM();
		atm.start();
		atm.enterPinCode();
		while (atm.chooseOperation() != 6) {
			atm.chooseOperation();
		}
	}
}
