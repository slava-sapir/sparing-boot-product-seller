package com.sha.sparingbootproductseller.service;

import com.sha.sparingbootproductseller.model.Product;

import java.util.List;

public interface ProductService
{
    Product saveProduct(Product product);

    void deleteProduct(Long id);

    List<Product> findAllProducts();
}
