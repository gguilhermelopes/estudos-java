package com.hibernate.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_PRODUCT")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq")
    @SequenceGenerator(name = "product_seq", sequenceName = "sq_product", initialValue = 1, allocationSize = 1)
    private Long id;
    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "PRICE", nullable = false)
    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
