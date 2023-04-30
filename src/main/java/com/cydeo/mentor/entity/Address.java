package com.cydeo.mentor.entity;

import lombok.*;
import org.hibernate.mapping.ToOne;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
public class Address extends BaseEntity{

    private String description;
    private String zipCode;

    @ManyToOne
    private State state;


}
