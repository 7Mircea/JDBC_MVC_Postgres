package com.example.jpa_hikari_jdbc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Setter
@Getter
@Entity
public class Produse {
    @Id
    @Column(name="id_prod",nullable = false,unique = true)
    public Integer idProd; //NUMBER(10) in Oracle
    @Column(name = "den_prod",length = 50,nullable = false)
    public String denProd;
    @Column(name="id_furnizor",nullable = false)
    public int idFurnizor;
    @Column(length = 20,nullable = false)
    public String disponibilitate;
    @Column(length = 20,nullable = false)
    public String categorie;
    @Column(name = "info_supl",length = 100,nullable = true)
    public String infoSupl;
}
