package com.example.demo.entities.products;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ProductHasCategory {

	@Id
	@ManyToOne
	@JoinColumn(name = "ProductID")
	@Column(name = "ProductID")
	private Integer productId;
	@Id
	@ManyToOne
	@JoinColumn(name = "CategoryID")
	@Column(name = "CategoryID")
	private Integer categoryId;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

}
