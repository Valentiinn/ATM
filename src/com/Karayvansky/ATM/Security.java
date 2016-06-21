package com.Karayvansky.ATM;

public interface Security {
	

	public boolean checkPinCode(int pineCode);

	public int getSecretCode();

	public void setSecretCode(int secretCode);

	public BaseOfBankCards getCard();

	public CardFactory getCardFactory();
}
