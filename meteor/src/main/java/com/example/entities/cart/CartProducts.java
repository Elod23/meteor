package com.example.entities.cart;

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
	private Integer CartID;

	@Id
	@ManyToOne
	@JoinColumn(name = "ProductID")
	private Integer ProductID;

	@NotNull
	private int Quantity;

	public Integer getCartID() {
		return CartID;
	}

	public void setCartID(Integer cartID) {
		CartID = cartID;
	}

	public Integer getProductId() {
		return ProductID;
	}

	public void setProductId(Integer productId) {
		this.ProductID = productId;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

}
