package com.oliveira.product.manager.util;

import com.oliveira.product.manager.dto.ProductDTO;
import com.oliveira.product.manager.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductHelper {

    public static ProductDTO convertFromProductToProductDTO(Product product) {
        return new ProductDTO(product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getCreatedAt(),
                product.getUpdatedAt());
    }

    public static Product convertFromProductDTOToProduct(ProductDTO product) {
        return new Product(product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getCreatedAt(),
                product.getUpdatedAt());
    }

    public static List<ProductDTO> convertFromListProductDTOToListProduct(List<Product> products) {
        List<ProductDTO> productDTOS = new ArrayList<ProductDTO>();

        products.forEach(product -> productDTOS.add(
                new ProductDTO(product.getId(),
                        product.getName(),
                        product.getDescription(),
                        product.getPrice(),
                        product.getCreatedAt(),
                        product.getUpdatedAt())
        ));

        return productDTOS;
    }


}
