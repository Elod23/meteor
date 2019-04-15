package com.example.demo.entities.products;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Product {

	@Id
	@OneToMany(mappedBy = "ProductId")
	@Column(name = "ProductID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;
	@NotNull
	@Column(name = "Name")
	private String name;
	@NotNull
	@Column(name = "MeasurementUnit")
	private String measurementUnit;
	@NotNull
	@Column(name = "SecondaryMU")
	private String secondaryMU;
	@NotNull
	@Column(name = "Price")
	private float price;
	@NotNull
	@Column(name = "CantitateStoc")
	private float quantity;
	@NotNull
	@Column(name = "CotaTVA")
	private int cotaTVA;

	@ManyToOne
	@JoinColumn(name = "SupplierID")
	@Column(name = "SupplierID")
	private Integer supplierID;

	@Column(name = "ProductDescription")
	private String productDescription;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMeasurementUnit() {
		return measurementUnit;
	}

	public void setMeasurementUnit(String measurementUnit) {
		this.measurementUnit = measurementUnit;
	}

	public String getSecondaryMU() {
		return secondaryMU;
	}

	public void setSecondaryMU(String secondaryMU) {
		this.secondaryMU = secondaryMU;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public int getCotaTVA() {
		return cotaTVA;
	}

	public void setCotaTVA(int cotaTVA) {
		this.cotaTVA = cotaTVA;
	}

	public Integer getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(Integer supplierID) {
		this.supplierID = supplierID;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

}
