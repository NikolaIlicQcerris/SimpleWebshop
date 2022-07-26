package com.qcerris.webshop.domain.dto;

import com.qcerris.webshop.domain.entity.Address;
import com.qcerris.webshop.domain.entity.UserEntity;
import lombok.Data;

import java.time.LocalDate;

@Data
public class PayPalAccountDTO {

    private Long id;
    private String accountId;
    private LocalDate expiresOn;
    private Double budget;
    private Address address;
    private UserEntity user;

}
