package com.example.jpa_hikari_jdbc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(CaracteristicaId.class)
public class Caracteristica {
    @Id
    @Column(name = "id_prod", nullable = false, unique = true)
    public int idProd;
    @Id
    @Column(name = "id_caracteristica", nullable = false, unique = true)
    public int idCaracteristica;
    @Column(nullable = false)
    public String denumire;
    @Column(nullable = false)
    public String valoare;
}

class CaracteristicaId implements Serializable {
    @Column(name = "id_prod", nullable = false, unique = true)
    public int idProd;
    @Column(name = "id_caracteristica", nullable = false, unique = true)
    public int idCaracteristica;
}
