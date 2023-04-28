package com.cydeo.mentor.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
public class Product extends BaseEntity {

    private String name;
    private double price;

    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;


}
