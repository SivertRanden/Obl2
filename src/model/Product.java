package model;
import model.Description;
public class Product {

	private int pno;
	private String pName;
	private double priceInEuro;
	private String imageFile;
	Description description;
	
	public Product(int pno, String pName, double priceInEuro, String imageFile, Description description) {
		this.pno = pno;
		this.pName = pName;
		this.priceInEuro = priceInEuro;
		this.imageFile = imageFile;
		this.description = description;
	}
	
	public Product(int pno, String pName, double priceInEuro, String imageFile) {
		this.pno = pno;
		this.pName = pName;
		this.priceInEuro = priceInEuro;
		this.imageFile = imageFile;
	}
	
}
