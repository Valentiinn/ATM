package com.Karayvansky.ATM;

public class SecurityOdessaBank implements Security {
	private int serialNumber = 44442010;
	private CardFactory cardFactory = new CardFactory();
	private BaseOfBankCards card = cardFactory.identifyCard(serialNumber);

	// public boolean identification(int secretCode) {
	// CardFactory cardFactory = new CardFactory();
	// if (cardFactory.identifyCard(secretCode))
	// return true;
	// else
	// return false;
	// }
	private static SecurityOdessaBank instance = null;

	private SecurityOdessaBank() {
	}

	public static SecurityOdessaBank getInstance() {
		if (instance == null) {
			instance = new SecurityOdessaBank();
		}

		return instance;
	}
	public boolean checkPinCode(int pineCode) {
		setSecretCode(serialNumber);
		if (pineCode == card.getPinCode())
			return true;
		return false;
	}

	public int getSecretCode() {
		return serialNumber;
	}

	public void setSecretCode(int secretCode) {
		this.serialNumber = secretCode;
	}

	public BaseOfBankCards getCard() {
		return card;
	}

	public CardFactory getCardFactory() {
		return cardFactory;
	}

}
