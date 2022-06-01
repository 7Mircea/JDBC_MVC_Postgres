package com.example.jpa_hikari_jdbc.model;

import lombok.Cleanup;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Getter
@Setter
@Entity
public class Item {
    @Id
    @Column(name = "nr_fact",nullable = false)
    public int nrFact;
    @Column(name = "data_fact",nullable = false)
    public Date dataFact;
    @Column(name = "id_item",nullable = false)
    public int idItem;
    @Column(name="id_prod",nullable = false)
    public int idProd;
    public String um;
    public int cantitate;
    @Column(name = "pret_unitate",nullable = false)
    public float pretUnitate;
}
