package com.example.entities.order;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class OrderStatus {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer StatusCode;

		private String StatusDescription;
		
		public Integer getStatusCode() {
			return StatusCode;
		}
		public void setStatusCode(Integer statusCode) {
			StatusCode = statusCode;
		}
		public String getStatusDescription() {
			return StatusDescription;
		}
		public void setStatusDescription(String statusDescription) {
			StatusDescription = statusDescription;
		}
		
		
		
}
