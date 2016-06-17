package com.Karayvansky.ATM;

import java.util.Scanner;

public class ATM {

	private User user = new User();
	private Security security = new Security();
	Money money = new Money();

	public void start() throws ExceptionWrongInsertCard {
		if (user.insertCard())
			System.out.println("Welcome to Odessa Bank!");
		else
			throw new ExceptionWrongInsertCard("You incorrectly inserted the card");
	}

	public void enterPinCode() throws ExceptionCardNotSuitable {
		if (security.checkPinCode(inputPinCode())) {
			System.out.println("Pin code correct");
		} else {
			throw new ExceptionCardNotSuitable("You card not suitable");
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
		case 5:
			printWithdrawMoney();
			toWithdrawMoney();

			break;
		default:
			break;
		}
	}

	public void printWithdrawMoney() {
		System.out.println("Do you want remove:" + "\n1. " + money.FIFTEEN + "\n2. " + money.HUNDRED + "\n3. "
				+ money.THREE_HUNDRED + "\n4. " + money.FIVE_HUNDRED + "\n5. " + money.EIGHT_HUNDRED + "\n6. "
				+ money.THOUSAND + "\n7. Other sum");
	}

	public int toWithdrawMoney() {
		int funcChoose = user.functionChoose();
		switch (funcChoose) {
		case 1:
			security.getCard().setBalance(security.getCard().getBalance() - money.FIFTEEN);
			System.out.println("collect your banknote" + money.FIFTEEN);
			return (int) security.getCard().getBalance();
		case 2:
			security.getCard().setBalance(security.getCard().getBalance() - money.HUNDRED);
			System.out.println(security.getCard().getBalance());
			return (int) security.getCard().getBalance();
		case 3:
			security.getCard().setBalance(security.getCard().getBalance() - money.THREE_HUNDRED);
			System.out.println(security.getCard().getBalance());
			return (int) security.getCard().getBalance();
		case 4:
			security.getCard().setBalance(security.getCard().getBalance() - money.FIVE_HUNDRED);
			System.out.println(security.getCard().getBalance());
			return (int) security.getCard().getBalance();
		case 5:
			security.getCard().setBalance(security.getCard().getBalance() - money.EIGHT_HUNDRED);
			System.out.println(security.getCard().getBalance());
			return (int) security.getCard().getBalance();
		case 6:
			security.getCard().setBalance(security.getCard().getBalance() - money.THOUSAND);
			System.out.println(security.getCard().getBalance());
			return (int) security.getCard().getBalance();
		case 7:
			System.out.print("Input your sum amount multiple 50: ");
			double mult = (double) user.functionChoose();
			if (mult >= 50 & mult % 5 == 0.0) {
				security.getCard().setBalance(security.getCard().getBalance() - mult);
				System.out.println(security.getCard().getBalance());
				System.out.println("collect your banknote " + mult);
			}
			break;
		default:
			break;
		}
		return 0;
	}
}
