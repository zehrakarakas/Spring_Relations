package com.cydeo.mentor.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.mapping.ToOne;

import javax.persistence.Entity;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;


@Data
@Entity
@NoArgsConstructor
public class Client extends BaseEntity {

    private String clientName;
    private String phone;
    private String email;

    @OneToOne
    private Address address;


}
