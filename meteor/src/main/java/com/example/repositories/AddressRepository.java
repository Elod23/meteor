package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.customer.Addresses;

public interface AddressRepository extends JpaRepository<Addresses, Integer>{
	
	List<Addresses> findByCountryIgnoreCase(String countryName);
	
	List<Addresses> findByRegionIgnoreCase(String regionName);
	
	List<Addresses> findByCityIgnoreCase(String cityName);
	
	List<Addresses> findByStreetIgnoreCase(String streetName);
	
	Addresses findByStreetAndNumberIgnoreCase(String streetName, int number);
	
	List<Addresses> findByCountryAndRegion(String countryName, String regionName);
	
	List<Addresses> findByStreetAndNumber(String streetName, int number);
	
	
	

}
