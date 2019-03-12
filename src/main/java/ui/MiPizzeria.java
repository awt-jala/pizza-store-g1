package main.java.ui;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class MiPizzeria extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiPizzeria frame = new MiPizzeria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MiPizzeria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button1 = new JButton(new ImageIcon("cheesepizza.jpg"));
		button1.setBounds(28, 44, 181, 161);
		contentPane.add(button1);
		
		
		
		
		
		
		JButton button_2 = new JButton("New button");
		button_2.setBounds(233, 44, 181, 161);
		contentPane.add(button_2);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(440, 44, 181, 161);
		contentPane.add(button_1);
		
		JButton button_3 = new JButton("New button");
		button_3.setBounds(642, 44, 181, 161);
		contentPane.add(button_3);
	}
}
