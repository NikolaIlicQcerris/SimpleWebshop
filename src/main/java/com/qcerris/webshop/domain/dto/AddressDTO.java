package com.qcerris.webshop.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class AddressDTO {

    private String country;
    private String city;
    private Integer postalCode;
    private String street;
}
