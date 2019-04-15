package com.example.demo.entities.cart;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class CartProducts {

	@ManyToOne
	@Id
	@JoinColumn(name = "CartID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CartID")
	private Integer cartID;

	@Id
	@ManyToOne
	@JoinColumn(name = "ProductID")
	@Column(name = "ProductID")
	private Integer productId;

	@NotNull
	@Column(name = "Quantity")
	private int quantity;

	public Integer getCartID() {
		return cartID;
	}

	public void setCartID(Integer cartID) {
		this.cartID = cartID;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
