package com.Karayvansky.ATM;

public class Security {
	BaseOfBankCards card = new BaseOfBankCards();

//	public boolean identification(int secretCode) {
//		CardFactory cardFactory = new CardFactory();
//		if (cardFactory.identifyCard(secretCode))
//			return true;
//		else
//			return false;
//	}

	public boolean checkPinCode(int pineCode) {
		if (pineCode == card.getPinCode())
			return true;
		return false;
	}

}
