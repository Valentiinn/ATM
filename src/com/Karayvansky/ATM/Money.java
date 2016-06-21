package com.Karayvansky.ATM;

public enum Money {
	FIFTEEN(50), HUNDRED(100), TWO_HUNDRED(200), THREE_HUNDRED(300), FOUR_HUNDRED(400), FIVE_HUNDRED(500), SIX_HUNDRED(
			600), SEVEN_HUNDRED(700), EIGHT_HUNDRED(800), NINE_HUNDRED(900), THOUSAND(1000);

	public int getBancnote() {
		return bancnote;
	}

	private int bancnote;

	Money(int bancnote) {
		this.bancnote = bancnote;
	}
}
