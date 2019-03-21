package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.products.Suppliers;

public interface SupplierRepository extends JpaRepository<Suppliers, Integer>{

}
