package com.example.jpa_hikari_jdbc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
@Entity
@IdClass(InvoiceId.class)
public class Invoice {
    @Id
    public int nr;
    @Id
    @Column(name="invoice_date", nullable = false)
    public Date invoiceDate;
    @Column(name="id_vendor",nullable = false)
    public int idVendor;
    public char type;
    public float value;
    public float vat;
    @Column(name="id_employee", nullable = false)
    public int idEmployee;
    @Column(name="id_buyer", nullable = false)
    public int idBuyer;
}

class InvoiceId implements Serializable {
    public int nr;
    @Column(name="invoice_date", nullable = false)
    public Date invoiceDate;
}
