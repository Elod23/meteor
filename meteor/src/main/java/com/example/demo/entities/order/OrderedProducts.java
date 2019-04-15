package com.example.demo.entities.order;

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
	@Column(name = "OrderedProductID")
	private Integer orderedProductId;

	@OneToOne
	@Column(name = "ProductId")
	private Integer productId;

	@NotNull
	@Column(name = "Name")
	private String name;

	@Column(name = "orderedProductDescription")
	private String description;

	@NotNull
	@Column(name = "Price")
	private float price;

	@NotNull
	private int TVA;

	@NotNull
	@Column(name = "Quantity")
	private float quantity;

	@ManyToOne
	@JoinColumn(name = "OrderID")
	@Column(name = "OrderID")
	private Integer orderID;

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

	public Integer getOrderedProductId() {
		return orderedProductId;
	}

	public void setOrderedProductId(Integer orderedProductId) {
		this.orderedProductId = orderedProductId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public Integer getOrderID() {
		return orderID;
	}

	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
}
