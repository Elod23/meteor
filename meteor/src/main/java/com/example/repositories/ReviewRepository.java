package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.customer.Reviews;

public interface ReviewRepository extends JpaRepository<Reviews, Integer>{
	
	List<Reviews> findByReviewerID(Integer reviewerID);
	
	List<Reviews> findByRating(int rating);
	
	List<Reviews> findByProductID(Integer ProductID);
	

}
