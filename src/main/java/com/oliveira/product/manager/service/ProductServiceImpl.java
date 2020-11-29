package com.oliveira.product.manager.service;

import com.oliveira.product.manager.dto.ProductDTO;
import com.oliveira.product.manager.model.Product;
import com.oliveira.product.manager.repository.ProductRespository;
import com.oliveira.product.manager.util.ProductHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRespository productRespository;

    @Override
    public List<ProductDTO> findAll() {
        return ProductHelper.convertFromListProductDTOToListProduct(productRespository.findAll());
    }

    @Override
    public ProductDTO findById(Long id) {
        Optional<Product> product = productRespository.findById(id);

        if (product.isPresent()) {
            return ProductHelper.convertFromProductToProductDTO(product.get());
        }

        return new ProductDTO();
    }

    @Override
    public ProductDTO save(ProductDTO productDTO) {
        Product product = ProductHelper.convertFromProductDTOToProduct(productDTO);
        return ProductHelper.convertFromProductToProductDTO(productRespository.save(product));
    }

    @Override
    public void deleteById(Long id) {
        productRespository.deleteById(id);
    }

    @Override
    public boolean exist(Long id) {
        return productRespository.existsById(id);
    }

}