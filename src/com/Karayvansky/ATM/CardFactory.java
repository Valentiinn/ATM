package com.Karayvansky.ATM;

public class CardFactory {

	public BaseOfBankCards identifyCard(int secretCode) {
		BaseOfBankCards card = null;
		switch (secretCode) {
		case 4566:
			card = new Privat24(45678555, 1111, "Ivanov", "Magnetic", 5000);
			break;
		case 4587:
			card = new Privat24(45678555, 1111, "Ivanov", "Magnetic", 5000);
			break;
		case 4565:
			card = new Privat24(45678555, 1111, "Ivanov", "Magnetic", 5000);
			break;
		case 4456:
			card = new Oshad(45678555, 1111, "Ivanov", "Magnetic", 5000);
			break;
		case 4854:
			card = new Oshad(45678555, 1111, "Ivanov", "Magnetic", 5000);
			break;
		case 2576:
			card = new Oshad(45678555, 1111, "Ivanov", "Magnetic", 5000);
			break;
		case 4567:
			card = new UniCredit(45678555, 1111, "Ivanov", "Magnetic", 5000);
			break;
		case 5267:
			card = new UniCredit(45678555, 1111, "Ivanov", "Magnetic", 5000);
			break;
		case 5268:
			card = new UniCredit(45678555, 1111, "Ivanov", "Magnetic", 5000);
			break;
		default:
			System.out.println("Error!");
		}
		return card;
	}
}
