package com.Karayvansky.ATM;

public class Oshad extends BaseOfBankCards {
	public Oshad(int pinCode, String ownerCard, String typeOfCard, double balance) {
		setBalance(balance);
		setOwnerCard(ownerCard);
		setPinCode(pinCode);
		setTypeOfCard(typeOfCard);
	}
}
