package com.example.entities.order;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class OrderedProducts {
	
	@Id
	private Integer OrderedProductId;
	@OneToOne
	private Integer ProductId;
	@NotNull
	private String Name;
	@Column(name="OrderedProductDescription")
	private String description;
	@NotNull
	private float price;
	@NotNull
	private int TVA;
	@NotNull
	private float Quantity;
	@ManyToOne
	@JoinColumn(name="OrderID")
	private Integer OrderID;
	public Integer getOrderedProductId() {
		return OrderedProductId;
	}
	public void setOrderedProductId(Integer orderedProductId) {
		OrderedProductId = orderedProductId;
	}
	public Integer getProductId() {
		return ProductId;
	}
	public void setProductId(Integer productId) {
		ProductId = productId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getTVA() {
		return TVA;
	}
	public void setTVA(int tVA) {
		TVA = tVA;
	}
	public float getQuantity() {
		return Quantity;
	}
	public void setQuantity(float quantity) {
		Quantity = quantity;
	}
	public Integer getOrderID() {
		return OrderID;
	}
	public void setOrderID(Integer orderID) {
		OrderID = orderID;
	}
	
	
	
	
}
