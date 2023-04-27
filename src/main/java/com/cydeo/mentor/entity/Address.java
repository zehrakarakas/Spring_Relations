package com.cydeo.mentor.entity;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address extends BaseEntity{

    private String description;
    private String zipCode;

    /*  This field will be used in STEP-3
    private State state;

     */
}
