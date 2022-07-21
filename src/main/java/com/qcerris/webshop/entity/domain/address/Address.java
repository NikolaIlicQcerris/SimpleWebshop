package com.qcerris.webshop.entity.domain.address;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String country;

    private String city;

    private Integer postalCode;

    private String street;

}
