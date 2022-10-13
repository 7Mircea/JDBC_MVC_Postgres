package com.example.jpa_hikari_jdbc.repository;


import com.example.jpa_hikari_jdbc.model.Invoice;
import com.example.jpa_hikari_jdbc.model.InvoiceId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, InvoiceId> {
}
