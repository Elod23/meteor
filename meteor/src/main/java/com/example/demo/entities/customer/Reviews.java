package com.example.demo.entities.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Reviews {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ReviewID")
	private Integer reviewId;
	@NotNull
	@Column(name = "Rating")
	private int rating;
	@Column(name = "Text")
	private String text;

	@ManyToOne
	@Column(name = "ReviewerID")
	private Integer reviewerId;

	@ManyToOne
	@Column(name = "ProductID")
	private Integer productId;

	public Integer getReviewId() {
		return reviewId;
	}

	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getReviewerId() {
		return reviewerId;
	}

	public void setReviewerId(Integer reviewerId) {
		this.reviewerId = reviewerId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

}
