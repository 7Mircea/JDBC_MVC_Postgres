package com.example.jpa_hikari_jdbc.repository;

import com.example.jpa_hikari_jdbc.model.Characteristic;

import com.example.jpa_hikari_jdbc.model.CharacteristicId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacteristicRepository extends JpaRepository<Characteristic, CharacteristicId> {
}
