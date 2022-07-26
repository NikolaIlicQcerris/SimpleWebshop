package com.qcerris.webshop.domain.entity;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class Address {

    private String country;

    private String city;

    private Integer postalCode;

    private String street;

}
