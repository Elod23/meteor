package com.example.demo.entities.cart;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class ShoppingCarts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CartID")
	private Integer cartId;
	@NotNull
	@OneToOne
	@Column(name = "CustomerID")
	private Integer customerId;
	@NotNull
	@Column(name = "CartCreated")
	private LocalDateTime cartCreated;
	@OneToMany(mappedBy = "ShoppingCartStatusID")
	@Column(name = "CartStatusCode")
	private Integer cartStatusCode;

	// we need this constructor to ALWAYS initialize the cart with the respective
	// date to make it available and trackable
	public ShoppingCarts() {
		this.cartCreated = LocalDateTime.now();
	}

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public LocalDateTime getCartCreated() {
		return cartCreated;
	}

	public void setCartCreated(LocalDateTime cartCreated) {
		this.cartCreated = cartCreated;
	}

	public Integer getCartStatusCode() {
		return cartStatusCode;
	}

	public void setCartStatusCode(Integer cartStatusCode) {
		this.cartStatusCode = cartStatusCode;
	}

}
