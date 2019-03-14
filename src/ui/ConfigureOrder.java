package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import main.java.p1.AbstractPizza;
import main.java.p1.FactoryBranchA;
import main.java.p1.PizzaTypes;

public class ConfigureOrder extends JFrame implements ItemListener {
    private final JLabel lblPizzaName;
    private final JComboBox comboBoxPizza;
    private final JList defaultList;

    public ConfigureOrder() {

        setLayout(null);

        setTitle("Configure your Order....");
        getContentPane().setBackground(new Color(176, 224, 231));
        final ImageIcon icon = new ImageIcon("Resources/Images/icon.jpg");
        setIconImage(icon.getImage());

        lblPizzaName = new JLabel("Select your pizza:");
        lblPizzaName.setBounds(25, 50, 200, 30);
        lblPizzaName.setFont(new Font("Arial", 1, 14));
        lblPizzaName.setForeground(new Color(15, 20, 80));
        add(lblPizzaName);

        comboBoxPizza = new JComboBox();
        comboBoxPizza.setBounds(160, 50, 100, 30);
        comboBoxPizza.setModel(new DefaultComboBoxModel(PizzaTypes.values()));
        add(comboBoxPizza);
        comboBoxPizza.addItemListener(this);
        final FactoryBranchA factoryA = new FactoryBranchA();
        final AbstractPizza pizzaA = factoryA.createPizza(PizzaTypes.CHEESE);
        defaultList = new JList();
        defaultList.setBounds(50, 200, 280, 300);
        defaultList.setVisibleRowCount(10);
        add(defaultList);

    }

    @Override
    public void itemStateChanged(final ItemEvent e) {
        if (e.getSource() == comboBoxPizza) {
            final FactoryBranchA factoryA = new FactoryBranchA();
            final AbstractPizza pizzaA = factoryA
                    .createPizza(PizzaTypes.CHEESE);

            // final String seleccion =
            // comboBoxPizza.getSelectedItem().toString();

            // setTitle(seleccion);
        }
    }

    public static void main(final String args[]) {
        final ConfigureOrder formulario1 = new ConfigureOrder();
        formulario1.setBounds(0, 0, 600, 550);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(false);
    }

}
