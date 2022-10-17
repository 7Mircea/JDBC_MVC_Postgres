package com.example.jpa_hikari_jdbc.repository;

import com.example.jpa_hikari_jdbc.model.CustomerEmployeeSupplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface CustomerEmployeeSupplierRepository extends JpaRepository<CustomerEmployeeSupplier,Integer> {
    Set<CustomerEmployeeSupplier> findCustomerEmployeeSupplierByTypeCES(char c);
}
