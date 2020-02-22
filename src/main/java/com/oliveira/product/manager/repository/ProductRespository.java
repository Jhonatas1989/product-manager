package com.oliveira.product.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveira.product.manager.model.Product;

/**
 * @author Jhonatas Oliveira
 *
 */
public interface ProductRespository extends JpaRepository<Product, Long> {
}
