package com.example.demo.entities.cart;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ShoppingCartStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ShoppingCartStatusID")
	private Integer shoppingCartStatusId;
	@NotNull
	@Column(name = "ShoppingCartStatusDescription")
	private String shoppingCartStatusDescription;

	public Integer getShoppingCartStatusId() {
		return shoppingCartStatusId;
	}

	public void setShoppingCartStatusId(Integer shoppingCartStatusId) {
		this.shoppingCartStatusId = shoppingCartStatusId;
	}

	public String getShoppingCartStatusDescription() {
		return shoppingCartStatusDescription;
	}

	public void setShoppingCartStatusDescription(String shoppingCartStatusDescription) {
		this.shoppingCartStatusDescription = shoppingCartStatusDescription;
	}

}
