package main.java.ui;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.*;

public class WelcomeWindow extends JFrame implements ActionListener {

	private JLabel lblName, lblLogo;
	private JButton button1;

	public WelcomeWindow() {
		setLayout(null);
		setTitle("Pizzeria Claudini & Carlini");
		getContentPane().setBackground(new Color(247, 142, 22));
		ImageIcon icon= new ImageIcon("Resources/Images/icon.jpg");
		setIconImage(icon.getImage());

		ImageIcon image = new ImageIcon("Resources/Images/pizzeria.jpg");
		lblLogo = new JLabel(image);
		lblLogo.setBounds(25, 120, 500, 300);
		add(lblLogo);

		lblName = new JLabel("Pizzeria Claudini & Carlini");
		lblName.setBounds(130, 50, 300, 30);
		lblName.setFont(new Font("Andale Mono", 3, 25));
		lblName.setForeground(new Color(15, 20, 80));
		add(lblName);

		button1 = new JButton("Ingresar");
		button1.setBounds(225, 450, 100, 30);
		button1.setBackground(new Color(255, 255, 255));
		button1.setFont(new Font("Andale Mono", 1, 16));
		button1.setForeground(new Color(255, 0, 0));
		button1.addActionListener(this);
		add(button1);
	}

	// @Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {

		}
	}

	public static void main(String args[]) {
		WelcomeWindow w = new WelcomeWindow();
		w.setBounds(0, 0, 550, 550);
		w.setVisible(true);
		w.setResizable(false);
		w.setLocationRelativeTo(null);
	}

}
