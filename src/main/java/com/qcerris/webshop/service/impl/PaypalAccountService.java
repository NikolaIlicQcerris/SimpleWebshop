package com.qcerris.webshop.service.impl;


import com.qcerris.webshop.domain.dto.PayPalAccountDTO;
import com.qcerris.webshop.domain.entity.PaypalAccountEntity;
import com.qcerris.webshop.domain.entity.UserEntity;
import com.qcerris.webshop.domain.mapper.PaypalAccountMapper;
import com.qcerris.webshop.repository.PaypalAccountRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PaypalAccountService {

    private final PaypalAccountRepository paypalAccountRepository;
    private final PaypalAccountMapper paypalAccountMapper;
    private final UserService userService;

    public PaypalAccountService(PaypalAccountRepository paypalAccountRepository,
                                PaypalAccountMapper paypalAccountMapper, UserService userService) {
        this.paypalAccountRepository = paypalAccountRepository;
        this.paypalAccountMapper = paypalAccountMapper;
        this.userService = userService;
    }


    public PayPalAccountDTO insertNewPayPalAccount(PayPalAccountDTO payPalAccountDTO) {

        if (payPalAccountDTO.getUser() == null) {
            findUser(payPalAccountDTO);
        }
        PaypalAccountEntity savedEntity = paypalAccountRepository.save(paypalAccountMapper.paypalAccountDTOToEntity(payPalAccountDTO));
        return paypalAccountMapper.paypalAccountToDTO(savedEntity);
    }

    private void findUser(PayPalAccountDTO payPalAccountDTO) {
        UserEntity userEntity = userService.fetchUserEntityById(payPalAccountDTO.getUserId());
        if (userEntity == null)
            return;
        payPalAccountDTO.setUser(userEntity);
    }

    public PayPalAccountDTO fetchPayPalAccountByUserId(Long userId) {
        PayPalAccountDTO dto = paypalAccountMapper.paypalAccountToDTO(paypalAccountRepository.findByUserId(userId));
        dto.setUserId(userId);
        return  dto;
    }

    public PayPalAccountDTO fetchPayPalAccountByAccountId(String accountId) {
        return paypalAccountMapper.paypalAccountToDTO(paypalAccountRepository.findByAccountId(accountId));
    }

    public List<PayPalAccountDTO> getAllPayPalAccounts() {
        return  paypalAccountMapper.paypalAccountToDTO(paypalAccountRepository.findAll());
    }

    @Modifying
    public PayPalAccountDTO updatePayPallAccount(PayPalAccountDTO payPalAccountDTO) {

        PaypalAccountEntity paypalAccount = paypalAccountRepository.findByUserId(payPalAccountDTO.getUserId());

        //paypalAccount.setAccountId(payPalAccountDTO.getAccountId());
        paypalAccount.setAddress(payPalAccountDTO.getAddress());
        paypalAccount.setBudget(payPalAccountDTO.getBudget());
        paypalAccount.setExpiresOn(payPalAccountDTO.getExpiresOn());

        return  paypalAccountMapper.paypalAccountToDTO(paypalAccountRepository.save(paypalAccount));

    }

    public String deletePayPalAccountByUserId(Long userId) {

        PaypalAccountEntity toBeDeleted = paypalAccountRepository.findByUserId(userId);
        paypalAccountRepository.delete(toBeDeleted);
        return "Successfully deleted account with userId: " + userId;
    }
}
