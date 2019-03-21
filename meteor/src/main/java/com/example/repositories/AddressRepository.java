package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.customer.Addresses;

public interface AddressRepository extends JpaRepository<Addresses, Integer>{

}
