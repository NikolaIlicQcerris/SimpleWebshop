package com.qcerris.webshop.domain.mapper;

import com.qcerris.webshop.domain.dto.PayPalAccountDTO;
import com.qcerris.webshop.domain.entity.PaypalAccountEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaypalAccountMapper {

    PayPalAccountDTO paypalAccountToDTO(PaypalAccountEntity paypalAccount);
    PaypalAccountEntity paypalAccountDTOToEntity(PayPalAccountDTO payPalAccountDTO);
}
