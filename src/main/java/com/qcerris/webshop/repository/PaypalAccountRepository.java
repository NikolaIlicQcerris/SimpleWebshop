package com.qcerris.webshop.repository;

import com.qcerris.webshop.domain.entity.PaypalAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaypalAccountRepository extends JpaRepository<PaypalAccountEntity, Long> {

    PaypalAccountEntity findByUserId(Long userId);

    PaypalAccountEntity findByAccountId(String accountId);


}
