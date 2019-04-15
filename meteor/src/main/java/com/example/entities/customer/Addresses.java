package com.example.entities.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Addresses {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer AddressID;
	@NotNull
	private String Country;
	@NotNull
	private String Region;
	@NotNull
	private String City;
	@NotNull
	private String Street;
	@NotNull
	private int Number;
	
}
