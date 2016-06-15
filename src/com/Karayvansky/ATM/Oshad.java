package com.Karayvansky.ATM;

public class Oshad extends BaseOfBankCards {
	public Oshad(int serialNumber, int pinCode, String ownerCard, String typeOfCard, double balance) {
		setBalance(balance);
		setOwnerCard(ownerCard);
		setPinCode(pinCode);
		setSerialNumber(serialNumber);
		setTypeOfCard(typeOfCard);
	}
}
