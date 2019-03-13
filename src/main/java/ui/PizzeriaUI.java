package main.java.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import main.java.p1.IngredientType;
import main.java.p1.LasagnaType;
import main.java.p1.PizzaTypes;
import javax.swing.JList;

public class PizzeriaUI extends JDialog {

    private final JPanel contentPanel = new JPanel();
    private final JTextField txtPizza;
    private final JTextField txtLasagna;
    private JTextField txtCustomIngredients;
    private JTextField txtPizzeriaClaudiniCarlini;
    private JTextField txtPreOrder;
    private JTextField txtFinalOrder;
    private JTextField textField_1;
    private JTextField txtTotalAmount;
    private final JList list_1;

    /**
     * Launch the application.
     */
    public static void main(final String[] args) {
        try {
            final PizzeriaUI dialog = new PizzeriaUI();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (final Exception e) {
            e.printStackTrace();
        }

    /**
     * Create the dialog.
     */
    public PizzeriaUI() {
        setBounds(100, 100, 950, 900);
        // setLayout(null);
        contentPanel.setLayout(null);
        setTitle("Bienvenido a la Pizzeria Claudini-Carlini");
        // getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        // getContentPane().add(contentPanel, BorderLayout.CENTER);
        // ContentPane().setBackground(new Color(255,0,0));
        // setIconImage(new
        // ImageIcon(getClass().getResources("Images/icon.png")).getImage());
        final JRadioButton rdbtnNewRadioButton = new JRadioButton("SUCURSAL A");
        rdbtnNewRadioButton.setBounds(96, 105, 109, 23);
        contentPanel.add(rdbtnNewRadioButton);

        final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("SUCURSAL B");
        rdbtnNewRadioButton_1.setBounds(360, 105, 109, 23);
        contentPanel.add(rdbtnNewRadioButton_1);

        final JComboBox comboBoxPizza = new JComboBox();
        comboBoxPizza.setBounds(325, 207, 171, 23);
        comboBoxPizza.setModel(new DefaultComboBoxModel(PizzaTypes.values()));
        contentPanel.add(comboBoxPizza);

        txtPizza = new JTextField();
        txtPizza.setBounds(199, 207, 70, 22);
        txtPizza.setText("PIZZA");
        contentPanel.add(txtPizza);
        txtPizza.setColumns(10);

        txtLasagna = new JTextField();
        txtLasagna.setBounds(211, 162, 58, 20);
        txtLasagna.setText("LASAGNA");
        contentPanel.add(txtLasagna);
        txtLasagna.setColumns(10);

        final JComboBox comboBoxLasagna = new JComboBox();
        comboBoxLasagna.setBounds(318, 161, 178, 23);
        comboBoxLasagna.setModel(new DefaultComboBoxModel(LasagnaType.values()));
        contentPanel.add(comboBoxLasagna);
        {
            txtCustomIngredients = new JTextField();
            txtCustomIngredients.setBounds(133, 260, 136, 20);
            txtCustomIngredients.setText("CUSTOM INGREDIENTS");
            contentPanel.add(txtCustomIngredients);
            txtCustomIngredients.setColumns(10);
        }
        {
            final JComboBox comboBox_2 = new JComboBox();
            comboBox_2.setBounds(325, 259, 171, 23);
            comboBox_2.setModel(new DefaultComboBoxModel(IngredientType.values()));
            contentPanel.add(comboBox_2);
        }
        {
            txtPizzeriaClaudiniCarlini = new JTextField();
            txtPizzeriaClaudiniCarlini.setBounds(151, 11, 368, 23);
            txtPizzeriaClaudiniCarlini.setFont(new Font("Tahoma", Font.PLAIN, 17));
            txtPizzeriaClaudiniCarlini.setText("PIZZERIA CLAUDINI CARLINI");
            contentPanel.add(txtPizzeriaClaudiniCarlini);
            txtPizzeriaClaudiniCarlini.setColumns(10);
        }
        {
            txtPreOrder = new JTextField();
            txtPreOrder.setBounds(41, 317, 86, 20);
            txtPreOrder.setText("LIST ORDER");
            contentPanel.add(txtPreOrder);
            txtPreOrder.setColumns(10);
        }
        {
            txtFinalOrder = new JTextField();
            txtFinalOrder.setBounds(41, 447, 86, 20);
            txtFinalOrder.setText("FINAL ORDER");
            contentPanel.add(txtFinalOrder);
            txtFinalOrder.setColumns(10);
        }
        {
            textField_1 = new JTextField();
            textField_1.setBounds(47, 498, 449, 74);
            contentPanel.add(textField_1);
            textField_1.setColumns(10);
        }
        {
            txtTotalAmount = new JTextField();
            txtTotalAmount.setBounds(53, 597, 109, 20);
            txtTotalAmount.setText("TOTAL AMOUNT :");
            contentPanel.add(txtTotalAmount);
            txtTotalAmount.setColumns(10);
        }

        final JList list = new JList();
        list.setBounds(96, 432, 280, -62);
        contentPanel.add(list);

        list_1 = new JList();
        list_1.setBounds(51, 354, 390, 82);
        contentPanel.add(list_1);
        {
            final JPanel buttonPane = new JPanel();
            buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
            getContentPane().add(buttonPane, BorderLayout.SOUTH);
            {
                final JButton exitButton = new JButton("SALIR");
                exitButton.setActionCommand("SALIR");
                buttonPane.add(exitButton);
                getRootPane().setDefaultButton(exitButton);

            }
        }
    }
}
