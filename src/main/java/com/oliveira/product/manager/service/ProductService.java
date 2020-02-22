package com.oliveira.product.manager.service;

import java.util.List;
import java.util.Optional;

import com.oliveira.product.manager.model.Product;

public interface ProductService {

	public List<Product> findAll();

	public Optional<Product> findById(Long id);

	public Product save(Product product);

	public void deleteById(Long id);

}
