package com.Karayvansky.ATM;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import javax.swing.*;

public class MainForm extends JFrame {

	public MainForm() {
		super("Basic Layouts");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screen = toolkit.getScreenSize();
		int x = screen.width;
		int y = screen.height;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize((int) Math.round(x * 0.8), (int) Math.round(y * 0.8));
		setLocationRelativeTo(null);
		setVisible(true);

		LayoutManager layoutManager = new BorderLayout(5, 5);
		setLayout(layoutManager);
	}
}
