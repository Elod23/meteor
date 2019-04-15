package com.example.entities.order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Orders {

	
	@Id
	@OneToMany(mappedBy="OrderID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer OrderID;
	
	@ManyToOne
	private Integer CustomerID;
	@NotNull
	private String BillingName;
	
	private String DeliveryName;
	
	@NotNull
	private String Email;
	
	@NotNull
	private String PurchaseDate;
	
	@OneToMany(mappedBy="OrderStatus")
	private Integer OrderStatusCode;
	
	@ManyToOne
	private Integer BillingAddressID;
	
	private Integer DeliveryAddressID;

	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int orderID) {
		OrderID = orderID;
	}

	public Integer getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public String getBillingName() {
		return BillingName;
	}

	public void setBillingName(String billingName) {
		BillingName = billingName;
	}

	public String getDeliveryName() {
		return DeliveryName;
	}

	public void setDeliveryName(String deliveryName) {
		DeliveryName = deliveryName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPurchaseDate() {
		return PurchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		PurchaseDate = purchaseDate;
	}

	public Integer getOrderStatusCode() {
		return OrderStatusCode;
	}

	public void setOrderStatusCode(int orderStatusCode) {
		OrderStatusCode = orderStatusCode;
	}

	public Integer getBillingAddressID() {
		return BillingAddressID;
	}
	

	public void setBillingAddressID(int billingAddressID) {
		BillingAddressID = billingAddressID;
	}

	public Integer getDeliveryAddressID() {
		return DeliveryAddressID;
	}
	
	public void setDeliveryAddressID(int deliveryAddressID) {
		DeliveryAddressID = deliveryAddressID;
	}
	
	
	
	
}
