package com.Karayvansky.ATM;

public class Main {
	public static void main(String[] args) throws ExceptionCardNotSuitable, ExceptionWrongInsertCard, ExceptionMaxSum {

		Security security = new SecurityOdessaBank();
		Bill bill = new BillForOdessaBank();
		User user = new UserBank();
		ATM atm = ATM.getInstance(security, bill, user);
		atm.start();
		atm.enterPinCode();
		while (atm.chooseOperation() != 6) {
			atm.chooseOperation();
		}
	}
}
