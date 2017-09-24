package application;

import model.Cart;
import model.Description;
import model.Product;

public class Oppgave1 {

	public static void main(String[] args) {
		
		Product p1 = new Product(1, "Black cup", 10.0, "");
		Product p2 = new Product(2, "White cup", 12.0, "");
		Product p3 = new Product(3, "Red cup", 5.0, "");
		
		Cart cart = new Cart();
		
		cart.addProduct(p1);
		cart.addProduct(p2);
		cart.addProduct(p3);
		

	}

}
