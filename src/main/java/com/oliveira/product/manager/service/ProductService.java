package com.oliveira.product.manager.service;

import com.oliveira.product.manager.dto.ProductDTO;
import com.oliveira.product.manager.model.Product;

import java.util.List;

public interface ProductService {

    public List<ProductDTO> findAll();

    public ProductDTO findById(Long id);

    public ProductDTO save(ProductDTO product);

    public void deleteById(Long id);

    public boolean exist(Long id);

}
