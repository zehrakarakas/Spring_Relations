package com.cydeo.mentor.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name="users")
public class User extends BaseEntity{

    private String firstname;
    private String lastname;
    private String password;
    private String email;

    /*  This field will be used in STEP-3
    private Role role;

     */

}
