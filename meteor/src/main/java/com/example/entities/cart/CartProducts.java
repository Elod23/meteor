package com.example.entities.cart;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class CartProducts {

		@ManyToOne
		@Id
		@JoinColumn(name="CartID")
		private Integer CartID;
		
		@ManyToOne
		@JoinColumn(name="ProductID")
		private Integer ProductId;
		
		@NotNull
		private int Quantity;

		public Integer getCartID() {
			return CartID;
		}

		public void setCartID(Integer cartID) {
			CartID = cartID;
		}

		public Integer getProductId() {
			return ProductId;
		}

		public void setProductId(Integer productId) {
			this.ProductId = productId;
		}

		public int getQuantity() {
			return Quantity;
		}

		public void setQuantity(int quantity) {
			Quantity = quantity;
		}
		
		
}
