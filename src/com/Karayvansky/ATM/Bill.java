package com.Karayvansky.ATM;

import java.util.Date;

public class Bill {

	private Security security = new Security();
	private Date date = new Date();

	public void printBill() {
		System.out.println(security.getCard().getBalance() + " dollars");
		System.out.println(security.getCard().getOwnerCard());
		System.out.println(date);

	}
}
