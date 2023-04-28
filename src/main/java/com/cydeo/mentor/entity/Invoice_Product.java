package com.cydeo.mentor.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table (name="invoice_product")
public class Invoice_Product extends BaseEntity{

    private int quantity;
    private double profit;


    @OneToOne
    private Invoice invoice;
    @OneToOne
    private Product product;

}
