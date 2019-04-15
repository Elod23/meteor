package com.example.entities.cart;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class ShoppingCarts {

		@Id
		private Integer CartID;
		@NotNull
		@OneToOne
		private Integer CusttomerID;
		@NotNull
		private LocalDateTime CartCreated;
		@OneToMany(mappedBy="ShoppingCartStatusID")
		private Integer CartStatusCode;
		
		//we need this constructor to ALWAYS initialize the cart with the respective date to make it available and trackable
		public ShoppingCarts() {
			this.CartCreated = LocalDateTime.now();
		}

		public Integer getCartID() {
			return CartID;
		}

		public void setCartID(Integer cartID) {
			CartID = cartID;
		}

		public Integer getCustomerId() {
			return CusttomerID;
		}

		public void setCustomerId(Integer customerId) {
			CusttomerID = customerId;
		}

		public LocalDateTime getCartCreated() {
			return CartCreated;
		}

		public void setCartCreated(LocalDateTime cartCreated) {
			CartCreated = cartCreated;
		}

		public Integer getCartStatusCode() {
			return CartStatusCode;
		}

		public void setCartStatusCode(Integer cartStatusCode) {
			CartStatusCode = cartStatusCode;
		}
		
		
}
