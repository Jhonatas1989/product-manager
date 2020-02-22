package com.oliveira.product.manager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oliveira.product.manager.model.Product;
import com.oliveira.product.manager.repository.ProductRespository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRespository productRespository;

	@Override
	public List<Product> findAll() {
		return productRespository.findAll();
	}

	@Override
	public Optional<Product> findById(Long id) {
		return productRespository.findById(id);
	}

	@Override
	public Product save(Product product) {
		return productRespository.save(product);
	}

	@Override
	public void deleteById(Long id) {
		productRespository.deleteById(id);
	}

}