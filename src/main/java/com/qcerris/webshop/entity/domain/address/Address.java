package com.qcerris.webshop.entity.domain.address;

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
