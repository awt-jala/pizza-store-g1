package main.java.p1;

public class Order {

	int quantity;
	Pizza pizza;

	public Order(int quantity, Pizza pizza){
		this.quantity=quantity;
		this.pizza=pizza;	
		}

	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	
}
