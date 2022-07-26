package com.qcerris.webshop.domain.dto;

import lombok.Data;

@Data
public class AddressDTO {

    private String country;
    private String city;
    private Integer postalCode;
    private String street;
}
