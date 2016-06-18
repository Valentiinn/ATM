package com.Karayvansky.ATM;

public class UniCredit extends BaseOfBankCards {
	public UniCredit(int pinCode, String ownerCard, String typeOfCard, double balance) {
		setBalance(balance);
		setOwnerCard(ownerCard);
		setPinCode(pinCode);
		setTypeOfCard(typeOfCard);
	}
}
