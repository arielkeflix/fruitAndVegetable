package es.food.dto;

import java.io.Serializable;
import java.util.UUID;

import es.food.dao.Product;

public class OrderDetailDTO implements Serializable{	
	
	private static final long serialVersionUID = 1L;
	private UUID id;		
	private ProductDTO product;		
	private Integer quantity;
	private Double subtotal;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public ProductDTO getProduct() {
		return product;
	}
	public void setProduct(ProductDTO product) {
		this.product = product;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	
	
}
