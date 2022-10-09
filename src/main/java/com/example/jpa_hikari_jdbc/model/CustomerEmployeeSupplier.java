package com.example.jpa_hikari_jdbc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@Setter
@Entity(name="CUSTOMER_EMPLOYEE_SUPPLIER")
public class CustomerEmployeeSupplier {
    @Id
    @Column(name = "id_ces",nullable = false,unique = true)
    public int idCES;
    @Column(nullable = false)
    public String name;
    @Column(length = 10)
    public String EIN;
    @Column(nullable = false)
    public char typeCES;
    public String address;
    @Column(nullable = false)
    public String IBAN;
    public String SSN;
}
