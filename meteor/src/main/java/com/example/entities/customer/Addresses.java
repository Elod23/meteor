package com.example.entities.customer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Addresses {

	@Id
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
