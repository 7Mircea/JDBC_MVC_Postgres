package com.example.jpa_hikari_jdbc.model;

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
    @Column(name = "invoice_nr",nullable = false)
    public int invoiceNr;
    @Column(name = "invoice_date",nullable = false)
    public Date invoice_date;
    @Column(name = "id_item",nullable = false)
    public int idItem;
    @Column(name="id_prod",nullable = false)
    public int idProd;
    public String unit;
    public int quantity;
    @Column(name = "unit_price",nullable = false)
    public float unit_price;
}
