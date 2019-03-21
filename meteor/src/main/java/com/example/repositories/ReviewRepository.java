package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.customer.Reviews;

public interface ReviewRepository extends JpaRepository<Reviews, Integer>{

}
