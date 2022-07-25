package com.qcerris.webshop.entity.domain.dto;

import com.qcerris.webshop.entity.domain.address.Address;
import com.qcerris.webshop.entity.domain.user.UserEntity;
import lombok.Data;

import javax.persistence.*;
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
