package com.example.jpa_hikari_jdbc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Setter
@Getter
@Entity
public class Products {
    @Id
    @Column(name="id_prod",nullable = false,unique = true)
    public Integer idProd; //NUMBER(10) in Oracle
    @Column(name = "prod_name",length = 50,nullable = false)
    public String denProd;
    @Column(name="id_supplier",nullable = false)
    public int idSupplier;
    @Column(length = 20,nullable = false)
    public String availability;
    @Column(length = 20,nullable = false)
    public String category;
    @Column(name = "add_info",length = 100,nullable = true)
    public String addInfo;
}
