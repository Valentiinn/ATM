package com.Karayvansky.ATM;

import java.util.Scanner;
import java.util.Date;

public class ATMOdessa implements Interface {

	private User user = new User();
	private Security security = new Security();
	private Bill bill = new Bill();
	private Money money = new Money();

	public void start() throws ExceptionWrongInsertCard {
		if (user.insertCard())
			System.out.println("Welcome to Odessa Bank!");
		else
			throw new ExceptionWrongInsertCard("You incorrectly inserted the card");
	}

	public void enterPinCode() throws ExceptionCardNotSuitable {
		System.out.print("Enter pin code: ");
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
		System.out.println();
		System.out.println("What you want to do?\n1.Show balance on a screen\n2.Print balance on a bill"
				+ "\n3.Money transfer to another account" + "\n4.To replenish  mobile account" + "\n5.To withdraw money"
				+ "\n6. Exit");
	}

	public int chooseOperation() throws ExceptionMaxSum {
		selectFunctionFromMenu();
		int choose = user.functionChoose();
		switch (choose) {
		case 1:
			System.out.println("On your card " + security.getCard().getBalance() + " dollars");
			return 1;
		case 2:
			bill.printBill();
			return 2;
		case 3:
			System.out.print("Enter the amount of money(maximum 10000): ");
			int money = user.functionChoose();
			if (money <= 10000) {
				System.out.print("Enter the number of account: ");
				int account = user.functionChoose();
				CardFactory cardFactory = new CardFactory();
				BaseOfBankCards card = cardFactory.identifyCard(account);
				card.setBalance(card.getBalance() + money);
				security.getCard().setBalance(security.getCard().getBalance() - money);
				System.out.print("The completion was successful");
			} else
				throw new ExceptionMaxSum("You enter invalid amount!");
			return 3;
		case 4:
			System.out.print("Input mobile number: +380");
			user.functionChoose();
			System.out.print("Enter the amount of money(maximum 1000): ");
			int moneyOnPhone = user.functionChoose();
			if (moneyOnPhone <= 1000) {
				System.out.print("The completion was successful");
				security.getCard().setBalance(security.getCard().getBalance() - moneyOnPhone);
			} else
				throw new ExceptionMaxSum("You enter invalid amount!");
			return 4;
		case 5:
			printWithdrawMoney();
			toWithdrawMoney();
			return 5;
		case 6:
			System.out.print("Take your card");
			return 6;
		default:
			System.out.print("Error!");
		}
		return 6;
	}

	public void printWithdrawMoney() {
		System.out.println("Do you want remove:" + "\n1. " + money.FIFTEEN + "\n2. " + money.HUNDRED + "\n3. "
				+ money.THREE_HUNDRED + "\n4. " + money.FIVE_HUNDRED + "\n5. " + money.EIGHT_HUNDRED + "\n6. "
				+ money.THOUSAND + "\n7. Other sum");
	}

	public void toWithdrawMoney() {
		int funcChoose = user.functionChoose();
		switch (funcChoose) {
		case 1:
			security.getCard().setBalance(security.getCard().getBalance() - money.FIFTEEN);
			System.out.println("collect your banknote" + money.FIFTEEN);
		case 2:
			security.getCard().setBalance(security.getCard().getBalance() - money.HUNDRED);
			System.out.println("collect your banknote" + security.getCard().getBalance());
		case 3:
			security.getCard().setBalance(security.getCard().getBalance() - money.THREE_HUNDRED);
			System.out.println("collect your banknote" + security.getCard().getBalance());
		case 4:
			security.getCard().setBalance(security.getCard().getBalance() - money.FIVE_HUNDRED);
			System.out.println("collect your banknote" + security.getCard().getBalance());
		case 5:
			security.getCard().setBalance(security.getCard().getBalance() - money.EIGHT_HUNDRED);
			System.out.println("collect your banknote" + security.getCard().getBalance());
		case 6:
			security.getCard().setBalance(security.getCard().getBalance() - money.THOUSAND);
			System.out.println("collect your banknote" + security.getCard().getBalance());
		case 7:
			System.out.print("Input your sum amount multiple 50: ");
			double mult = (double) user.functionChoose();
			if (mult >= 50 & mult % 5 == 0.0) {
				security.getCard().setBalance(security.getCard().getBalance() - mult);
				System.out.println("collect your banknote " + mult);
			}
			break;
		default:
			System.out.println("Error!");
		}
	}
}
