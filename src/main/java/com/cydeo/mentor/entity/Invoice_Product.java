package com.cydeo.mentor.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Invoice_Product extends BaseEntity{

    private int quantity;
    private double profit;

/*  These fields will be used in STEP-3

    private Invoice invoice;
    private Product product;

 */
}
