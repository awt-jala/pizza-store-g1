package store;

import abstractclases.Product;

public class Order {

	int quantity;
	Product product;
	double orderCost;
	//AbstractPizza pizza;
	
	public double getOrderCost() {
		return orderCost;
	}


	public void setOrderCost(double orderCost) {
		this.orderCost = orderCost;
	}


	public Order(int quantity, Product product){
		this.quantity=quantity;
		this.product=product;
		orderCost=quantity*product.getTotalCostIngredientsList();
		}

	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}

	
	
	
}
