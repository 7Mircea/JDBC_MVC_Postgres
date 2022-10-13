package com.example.jpa_hikari_jdbc.repository;

import com.example.jpa_hikari_jdbc.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products,Long> {
}
