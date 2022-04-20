package com.sha.sparingbootproductseller.repository;

import com.sha.sparingbootproductseller.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>
{
}
