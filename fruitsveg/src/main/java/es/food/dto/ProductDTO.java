package es.food.dto;

import java.io.Serializable;

public class ProductDTO implements Serializable{		
	
	private static final long serialVersionUID = 1L;
	private int id;	
	private String name;
	private int stock;
	private String image;
	private String family;
	private double price;
	private double vat;
	private double wholesalePrice;
	private int wholesaleQuantity;
	private long created;
	private long modified;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getVat() {
		return vat;
	}
	public void setVat(double vat) {
		this.vat = vat;
	}
	public double getWholesalePrice() {
		return wholesalePrice;
	}
	public void setWholesalePrice(double wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}
	public int getWholesaleQuantity() {
		return wholesaleQuantity;
	}
	public void setWholesaleQuantity(int wholesaleQuantity) {
		this.wholesaleQuantity = wholesaleQuantity;
	}
	public long getCreated() {
		return created;
	}
	public void setCreated(long created) {
		this.created = created;
	}
	public long getModified() {
		return modified;
	}
	public void setModified(long modified) {
		this.modified = modified;
	}
	
	
}
