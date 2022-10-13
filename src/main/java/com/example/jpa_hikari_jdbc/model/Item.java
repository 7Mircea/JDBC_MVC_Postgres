package com.example.jpa_hikari_jdbc.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@IdClass(ItemId.class)
public class Item {
//    @Id
//    @JoinColumn(name = "invoice_nr", nullable = false,insertable = false, updatable = false)
//    private int invoiceNr;
//    @Id
//    @JoinColumn(name = "invoice_date", nullable = false)
//    private Date invoice_date;

    @ManyToOne
    @Id
    @JoinColumns({
            @JoinColumn(name = "invoice_nr"),
            @JoinColumn(name = "invoice_date")
    })
    private Invoice invoice;

    @Id
    @Column(name = "id_item", nullable = false)
    private int idItem;
    @Column(name = "id_prod", nullable = false)
    private int idProd;
    private String unit;
    private int quantity;
    @Column(name = "unit_price", nullable = false)
    private float unit_price;

}
