package com.example.jpa_hikari_jdbc.controller;

import com.example.jpa_hikari_jdbc.model.*;
import com.example.jpa_hikari_jdbc.repository.*;
import org.postgresql.core.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/itStore")
public class ITStoreController {

    @Autowired
    ProductsRepository productsRepository;
    @Autowired
    CharacteristicRepository characteristicRepository;
    @Autowired
    CustomerEmployeeSupplierRepository customerEmployeeSupplierRepository;
    @Autowired
    InvoiceRepository invoiceRepository;
    @Autowired
    ItemRepository itemRepository;


    @GetMapping("/products")
    public Iterable<Products> getAllProducts() {
        return productsRepository.findAll();
    }

    @GetMapping("/characteristics")
    public Iterable<Characteristic> getAllCharacteristic() {
        return characteristicRepository.findAll();
    }

    @GetMapping("/customer_employee_suppliers")
    public Iterable<CustomerEmployeeSupplier> getAllCustomerEmployeeSupplier() {
        return customerEmployeeSupplierRepository.findAll();
    }

    @GetMapping("/ces_by_type")
    public Iterable<CustomerEmployeeSupplier> getCustomerEmployeeSupplierByTypeCES(@RequestParam(name="type", required = true) char type) {
        return customerEmployeeSupplierRepository.findCustomerEmployeeSupplierByTypeCES(type);
    }

    @GetMapping("/invoices")
    public Iterable<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }

    @GetMapping("/items")
    public Iterable<Item> getAllItems() {
        return itemRepository.findAll();
    }

}
