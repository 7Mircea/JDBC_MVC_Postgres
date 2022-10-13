package com.example.jpa_hikari_jdbc.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

public class ItemId implements Serializable {
    private Invoice invoice;
    private int idItem;
}
