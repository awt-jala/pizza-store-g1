package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import abstractclases.Product;
import factory.FactoryBranchB;
import ingredient.IngredientType;
import ingredient.Ingredients;
import ingredient.IngredientsLasagna;
import pizza.AbstractPizza;
import pizza.Lasagna;
import pizza.LasagnaType;
import pizza.PizzaTypes;
import store.Order;
import store.PizzaStore;
public class ConfigureOrderB extends JFrame implements ItemListener {
	private final JLabel lblPizzaName, lblPizzaQuantity;
	private final JComboBox<PizzaTypes> comboBoxPizza;
	private final JList<IngredientType> defaultList;
	private JTextField txtPizzaQuantity, tot;
	private JTextField txtPriceOrder;
	final FactoryBranchB factoryB = new FactoryBranchB();
	private JComboBox comboBoxAditionalIngredients;
	Product product;
	int Quantity;
	private JList<IngredientType> customList;
	private JComboBox comboBoxRemoveIngredients;
	private JLabel lblremove;
	private JTextArea textarea1;
	public static Order Orden;
	public PizzaStore BranchB = new PizzaStore();
	private JScrollPane scrollpane1;
	private JLabel lblcustom;
	private JLabel lblorderlist;
	private JComboBox comboBoxlasagna;
	private JLabel lbllasagnaName;
	private JLabel lbllasagnaQuantity;
	private JTextField txtlasagnaQuantity;
	private JLabel lblBranch;
	private JLabel lbldef;

	public ConfigureOrderB() {

		setLayout(null);

		setTitle("Configure your Order....");
		getContentPane().setBackground(new Color(176, 224, 231));
		final ImageIcon icon = new ImageIcon("Resources/Images/icon.jpg");
		setIconImage(icon.getImage());
		lblBranch = new JLabel("BRANCH B");
		lblBranch.setBounds(10, 10, 150, 30);
		lblBranch.setFont(new Font("Arial", 3, 18));
		lblBranch.setForeground(new Color(200, 20, 80));
		add(lblBranch);
		lblorderlist = new JLabel("Order list ");
		lblorderlist.setBounds(800, 20, 150, 30);
		lblorderlist.setFont(new Font("Arial", 3, 16));
		lblorderlist.setForeground(new Color(200, 20, 80));
		add(lblorderlist);
		
		textarea1 = new JTextArea();
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(800, 50, 200, 300);
		add(scrollpane1);

		tot = new JTextField();
		tot.setBounds(930, 400, 70, 30);
		add(tot);
		// textarea1.setBounds(800, 50, 200, 300);
		// add(textarea1);
		
		//para las pizzas
		lblPizzaName = new JLabel("Select your pizza:");
		lblPizzaName.setBounds(25, 40, 200, 30);
		lblPizzaName.setFont(new Font("Arial", 1, 14));
		lblPizzaName.setForeground(new Color(15, 20, 80));
		add(lblPizzaName);

		comboBoxPizza = new JComboBox();
		comboBoxPizza.setBounds(160, 40, 100, 30);
		comboBoxPizza.setModel(new DefaultComboBoxModel(PizzaTypes.values()));
		add(comboBoxPizza);
		comboBoxPizza.addItemListener(this);

		lblPizzaQuantity = new JLabel("Quantity:");
		lblPizzaQuantity.setBounds(25, 90, 100, 30);
		lblPizzaQuantity.setFont(new Font("Arial", 1, 14));
		lblPizzaQuantity.setForeground(new Color(15, 20, 80));
		add(lblPizzaQuantity);

		txtPizzaQuantity = new JTextField();
		txtPizzaQuantity.setBounds(160, 90, 70, 30);
		add(txtPizzaQuantity);
		txtPizzaQuantity.setText("1");

		
		
		//para las lasagnas
				lbllasagnaName = new JLabel("Select lasagna:");
				lbllasagnaName.setBounds(360, 40, 200, 30);
				lbllasagnaName.setFont(new Font("Arial", 1, 14));
				lbllasagnaName.setForeground(new Color(15, 20, 80));
				add(lbllasagnaName);

				comboBoxlasagna = new JComboBox();
				comboBoxlasagna.setBounds(520, 40, 100, 30);
				comboBoxlasagna.addItem("seleccione");
				comboBoxlasagna.setModel(new DefaultComboBoxModel(LasagnaType.values()));
				comboBoxlasagna.setModel(new DefaultComboBoxModel(LasagnaType.values()));
				add(comboBoxlasagna);
				comboBoxlasagna.addItemListener(this);

				lbllasagnaQuantity = new JLabel("Quantity:");
				lbllasagnaQuantity.setBounds(360, 90, 100, 30);
				lbllasagnaQuantity.setFont(new Font("Arial", 1, 14));
				lbllasagnaQuantity.setForeground(new Color(15, 20, 80));
				add(lbllasagnaQuantity);

				txtlasagnaQuantity = new JTextField();
				txtlasagnaQuantity.setBounds(520, 90, 70, 30);
				add(txtlasagnaQuantity);
				txtlasagnaQuantity.setText("1");

		
		
		
		
		
		// txtPizzaQuantity.addInputMethodListener(null);
		lbldef = new JLabel("Default List ");
		lbldef.setBounds(50, 160, 150, 30);
		lbldef.setFont(new Font("Arial", 3, 16));
		lbldef.setForeground(new Color(150, 20, 80));
		add(lbldef);
		defaultList = new JList();
		defaultList.setBounds(50, 200, 180, 200);
		defaultList.setVisibleRowCount(8);
		add(defaultList);

		JLabel lblPriceOrder = new JLabel("Price of one order: ");
		lblPriceOrder.setBounds(25, 450, 150, 30);
		lblPriceOrder.setFont(new Font("Arial", 3, 16));
		lblPriceOrder.setForeground(new Color(150, 20, 80));
		add(lblPriceOrder);

		txtPriceOrder = new JTextField();
		txtPriceOrder.setBounds(170, 450, 70, 30);
		add(txtPriceOrder);

		JLabel lblAdding = new JLabel("Aditional Ing + ");
		lblAdding.setBounds(310, 200, 150, 30);
		lblAdding.setFont(new Font("Arial", 3, 16));
		lblAdding.setForeground(new Color(15, 20, 80));
		add(lblAdding);
		comboBoxAditionalIngredients = new JComboBox();
		comboBoxAditionalIngredients.setBounds(310, 240, 200, 30);
		comboBoxAditionalIngredients.setModel(new DefaultComboBoxModel(IngredientType.values()));
		add(comboBoxAditionalIngredients);
		comboBoxAditionalIngredients.addItemListener(this);

		lblremove = new JLabel("Remove Ing - ");
		lblremove.setBounds(310, 300, 150, 30);
		lblremove.setFont(new Font("Arial", 3, 16));
		lblremove.setForeground(new Color(15, 20, 80));
		add(lblremove);
		comboBoxRemoveIngredients = new JComboBox();
		comboBoxRemoveIngredients.setBounds(310, 340, 200, 30);
		comboBoxRemoveIngredients.setModel(new DefaultComboBoxModel(IngredientType.values()));
		add(comboBoxRemoveIngredients);
		comboBoxRemoveIngredients.addItemListener(this);
		
		lblcustom = new JLabel("Custom list ");
		lblcustom.setBounds(550, 160, 150, 30);
		lblcustom.setFont(new Font("Arial", 3, 16));
		lblcustom.setForeground(new Color(200, 20, 80));
		add(lblcustom);
		customList = new JList();
		customList.setBounds(550, 200, 180, 200);
		customList.setVisibleRowCount(8);
		add(customList);

		JButton btnNewButton = new JButton("Add to Order List");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Order o1 = new Order(Quantity, product);
				String texto = "";
				BranchB.addToOrderlist(o1);
				for (Order o : BranchB.orderList) {
					texto += o.getProduct().printType() + "\n" + "precio base: "
							+ o.getProduct().getTotalCostIngredientsList() + "\n" + "cantidad: " + o.getQuantity()
							+ "\n" + "costo orden: " + o.getOrderCost() + "\n" + "------------" + "\n";

					textarea1.setText(texto);
					String tota=BranchB.calculateOrderListCost()+"";
					tot.setText(tota);

				}
			}
		});
		btnNewButton.setBounds(500, 450, 150, 35);
		add(btnNewButton);

		/*
		 * JSpinner spinner = new JSpinner(); spinner.setBounds(71, 58, 39, 33);
		 * add(spinner);
		 */

	}
	@Override
	public void itemStateChanged(final ItemEvent e) {
		DefaultListModel<IngredientType> modelo = new DefaultListModel<IngredientType>();
		DefaultListModel<IngredientType> modeloCustom = new DefaultListModel<IngredientType>();
		if (e.getSource() == comboBoxPizza) {
			final AbstractPizza pizzaB = factoryB.createPizza((PizzaTypes) comboBoxPizza.getSelectedItem());
			product = pizzaB;
			// pizzaA.aditionIngrediente(new Ingredients(IngredientType.FRESH_CLAM));
			for (Ingredients ing : pizzaB.getIngredientsList()) {
				modelo.addElement(ing.getIngredientsType());
			}

			defaultList.setModel(modelo);
			int q = Integer.parseInt(txtPizzaQuantity.getText());
			Quantity = q;
			Order order = new Order(q, pizzaB);

			txtPriceOrder.setText(order.getOrderCost() + "");

		} else if (e.getSource() == comboBoxRemoveIngredients) {

			// pizza.aditionIngrediente(new Ingredients((IngredientType)
			// comboBoxRemoveIngredients.getSelectedItem()));
			((AbstractPizza) product).removeIngrediente((IngredientType) comboBoxRemoveIngredients.getSelectedItem());
			for (Ingredients ing : ((AbstractPizza) product).getIngredientsList()) {

				modeloCustom.addElement(ing.getIngredientsType());
			}

			customList.setModel(modeloCustom);
			int q = Integer.parseInt(txtPizzaQuantity.getText());
			Quantity = q;
			Order order = new Order(q, product);

			txtPriceOrder.setText(order.getOrderCost() + "");

		} else if (e.getSource() == comboBoxAditionalIngredients) {

			((AbstractPizza) product).aditionIngrediente(
					new Ingredients((IngredientType) comboBoxAditionalIngredients.getSelectedItem()));
			// pizza.removeIngrediente((IngredientType)
			// comboBoxAditionalIngredients.getSelectedItem());
			for (Ingredients ing : ((AbstractPizza) product).getIngredientsList()) {

				modeloCustom.addElement(ing.getIngredientsType());
			}

			customList.setModel(modeloCustom);
			int q = Integer.parseInt(txtPizzaQuantity.getText());
			Quantity = q;
			Order order = new Order(q, product);

			txtPriceOrder.setText(order.getOrderCost() + "");
		}
	
		else if (e.getSource() == comboBoxlasagna) {
			final Lasagna lasagna = factoryB.createLasagana((LasagnaType) comboBoxlasagna.getSelectedItem());
			product = lasagna;
			// pizzaA.aditionIngrediente(new Ingredients(IngredientType.FRESH_CLAM));
			for (IngredientsLasagna ing : lasagna.getIngredientsList()) {
				modelo.addElement(ing.getIngredientsType());
			}

			defaultList.setModel(modelo);
			int q = Integer.parseInt(txtPizzaQuantity.getText());
			Quantity = q;
			Order order = new Order(q, lasagna);

			txtPriceOrder.setText(order.getOrderCost() + "");

		}
	
	}

	public static void main(final String args[]) {
		final ConfigureOrderB formulario2 = new ConfigureOrderB();
		formulario2.setBounds(0, 0, 1100, 550);
		formulario2.setVisible(true);
		formulario2.setLocationRelativeTo(null);
		formulario2.setResizable(false);
	}
	
	

}
