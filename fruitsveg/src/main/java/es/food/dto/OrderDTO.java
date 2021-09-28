package es.food.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;

import es.food.dao.Address;
import es.food.dao.OrderDetail;

public class OrderDTO implements Serializable{	
	
	
	private static final long serialVersionUID = 1L;
	private UUID id;
	private UUID clientId;	
	@JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDateTime dateCreated;	
	private Address shippingAddress;
	private Address billingAddress;
	private Double total;	
	
	private Set<OrderDetailDTO> orderDetails = new HashSet<>();

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getClientId() {
		return clientId;
	}

	public void setClientId(UUID clientId) {
		this.clientId = clientId;
	}

	public LocalDateTime getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Set<OrderDetailDTO> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(Set<OrderDetailDTO> orderDetails) {
		this.orderDetails = orderDetails;
	}
		


}
