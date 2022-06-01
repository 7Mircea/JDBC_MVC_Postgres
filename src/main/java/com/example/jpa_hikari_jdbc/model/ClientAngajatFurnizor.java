package com.example.jpa_hikari_jdbc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity(name="Client_angajat_furnizor")
public class ClientAngajatFurnizor {
    @Id
    @Column(name = "ID_caf",nullable = false,unique = true)
    public int idCaf;
    @Column(nullable = false)
    public String nume;
    @Column(length = 10)
    public String cif;
    @Column(nullable = false)
    public char tipCaf;
    public String adresa;
    @Column(nullable = false)
    public String iban;
    public String cnp;
}
