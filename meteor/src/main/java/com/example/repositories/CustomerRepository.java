package com.example.repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.customer.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Integer>{
	
	List<Customers> findByLegalFormIgnoreCase(String formName);
	
	List<Customers> findByFirstNameAndLastNameIgnoreCase(String firstName, String lastName);
	
	List<Customers> findByBirthDate(Date birthDate);
	
	List<Customers> findByEmail(String email);
	
	List<Customers> findByTelephoneNumber(String number);

}
