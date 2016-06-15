package com.Karayvansky.ATM;

import javax.swing.SwingUtilities;

public class BasicLayouts {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new MainForm();
			}
		});
	}
}
