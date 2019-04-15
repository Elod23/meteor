package com.example.demo.entities.customer;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Customers {

	@Id
	@OneToMany(mappedBy = "ReviewerId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CustomerID")
	private Integer customerId;
	@NotNull
	@Column(name = "LegalForm")
	private String legalForm;
	@NotNull
	@Column(name = "FirstName")
	private String firstName;
	@NotNull
	@Column(name = "LastName")
	private String lastName;
	@NotNull
	@Column(name = "BirthDate")
	private Date birthDate;
	@NotNull
	@Column(name = "Email")
	private String email;
	@NotNull
	@Column(name = "Password")
	private String password;

	@Column(name = "TelephoneNumber")
	private String telephoneNumber;
	@OneToOne
	@JoinColumn(name = "AddressID")
	@Column(name = "AdressID")
	private Integer addressId;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getLegalForm() {
		return legalForm;
	}

	public void setLegalForm(String legalForm) {
		this.legalForm = legalForm;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

}
