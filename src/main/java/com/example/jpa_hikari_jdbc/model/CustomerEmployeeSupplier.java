package com.example.jpa_hikari_jdbc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Set;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="CUSTOMER_EMPLOYEE_SUPPLIER")
public class CustomerEmployeeSupplier {
    @Id
    @Column(name = "id_ces",nullable = false,unique = true)
    private int idCES;
    @Column(nullable = false)
    private String name;
    @Column(length = 10)
    private String EIN;
    @Column(nullable = false)
    private char typeCES;
    private String address;
    @Column(nullable = false)
    private String IBAN;
    private String SSN;

    @ManyToMany(mappedBy = "idSupplier")
    private Set<Products> products;
//    @OneToMany(mappedBy = "idVendor")
//    private Set<Invoice> invoiceVendor;
//    @OneToMany(mappedBy = "idBuyer")
//    private Set<Invoice> invoiceBuyer;
//    @OneToMany(mappedBy = "idEmployee")
//    private Set<Invoice> invoiceEmployee;
}
