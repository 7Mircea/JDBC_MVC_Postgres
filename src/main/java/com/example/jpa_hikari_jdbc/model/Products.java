package com.example.jpa_hikari_jdbc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@Entity
public class Products {
    @Id
    @Column(name="id_prod",nullable = false,unique = true)
    private Integer idProd; //NUMBER(10) in Oracle
    @Column(name = "prod_name",length = 50,nullable = false)
    private String prodName;
    @Column(name="id_supplier",nullable = false)
    private int idSupplier;
    @Column(length = 20,nullable = false)
    private String availability;
    @Column(length = 20,nullable = false)
    private String category;
    @Column(name = "add_info",length = 100,nullable = true)
    private String addInfo;

//    @ManyToMany(mappedBy = "idCES",cascade = CascadeType.ALL)
//    private Set<CustomerEmployeeSupplier> suppliers;
//    @OneToMany(mappedBy = "idProd",cascade = CascadeType.ALL,orphanRemoval = true)
//    private Set<Characteristic> characteristics;
}
