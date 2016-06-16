package com.Karayvansky.ATM;

public class Security {
	CardFactory cardFactory = new CardFactory();
	

//	public boolean identification(int secretCode) {
//		CardFactory cardFactory = new CardFactory();
//		if (cardFactory.identifyCard(secretCode))
//			return true;
//		else
//			return false;
//	}

	public boolean checkPinCode(int pineCode) {
		BaseOfBankCards card = cardFactory.identifyCard(4566);
		if (pineCode == card.getPinCode())
			return true;
		return false;
	}

}
