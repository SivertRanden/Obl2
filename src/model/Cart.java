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
	
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public Product findProduct(int pno) {
		Product prod = null;
		for (Product p : products){
			prod = p;
		}
		return prod;
	}
	
	public double getSum() {
		double sum = 0;
		for(Product p : products) {
			sum += p.getPriceInEuro();
		}
		return sum;
	}
	
	public int getQuantity(String pnoString) {
		int pno = Integer.parseInt(pnoString);
		int qty = 0;
		for(Product p : products) {
			if (p.getPno() == pno) {
				qty++;
			}
		}
		return qty;
	}
	
	public void addProduct(Product p) {
		products.add(p);
	}
	
	public ArrayList<Product> getProducts(){
		return products;
	}
}
