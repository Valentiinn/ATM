package com.Karayvansky.ATM;

public class Main {

	public static void main(String[] args) throws ExceptionCardNotSuitable, ExceptionWrongInsertCard {
		ATM atm = new ATM();
		atm.start();
		atm.enterPinCode();
		atm.selectFunctionFromMenu();
		atm.chooseOperation();
		
	}

}
