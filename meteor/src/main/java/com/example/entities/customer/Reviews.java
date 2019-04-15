package com.example.entities.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Reviews {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer ReviewId;
		@NotNull
		private int Rating;
		
		private String Text;
		
		@ManyToOne
		private Integer ReviewerId;
		
		@ManyToOne
		private Integer ProductId;

		public Integer getReviewId() {
			return ReviewId;
		}

		public void setReviewId(Integer reviewId) {
			ReviewId = reviewId;
		}

		public int getRating() {
			return Rating;
		}

		public void setRating(int rating) {
			Rating = rating;
		}

		public String getText() {
			return Text;
		}

		public void setText(String text) {
			Text = text;
		}

		public Integer getReviewerId() {
			return ReviewerId;
		}

		public void setReviewerId(Integer reviewerId) {
			ReviewerId = reviewerId;
		}

		public Integer getProductId() {
			return ProductId;
		}

		public void setProductId(Integer productId) {
			ProductId = productId;
		}
		
		
}
