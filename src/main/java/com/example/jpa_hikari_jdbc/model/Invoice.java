package com.example.jpa_hikari_jdbc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@IdClass(InvoiceId.class)
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
    @Id
    private int nr;
    @Id
    @Column(name="invoice_date", nullable = false)
    private LocalDate invoiceDate;
//    @Column(name="id_vendor",nullable = false)
//    private int idVendor;
    private char type;
    private float value;
    private float vat;
//    @Column(name="id_employee", nullable = false)
//    private int idEmployee;
//    @Column(name="id_buyer", nullable = false)
//    private int idBuyer;


    @ManyToOne
    @JoinColumn(name="id_vendor")
    private CustomerEmployeeSupplier vendor;
    @ManyToOne
    @JoinColumn(name="id_buyer")
    private CustomerEmployeeSupplier buyer;
    @ManyToOne
    @JoinColumn(name="id_employee")
    private CustomerEmployeeSupplier employee;


//    @OneToMany(mappedBy = "invoice")
//    private Set<Item> item;

//    @JoinColumns({
//            @JoinColumn(name="invoice_nr",referencedColumnName = "invoice_nr"),
//            @JoinColumn(name="invoice_date",referencedColumnName = "invoice_date")
//
//    })
}


