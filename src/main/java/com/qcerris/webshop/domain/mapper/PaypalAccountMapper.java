package com.qcerris.webshop.domain.mapper;

import com.qcerris.webshop.domain.dto.PayPalAccountDTO;
import com.qcerris.webshop.domain.entity.PaypalAccountEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PaypalAccountMapper {

    PayPalAccountDTO paypalAccountToDTO(PaypalAccountEntity paypalAccount);
    List<PayPalAccountDTO> paypalAccountToDTO(List<PaypalAccountEntity> paypalAccountEntityList);

    PaypalAccountEntity paypalAccountDTOToEntity(PayPalAccountDTO payPalAccountDTO);
    List<PaypalAccountEntity> paypalAccountDTOToEntity(List<PayPalAccountDTO> payPalAccountDTOList);
}
