package com.Karayvansky.ATM;

import java.util.Date;

public class BillForOdessaBank implements Bill {
	private static BillForOdessaBank instance = null;
	private Date date = new Date();

	BillForOdessaBank() {

	}

	public BillForOdessaBank getInstance() {
		if (instance == null) {
			instance = new BillForOdessaBank();
		}

		return instance;
	}

	public void printBill(Security security) {
		System.out.println(security.getCard().getBalance() + " dollars");
		System.out.println(security.getCard().getOwnerCard());
		System.out.println(date);

	}

}
