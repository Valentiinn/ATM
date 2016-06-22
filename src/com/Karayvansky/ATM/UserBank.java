package com.Karayvansky.ATM;

import java.util.Scanner;

public class UserBank implements User {

	private static UserBank instance = null;

	 UserBank() {
	}

	public static UserBank getInstance() {
		if (instance == null) {
			instance = new UserBank();
		}

		return instance;
	}

	public boolean insertCard() {
		return true;
	}

	public int inputPinCode() {
		Scanner sc = new Scanner(System.in);
		int pinCode = sc.nextInt();
		return pinCode;
	}

	public int functionChoose() {
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		return choose;
	}

}
