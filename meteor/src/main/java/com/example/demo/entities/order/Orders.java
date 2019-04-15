package com.example.demo.entities.order;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Orders {

	@Id
	@OneToMany(mappedBy = "OrderID")
	@Column(name = "OrderId")
	private Integer orderID;

	@ManyToOne
	@Column(name = "CustomerID")
	private Integer customerId;
	@NotNull
	@Column(name = "BillingName")
	private String billingName;

	@NotNull
	@Column(name = "DeliveryName")
	private String deliveryName;

	@NotNull
	@Column(name = "Email")
	private String email;

	@NotNull
	@Column(name = "PurchaseDate")
	private String purchaseDate;

	@OneToMany(mappedBy = "OrderStatus")
	@Column(name = "OrderStatusCode")
	private Integer orderStatusCode;

	@ManyToOne
	@Column(name = "BillingAddressID")
	private Integer billingAddressId;

	@Column(name = "DeliveryAddressID")
	private Integer deliveryAddressID;

	public Integer getOrderID() {
		return orderID;
	}

	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getBillingName() {
		return billingName;
	}

	public void setBillingName(String billingName) {
		this.billingName = billingName;
	}

	public String getDeliveryName() {
		return deliveryName;
	}

	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Integer getOrderStatusCode() {
		return orderStatusCode;
	}

	public void setOrderStatusCode(Integer orderStatusCode) {
		this.orderStatusCode = orderStatusCode;
	}

	public Integer getBillingAddressId() {
		return billingAddressId;
	}

	public void setBillingAddressId(Integer billingAddressId) {
		this.billingAddressId = billingAddressId;
	}

	public Integer getDeliveryAddressID() {
		return deliveryAddressID;
	}

	public void setDeliveryAddressID(Integer deliveryAddressID) {
		this.deliveryAddressID = deliveryAddressID;
	}
}
