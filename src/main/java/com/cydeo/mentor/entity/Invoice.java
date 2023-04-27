package com.cydeo.mentor.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Invoice extends BaseEntity{

    private String invoiceNumber;
    private String invoiceType;

    @Column(columnDefinition = "DATE")
    private LocalDate invoiceDate;

/*  This field will be used in STEP-3
    private Client client;

 */
}
