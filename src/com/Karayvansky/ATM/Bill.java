package com.Karayvansky.ATM;

import java.util.Date;

public class Bill {

	private SecurityOdessaBank security = SecurityOdessaBank.getInstance();
	private Date date = new Date();

	public void printBill() {
		System.out.println(security.getCard().getBalance() + " dollars");
		System.out.println(security.getCard().getOwnerCard());
		System.out.println(date);

	}
}
