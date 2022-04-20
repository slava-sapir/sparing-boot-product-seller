package com.sha.sparingbootproductseller.model;


import lombok.Data;

import javax.persistence.*;

import java.time.LocalDateTime;

import static javax.persistence.GenerationType.*;

@Data
@Entity
@Table(name="product")
public class Product
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", nullable=false)
    private String name;

    @Column(name="price", nullable=false)
    private Double price;

    @Column(name="description", nullable=false)
    private String description;

    @Column(name="create_time", nullable=false)
    private LocalDateTime createTime;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
//    private Set<Purchase> purchaselist;
}
