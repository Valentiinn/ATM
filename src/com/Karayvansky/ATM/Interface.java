package com.Karayvansky.ATM;

public interface Interface {

	public void start() throws ExceptionWrongInsertCard;

	public void enterPinCode() throws ExceptionCardNotSuitable;

	public int inputPinCode();

	public void selectFunctionFromMenu();

	public int chooseOperation() throws ExceptionMaxSum;

	public void printWithdrawMoney();

	public void toWithdrawMoney();

}
