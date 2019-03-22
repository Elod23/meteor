package com.example.entities.products;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ProductHasCategory {

		@Id
		@ManyToOne
		@JoinColumn(name="ProductID")
		private Integer ProductID;
		@Id
		@ManyToOne
		@JoinColumn(name="CategoryID")
		private Integer CategoryID;
		
		public Integer getProductID() {
			return ProductID;
		}
		public void setProductID(Integer productID) {
			ProductID = productID;
		}
		public Integer getCategoryID() {
			return CategoryID;
		}
		public void setCategoryID(Integer categoryID) {
			CategoryID = categoryID;
		}
		
		
		
}
