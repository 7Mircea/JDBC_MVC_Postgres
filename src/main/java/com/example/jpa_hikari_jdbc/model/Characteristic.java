package com.example.jpa_hikari_jdbc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

@Getter
@Setter
@Entity
@IdClass(CharacteristicId.class)
public class Characteristic {
    @Id
    @Column(name = "id_prod", nullable = false, unique = true)
    public int idProd;
    @Id
    @Column(name = "id_characteristic", nullable = false, unique = true)
    public int idCharacteristic;
    @Column(nullable = false)
    public String name;
    @Column(nullable = false)
    public String value;
}

class CharacteristicId implements Serializable {
    @Column(name = "id_prod", nullable = false, unique = true)
    public int idProd;
    @Column(name = "id_characteristic", nullable = false, unique = true)
    public int idCharacteristic;
}
