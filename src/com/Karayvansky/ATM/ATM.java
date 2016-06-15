package com.Karayvansky.ATM;

import java.util.Scanner;

public class ATM {

	private User user = new User();
	private Security security = new Security();
	BaseOfBankCards card = new BaseOfBankCards();

	public void start() {
		if (user.insertCard())
			System.out.println("Welcome to Odessa Bank!");
		else
			System.out.println("ERROR!");
	}

	public void enterPinCode(int secret) {
		if (security.checkPinCode(inputPinCode())) {
			System.out.println("Pin code correct");
		} else {
			System.out.println("Your card not suitable");
		}
	}

	public int inputPinCode() {
		Scanner sc = new Scanner(System.in);
		int pinCode = 0;
		int counter = 3;
		System.out.println("You enter the pin code: " + counter);
		while (security.checkPinCode(pinCode)) {
			pinCode = sc.nextInt();
			counter--;
			System.out.println("Attempts remaining " + counter);
			if (counter == 0) {
				break;
			}
		}
		return pinCode;
	}

}
