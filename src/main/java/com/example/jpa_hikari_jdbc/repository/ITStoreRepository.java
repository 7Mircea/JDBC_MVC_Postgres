package com.example.jpa_hikari_jdbc.repository;

import com.example.jpa_hikari_jdbc.model.Produse;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ITStoreRepository extends PagingAndSortingRepository<Produse,Long> {
}
