package com.cydeo.mentor.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.mapping.ToOne;

import javax.persistence.*;

import java.util.List;


@Data
@Entity
@NoArgsConstructor
public class Client extends BaseEntity {

    private String clientName;
    private String phone;
    private String email;

    @ManyToOne
    private Address address;


}
