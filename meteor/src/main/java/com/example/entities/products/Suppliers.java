package com.example.entities.products;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Suppliers {

	
	@Id
	private Integer SupplierID;
	@NotNull
	private String name;
	@NotNull
	private String CUI;
	
	private String SupplierLogoURL;

	public Integer getSupplierID() {
		return SupplierID;
	}

	public void setSupplierID(Integer supplierID) {
		SupplierID = supplierID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCUI() {
		return CUI;
	}

	public void setCUI(String cUI) {
		CUI = cUI;
	}

	public String getSupplierLogoURL() {
		return SupplierLogoURL;
	}

	public void setSupplierLogoURL(String supplierLogoURL) {
		SupplierLogoURL = supplierLogoURL;
	}
	
	
}
