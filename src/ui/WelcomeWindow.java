package ui;

import javax.swing.*;

import ingredient.IngredientType;

import java.awt.event.*;
import java.awt.*;

public class WelcomeWindow extends JFrame implements ItemListener {

	private JLabel lblName, lblLogo;
	private JButton button1;
	private JLabel lblBranch;
	private JComboBox comboBoxBranch;

	public WelcomeWindow() {
		setLayout(null);
		setTitle("Pizzeria Claudini & Carlini");
		getContentPane().setBackground(new Color(247, 142, 22));
		ImageIcon icon = new ImageIcon("Resources/Images/icon.jpg");
		setIconImage(icon.getImage());

		ImageIcon image = new ImageIcon("Resources/Images/pizzeria.jpg");
		lblLogo = new JLabel(image);
		lblLogo.setBounds(25, 120, 450, 250);
		add(lblLogo);

		lblName = new JLabel("Pizzeria Claudini & Carlini");
		lblName.setBounds(130, 50, 300, 30);
		lblName.setFont(new Font("Andale Mono", 3, 25));
		lblName.setForeground(new Color(15, 20, 80));
		add(lblName);

		lblBranch = new JLabel("Select a Branch: ");
		lblBranch.setBounds(70, 380, 150, 30);
		lblBranch.setFont(new Font("Arial", 3, 16));
		lblBranch.setForeground(new Color(15, 20, 80));
		add(lblBranch);
		comboBoxBranch = new JComboBox();
		comboBoxBranch.setBounds(200, 380, 200, 30);
		comboBoxBranch.addItem("elija una opcion");
		comboBoxBranch.addItem("Branch A");
		comboBoxBranch.addItem("Branch B");
		add(comboBoxBranch);
		comboBoxBranch.addItemListener(this);

		/*
		 * button1 = new JButton("Ingresar"); button1.setBounds(225, 450, 100, 30);
		 * button1.setBackground(new Color(255, 255, 255)); button1.setFont(new
		 * Font("Andale Mono", 1, 16)); button1.setForeground(new Color(255, 0, 0));
		 * button1.addActionListener(this); add(button1);
		 */
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		if (e.getSource() == comboBoxBranch) {
			String Branch = comboBoxBranch.getSelectedItem().toString();
			if (Branch.equals("Branch A")) {
				ConfigureOrderA win = new ConfigureOrderA();
				win.setBounds(0, 0, 1100, 550);
				win.setVisible(true);
				win.setResizable(false);
				win.setLocationRelativeTo(null);
				this.setVisible(false);
			} else if (Branch.equals("Branch B")) {
				ConfigureOrderB win = new ConfigureOrderB();
				win.setBounds(0, 0, 1100, 550);
				win.setVisible(true);
				win.setResizable(false);
				win.setLocationRelativeTo(null);
				this.setVisible(false);
			}
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