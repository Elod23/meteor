package com.example.demo.entities.order;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderStatus {

	@Id
	@Column(name = "StatusCode")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer statusCode;

	@Column(name = "StatusDescription")
	private String statusDescription;
	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

}
