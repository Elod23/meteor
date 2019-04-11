package com.example.entities.products;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Products {

		@Id
		@OneToMany(mappedBy= "ProductId")
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer ProductId;
		@NotNull
		private String Name;
		@NotNull
		private String MeasurementUnit;
		@NotNull
		private String SecondaryMU;
		@NotNull
		private float Price;
		@NotNull
		private float CantitateStoc;
		@NotNull
		private int CotaTVA;
		
		@ManyToOne
		@JoinColumn(name="SupplierID")
		private Integer SupplierID;
		
		private String ProductDescription;

		public Integer getProductId() {
			return ProductId;
		}

		public void setProductId(Integer productId) {
			ProductId = productId;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getMeasurementUnit() {
			return MeasurementUnit;
		}

		public void setMeasurementUnit(String measurementUnit) {
			MeasurementUnit = measurementUnit;
		}

		public String getSecondaryMU() {
			return SecondaryMU;
		}

		public void setSecondaryMU(String secondaryMU) {
			SecondaryMU = secondaryMU;
		}

		public float getPrice() {
			return Price;
		}

		public void setPrice(float price) {
			this.Price = price;
		}

		public float getCantitateStoc() {
			return CantitateStoc;
		}

		public void setCantitateStoc(float cantitateStoc) {
			CantitateStoc = cantitateStoc;
		}

		public int getCotaTVA() {
			return CotaTVA;
		}

		public void setCotaTVA(int cotaTVA) {
			CotaTVA = cotaTVA;
		}

		public Integer getSupplierID() {
			return SupplierID;
		}

		public void setSupplierID(Integer supplierID) {
			SupplierID = supplierID;
		}

		public String getProductDescription() {
			return ProductDescription;
		}

		public void setProductDescription(String productDescription) {
			ProductDescription = productDescription;
		}
		
		
		
}
