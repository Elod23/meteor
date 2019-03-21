package com.example.entities.customer;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Customers {
		
	@Id
	@OneToMany(mappedBy="ReviewerId")
	private Integer CustomerID;
	@NotNull
	private String LegalForm;
	@NotNull
	private String FirstName;
	@NotNull
	private String LastName;
	@NotNull
	private Date BirthDate;
	@NotNull
	private String Email;
	@NotNull
	private String Password;
	
	private String TelephoneNumber;
	@OneToOne
	@JoinColumn(name="AddressID")
	private Integer AddressId;
	public Integer getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(Integer customerID) {
		CustomerID = customerID;
	}
	public String getLegalForm() {
		return LegalForm;
	}
	public void setLegalForm(String legalForm) {
		LegalForm = legalForm;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Date getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getTelephoneNumber() {
		return TelephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		TelephoneNumber = telephoneNumber;
	}
	public Integer getAddressId() {
		return AddressId;
	}
	public void setAddressId(Integer addressId) {
		AddressId = addressId;
	}
	
	

}
