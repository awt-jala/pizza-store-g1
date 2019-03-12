package main.java.p1;

public class Order {

	int quantity;
	AbstractPizza pizza;
	Client client;
	public Order(int quantity, AbstractPizza pizza){
		this.quantity=quantity;
		this.pizza=pizza;	
		}

	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public AbstractPizza getPizza() {
		return pizza;
	}

	public void setPizza(AbstractPizza pizza) {
		this.pizza = pizza;
	}

	
}
