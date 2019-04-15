package com.example.demo.entities.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Addresses {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AddressID")
	private Integer addressId;
	@NotNull
	@Column(name = "Country")
	private String country;
	@NotNull
	@Column(name = "Region")
	private String region;
	@NotNull
	@Column(name = "City")
	private String city;
	@NotNull
	@Column(name = "Street")
	private String street;
	@NotNull
	@Column(name = "Number")
	private int number;

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
