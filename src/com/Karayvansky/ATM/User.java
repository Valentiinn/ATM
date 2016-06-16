package com.Karayvansky.ATM;

import java.util.Scanner;

public class User {

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
