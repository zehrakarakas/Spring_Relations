package com.cydeo.mentor.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Client extends BaseEntity {

    private String clientName;
    private String phone;
    private String email;

/*  This field will be used in STEP-3
    private Address address;

 */
}
