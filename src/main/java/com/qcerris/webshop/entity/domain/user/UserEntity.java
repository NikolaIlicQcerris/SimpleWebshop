package com.qcerris.webshop.entity.domain.user;

import com.qcerris.webshop.entity.domain.BaseEntity;
import com.qcerris.webshop.entity.domain.paypalAccount.PaypalAccountEntity;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private PaypalAccountEntity paypalAccount;
}
