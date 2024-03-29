package com.thiagodd.pedidocertoapi.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Address {

    @Column(name = "address_cep")
    private String cep;

    @Column(name = "address_public_place")
    private String publicPlace;

    @Column(name = "address_number")
    private String number;

    @Column(name = "address_complement")
    private String complement;

    @Column(name = "address_neighborhood")
    private String neighborhood;
}
