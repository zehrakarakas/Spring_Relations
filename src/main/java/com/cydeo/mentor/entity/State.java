package com.cydeo.mentor.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@Entity
public class State extends BaseEntity {
    private String stateCode;
    private String stateName;
}
