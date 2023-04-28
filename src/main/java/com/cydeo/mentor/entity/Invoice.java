package com.cydeo.mentor.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Data
@NoArgsConstructor
public class Invoice extends BaseEntity{

    private String invoiceNumber;
    private String invoiceType;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime invoiceDate;

    @ManyToOne
    private Client client;


}
