package com.example.entities.cart;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ShoppingCartStatus {

		@Id
		@Column(name="shoppingcartstatusID")
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer ShoppingCartStatusID;
		@NotNull
		@Column(name="shoppingcartstatusDescription")
		private String ShoppingCartStatusDescription;
		
		public Integer getShoppingCartStatusID() {
			return ShoppingCartStatusID;
		}
		public void setShoppingCartStatusID(Integer shoppingCartStatusID) {
			ShoppingCartStatusID = shoppingCartStatusID;
		}
		public String getShoppingCartStatusDescription() {
			return ShoppingCartStatusDescription;
		}
		public void setShoppingCartStatusDescription(String shoppingCartStatusDescription) {
			ShoppingCartStatusDescription = shoppingCartStatusDescription;
		}
		
		
}
