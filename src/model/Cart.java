package model;

import java.util.ArrayList;

public class Cart {
	private ArrayList<Product> products;
	
	public Cart(ArrayList<Product> products){
		this.products = products;
	}
	
	public Cart(){
		products = new ArrayList<Product>();
	}
	
	public Product findProduct(int pno) {
		Product prod = null;
		for (Product p : products){
			prod = p;
		}
		return prod;
	}
	
	public void addProduct(Product p) {
		products.add(p);
	}
	
	public ArrayList<Product> getProducts(){
		return products;
	}
}
