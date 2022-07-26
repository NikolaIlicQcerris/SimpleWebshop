package com.qcerris.webshop.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "paypal_account")
public class PaypalAccountEntity extends BaseEntity {

    @Column(name = "account_id")
    private String accountId;

    @Column(name = "expires_on")
    private LocalDate expiresOn;

    @Column(name = "budget")
    private Double budget;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "country", column = @Column(name = "country")),
            @AttributeOverride(name = "city", column = @Column(name = "city")),
            @AttributeOverride(name = "postalCode", column = @Column(name = "postal_code")),
            @AttributeOverride(name = "street", column = @Column(name = "street"))
    })
    private Address address;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @ToString.Exclude
    @JsonIgnore
    private UserEntity user;
}
