package com.example.jpa_hikari_jdbc.repository;

import com.example.jpa_hikari_jdbc.model.Products;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ITStoreRepository extends PagingAndSortingRepository<Products,Long> {
}
