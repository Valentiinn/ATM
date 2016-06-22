package com.Karayvansky.ATM;

import java.util.Date;

public class Bill {
	private static Bill instance = null;
	private Date date = new Date();

	private Bill() {
	}

	public static Bill getInstance() {
		if (instance == null) {
			instance = new Bill();
		}

		return instance;
	}

	public void printBill(SecurityOdessaBank security) {
		System.out.println(security.getCard().getBalance() + " dollars");
		System.out.println(security.getCard().getOwnerCard());
		System.out.println(date);

	}
}
