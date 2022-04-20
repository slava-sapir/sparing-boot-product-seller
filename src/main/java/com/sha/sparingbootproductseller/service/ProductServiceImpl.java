package com.sha.sparingbootproductseller.service;

import com.sha.sparingbootproductseller.model.Product;
import com.sha.sparingbootproductseller.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService
{
     private final ProductRepository productRepository;

     public ProductServiceImpl(ProductRepository productRepository)
     {
        this.productRepository = productRepository;
     }

     @Override
     public Product saveProduct(Product product)
     {
         product.setCreateTime(LocalDateTime.now());
         return productRepository.save(product);
     }

     @Override
     public void deleteProduct(Long id)
     {
         productRepository.deleteById(id);
     }

     @Override
     public List<Product> findAllProducts()
     {
         return productRepository.findAll();
     }
}
