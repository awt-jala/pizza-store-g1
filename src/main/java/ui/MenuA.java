package main.java.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JTabbedPane;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JDesktopPane;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JSlider;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.Icon;

public class MenuA extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	
	/**
	 * Create the frame.
	 */
	public MenuA() {
		setTitle("Order menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1123, 713);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(15, 16, 1050, 625);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Branch A", null, panel, null);
		panel.setLayout(null);
		
		ImageIcon imagecheese = new ImageIcon("Resources/Images/cheesepizza.jpg");
		JLabel lblNewLabel = new JLabel(imagecheese);
		lblNewLabel.setBounds(15, 16, 160, 107);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Cheese pizza");
		btnNewButton.setBounds(15, 124, 160, 29);
		panel.add(btnNewButton);
		
		JLabel label = new JLabel("New label");
		label.setBounds(197, 0, 160, 123);
		panel.add(label);
		
		JButton button = new JButton("Pepperoni pizza");
		button.setBounds(197, 123, 160, 30);
		panel.add(button);
		
		JLabel label_1 = new JLabel("new label");
		label_1.setBounds(381, 0, 152, 123);
		panel.add(label_1);
		
		JButton button_1 = new JButton("Veggie pizza");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1.setBounds(381, 124, 160, 29);
		panel.add(button_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(571, 0, 160, 123);
		panel.add(label_2);
		
		JButton button_2 = new JButton("Greek pizza");
		button_2.setBounds(571, 124, 160, 29);
		panel.add(button_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(798, 0, 160, 123);
		panel.add(label_3);
		
		JButton button_3 = new JButton("Lasagna");
		button_3.setBounds(798, 124, 160, 29);
		panel.add(button_3);
		
		JList list = new JList();
		list.setBounds(15, 245, 204, 271);
		panel.add(list);
				
		JList list_1 = new JList();
		list_1.setBounds(258, 245, 204, 271);
		panel.add(list_1);
		
		JList list_2 = new JList();
		list_2.setBounds(515, 245, 204, 271);
		panel.add(list_2);
		
		JList list_3 = new JList();
		list_3.setBounds(771, 245, 204, 271);
		panel.add(list_3);
		
		JLabel lblOrder = new JLabel("Order:");
		lblOrder.setBounds(15, 207, 69, 20);
		panel.add(lblOrder);
		
		JLabel lblTotalCost = new JLabel("Total Cost:");
		lblTotalCost.setBounds(25, 540, 80, 20);
		panel.add(lblTotalCost);
		
		textField = new JTextField();
		textField.setBounds(113, 534, 100, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Branch B", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(64, 118, 115, 29);
		panel_1.add(btnNewButton_1);
	}
	public static void main(String args[]) {
		MenuA window = new MenuA();
		window.setBounds(0, 0, 550, 550);
		window.setVisible(true);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
	}

}


