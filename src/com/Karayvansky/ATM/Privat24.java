package com.Karayvansky.ATM;

public class Privat24 extends BaseOfBankCards {
	public Privat24(int serialNumber, int pinCode, String ownerCard, String typeOfCard, double balance) {
		setBalance(balance);
		setOwnerCard(ownerCard);
		setPinCode(pinCode);
		setSerialNumber(serialNumber);
		setTypeOfCard(typeOfCard);
	}
}
