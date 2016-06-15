package com.Karayvansky.ATM;

public class BaseOfBankCards {
	private int serialNumber;
	private int pinCode;
	private String ownerCard;
	private String typeOfCard;
	private double balance;

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public void setOwnerCard(String ownerCard) {
		this.ownerCard = ownerCard;
	}

	public void setTypeOfCard(String typeOfCard) {
		this.typeOfCard = typeOfCard;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public int getPinCode() {
		return pinCode;
	}

	public String getOwnerCard() {
		return ownerCard;
	}

	public String getTypeOfCard() {
		return typeOfCard;
	}

	public double getBalance() {
		return balance;
	}

	
	
}
