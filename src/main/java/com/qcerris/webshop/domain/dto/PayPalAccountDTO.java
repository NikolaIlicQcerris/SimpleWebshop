package com.qcerris.webshop.domain.dto;

import com.qcerris.webshop.domain.entity.Address;
import com.qcerris.webshop.domain.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class PayPalAccountDTO {

    private Long id;
    private String accountId;
    private LocalDate expiresOn;
    private Double budget;
    private Address address;
    private UserEntity user;

}
