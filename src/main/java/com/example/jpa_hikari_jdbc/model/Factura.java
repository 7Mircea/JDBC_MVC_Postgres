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
@IdClass(FacturaId.class)
public class Factura {
    @Id
    public int nr;
    @Id
    @Column(name="data_fact", nullable = false)
    public Date dataFact;
    @Column(name="id_emit",nullable = false)
    public int idEmit;
    public char tip;
    public float valoare;
    public float tva;
    @Column(name="id_angajat", nullable = false)
    public int idAngajat;
    @Column(name="id_benef", nullable = false)
    public int idBenef;
}

class FacturaId implements Serializable {
    public int nr;
    @Column(name="data_fact", nullable = false)
    public Date dataFact;
}
