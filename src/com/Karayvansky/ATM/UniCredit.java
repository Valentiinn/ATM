package com.Karayvansky.ATM;

public class UniCredit extends BaseOfBankCards {
	public UniCredit(int serialNumber, int pinCode, String ownerCard, String typeOfCard, double balance) {
		setBalance(balance);
		setOwnerCard(ownerCard);
		setPinCode(pinCode);
		setSerialNumber(serialNumber);
		setTypeOfCard(typeOfCard);
	}
}
