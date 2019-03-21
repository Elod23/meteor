package com.example.entities.cart;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ShoppingCartStatus {

		@Id
		private Integer ShoppingCartStatusID;
		@NotNull
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
