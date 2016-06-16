package com.Karayvansky.ATM;

import java.util.Scanner;

public class ATM {

	private User user = new User();
	private Security security = new Security();
	Money money = new Money();

	public void start() {
		if (user.insertCard())
			System.out.println("Welcome to Odessa Bank!");
		else
			System.out.println("ERROR!");
	}

	public void enterPinCode() {
		if (security.checkPinCode(inputPinCode())) {
			System.out.println("Pin code correct");
		} else {
			System.out.println("Your card not suitable");
		}
	}

	public int inputPinCode() {
		int pinCode = 0;
		int counter = 3;
		while (!security.checkPinCode(pinCode)) {
			System.out.println("You enter the pin code: " + counter + " attempts");
			pinCode = user.inputPinCode();
			counter--;
			if (counter == 0) {
				break;
			}
		}
		return pinCode;
	}

	public void selectFunctionFromMenu() {
		System.out.println("What you want to do?\n1.Show balance on a screen\n2.Print balance on a bill"
				+ "\n3.Money transfer to another account" + "\n4.To replenish  mobile account"
				+ "\n5.To withdraw money");
	}

	public void chooseOperation() {

		switch (user.functionChoose()) {
		case 1:
			System.out.println("On your card " + security.getCard().getBalance() + " dollars");
			break;
		// case 2:
		// System.out.println("On your card " + card.getBalance() + " dollars");
		// break;
		// case 3:
		// System.out.println("On your card " + card.getBalance() + " dollars");
		// break;
		// case 4:
		// System.out.println("On your card " + card.getBalance() + " dollars");
		// break;
		// case 5:
		// System.out.println("On your card " + card.getBalance() + " dollars");
		// break;
		default:
			break;
		}
	}

	public void printWithdrawMoney() {
		System.out.println("Do you want remove:" + "\n1" + money.FIFTEEN + "\n2" + money.HUNDRED + "\3"
				+ money.THREE_HUNDRED + "\4" + money.FIVE_HUNDRED + "\5" + money.EIGHT_HUNDRED + "\6" + money.THOUSAND
				+ "\7 Other amount multiple 50");
	}

	public void toWithdrawMoney() {

	}
}
