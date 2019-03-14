package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class OrderListBranchA extends JFrame implements ActionListener {

	JButton boton1;
	private JTextArea textarea1;
	private JLabel lblName;
	private double cost;
	public OrderListBranchA() {
		setLayout(null);
		setTitle("List of Orders");
		//ConfigureOrderA ord= new ConfigureOrderA();
		//cost=ord.pizza.getTotalCostIngredientsList();
		
		lblName = new JLabel("BRANCH A");
		lblName.setBounds(15, 15, 300, 30);
		lblName.setFont(new Font("Andale Mono", 3, 25));
		lblName.setForeground(new Color(15, 20, 80));
		add(lblName);

		getContentPane().setBackground(new Color(176, 224, 231));
		final ImageIcon icon = new ImageIcon("Resources/Images/icon.jpg");
		setIconImage(icon.getImage());

		boton1 = new JButton("Agregar orden");
		boton1.setBounds(550, 150, 150, 30);
		add(boton1);
		boton1.addActionListener(this);

		textarea1 = new JTextArea();
		textarea1.setBounds(10, 50, 500, 600);
		add(textarea1);
	}

	public static void main(String args[]) {
		OrderListBranchA OrderList1 = new OrderListBranchA();
		OrderList1.setBounds(0, 0, 740, 700);
		OrderList1.setVisible(true);
		OrderList1.setResizable(false);
		OrderList1.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			ConfigureOrderA win = new ConfigureOrderA();
	         win.setBounds(0,0,740,700);
	         win.setVisible(true);
	         win.setResizable(false);
	         win.setLocationRelativeTo(null);
	         this.setVisible(true);
	        
		}
	}
}