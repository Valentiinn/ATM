package com.Karayvansky.ATM;

public class CardFactory {

	public BaseOfBankCards identifyCard(int serialNumber) {

		BaseOfBankCards card = null;
		switch (serialNumber) {
		case 44442010:
			card = new Privat24(2507, "Ivanov", "Magnetic", 5000);
			break;
		case 44442011:
			card = new Privat24(0023, "Ivanov", "Magnetic", 5000);
			break;
		case 44442012:
			card = new Privat24(0024, "Ivanov", "Magnetic", 5000);
			break;
		case 44442013:
			card = new Oshad(2145, "Ivanov", "Magnetic", 5000);
			break;
		case 44442014:
			card = new Oshad(2456, "Ivanov", "Magnetic", 5000);
			break;
		case 44442015:
			card = new Oshad(8945, "Ivanov", "Magnetic", 5000);
			break;
		case 44442016:
			card = new UniCredit(1456, "Ivanov", "Magnetic", 5000);
			break;
		case 44442017:
			card = new UniCredit(2356, "Ivanov", "Magnetic", 5000);
			break;
		case 44442018:
			card = new UniCredit(4526, "Ivanov", "Magnetic", 5000);
			break;
		default:
			System.out.println("Error!");
		}
		return card;
	}
}
