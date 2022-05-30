package com.cts.sbjpa.sbjpa12.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="PRODUCT_TBL")
public class Product {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private double price;

    private int quantity;

}
