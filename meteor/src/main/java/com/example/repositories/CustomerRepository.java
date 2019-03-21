package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.customer.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Integer>{

}
