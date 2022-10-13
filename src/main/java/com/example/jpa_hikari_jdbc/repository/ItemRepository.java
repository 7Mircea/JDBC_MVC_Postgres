package com.example.jpa_hikari_jdbc.repository;

import com.example.jpa_hikari_jdbc.model.Item;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Integer> {
}
