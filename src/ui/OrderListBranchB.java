package ui;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class OrderListBranchB extends JFrame implements ActionListener {

	  JButton boton1;
	private JTextArea textarea1;
	private JLabel lblName;

	public OrderListBranchB() {
		setLayout(null);
		setTitle("List of Orders");
		
		lblName = new JLabel("BRANCH B");
		lblName.setBounds(15, 15, 300, 30);
		lblName.setFont(new Font("Andale Mono", 3, 25));
		lblName.setForeground(new Color(15, 20, 80));
		add(lblName);
		
		getContentPane().setBackground(new Color(176, 224, 231));
		final ImageIcon icon = new ImageIcon("Resources/Images/icon.jpg");
		setIconImage(icon.getImage());
		
		boton1 = new JButton("Agregar orden");
		   boton1.setBounds(550,150,150,30);
		   add(boton1);
		   boton1.addActionListener(this);


		textarea1 = new JTextArea();
		textarea1.setBounds(10, 50, 500, 600);
		add(textarea1);
	}

	public static void main(String args[]) {
		OrderListBranchB OrderList1 = new OrderListBranchB();
		OrderList1.setBounds(0, 0, 740, 700);
		OrderList1.setVisible(true);
		OrderList1.setResizable(false);
		OrderList1.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}
}
