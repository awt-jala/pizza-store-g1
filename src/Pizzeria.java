import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Color;

public class Pizzeria {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pizzeria window = new Pizzeria();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pizzeria() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAutoRequestFocus(false);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 850, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		frame.getContentPane().add(chckbxNewCheckBox, BorderLayout.EAST);
		
		JCheckBox chckbxSauceTomato = new JCheckBox("SAUCETOMATO");
		JCheckBox chckbxSpiceSauce = new JCheckBox("SPICESAUCE");
		JCheckBox chckbxCorn = new JCheckBox("CORN");
		JCheckBox chckbxChampignon = new JCheckBox("CHANPIGNON");
		JCheckBox chckbxPineapple = new JCheckBox("PINEAPPLE");
		JCheckBox chckbxExtracheese = new JCheckBox("EXTRACHEESE");
	}

}
