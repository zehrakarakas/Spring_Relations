package com.cydeo.mentor.entity;

import lombok.*;
import org.hibernate.mapping.ToOne;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
public class Address extends BaseEntity{

    private String description;
    private String zipCode;

    @OneToOne
    private State state;


}
