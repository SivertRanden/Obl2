package application;

import model.Cart;
import model.Description;
import model.Product;

public class Oppgave1 {

	public static void main(String[] args) {
		
		Description d1 = new Description(1, "NO", "fin svart kopp");
		Description d2 = new Description(2, "NO", "fin hvit kopp");
		Description d3 = new Description(3, "NO", "fin rød kopp");
		
		Product p1 = new Product(1, "Black cup", 10.0, "", d1);
		Product p2 = new Product(2, "White cup", 12.0, "", d2);
		Product p3 = new Product(3, "Red cup", 5.0, "", d3);
		
		Cart cart = new Cart();
		
		cart.addProduct(p1);
		cart.addProduct(p2);
		cart.addProduct(p3);
		

	}

}
