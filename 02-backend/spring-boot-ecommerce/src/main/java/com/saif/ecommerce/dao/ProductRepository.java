package com.saif.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;


import com.saif.ecommerce.entity.Product;

@CrossOrigin(origins = "*")
public interface ProductRepository extends JpaRepository<Product, Long> {
}