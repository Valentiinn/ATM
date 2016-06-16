package com.Karayvansky.ATM;

public class Security {
	private int secretCode = 4566;
	private CardFactory cardFactory = new CardFactory();
	private BaseOfBankCards card = cardFactory.identifyCard(secretCode);

	// public boolean identification(int secretCode) {
	// CardFactory cardFactory = new CardFactory();
	// if (cardFactory.identifyCard(secretCode))
	// return true;
	// else
	// return false;
	// }

	public boolean checkPinCode(int pineCode) {
		setSecretCode(secretCode);
		if (pineCode == card.getPinCode())
			return true;
		return false;
	}

	public int getSecretCode() {
		return secretCode;
	}

	public void setSecretCode(int secretCode) {
		this.secretCode = secretCode;
	}

	public BaseOfBankCards getCard() {
		return card;
	}

	public CardFactory getCardFactory() {
		return cardFactory;
	}

}
