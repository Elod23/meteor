package com.example.demo.services.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.products.Supplier;
import com.example.demo.repositories.SupplierRepository;

@Service
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	private SupplierRepository supplierRepository;

	public SupplierServiceImpl(SupplierRepository supplierRepository) {
		super();
		this.supplierRepository = supplierRepository;
	}

	@Override
	public Supplier save(Supplier supplier) {
		return supplierRepository.save(supplier);
	}

	@Override
	public Supplier update(Supplier supplier) {
		supplierRepository.delete(supplier);
		return supplierRepository.save(supplier);
	}

	@Override
	public Supplier delete(Supplier supplier) {
		supplierRepository.delete(supplier);
		return supplier;
	}

	@Override
	public List<Supplier> findAll() {
		return supplierRepository.findAll();
	}

}
