package com.Karayvansky.ATM;

import java.util.Random;

public class Money {

	public static final int FIFTEEN = 50;
	public static final int HUNDRED = 100;
	public static final int TWO_HUNDRED = 200;
	public static final int THREE_HUNDRED = 300;
	public static final int FOUR_HUNDRED = 400;
	public static final int FIVE_HUNDRED = 500;
	public static final int SIX_HUNDRED = 600;
	public static final int SEVEN_HUNDRED = 700;
	public static final int EIGHT_HUNDRED = 800;
	public static final int NINE_HUNDRED = 900;
	public static final int THOUSAND = 1000;

	public void randomBancnote() {
		Random random = new Random();
		int[] array = { FIFTEEN, HUNDRED, TWO_HUNDRED, THREE_HUNDRED, FOUR_HUNDRED, FIVE_HUNDRED, SIX_HUNDRED,
				SEVEN_HUNDRED, EIGHT_HUNDRED, NINE_HUNDRED, THOUSAND };
	}

}
