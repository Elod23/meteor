package com.example.demo.entities.products;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SupplierID")
	private Integer supplierId;
	@NotNull
	@Column(name = "Name")
	private String name;
	@NotNull
	@Column(name = "CUI")
	private String CUI;
	@Column(name = "SupplierLogoURL")
	private String supplierLogoURL;

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

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierLogoURL() {
		return supplierLogoURL;
	}

	public void setSupplierLogoURL(String supplierLogoURL) {
		this.supplierLogoURL = supplierLogoURL;
	}

}
