package com.qcerris.webshop.domain.mapper;

import com.qcerris.webshop.domain.dto.*;
import com.qcerris.webshop.domain.entity.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapStructMapper {

    UserDTO userEntityToDTO(UserEntity user);
    //AddressDTO addressToDTO(Address address);
    CategoryDTO categoryToDTO(CategoryEntity category);
    ItemDTO itemToDTO(ItemEntity item);
    PayPalAccountDTO paypalAccountToDTO(PaypalAccountEntity paypalAccount);
    ProductDTO productToDTO(ProductEntity product);
    ShoppingCartDTO shoppingCartToDTO(ShoppingCartEntity shoppingCart);


    UserEntity userDTOToEntity(UserDTO userDTO);
   // Address addressDTOToEntity(AddressDTO addressDTO);
    CategoryEntity categoryDTOToEntity(CategoryDTO categoryDTO);
    ItemEntity itemDTOToEntity(ItemDTO itemDTO);
    PaypalAccountEntity paypalAccountDTOToEntity(PayPalAccountDTO payPalAccountDTO);
    ProductEntity productDTOToEntity(ProductDTO productDTO);
    ShoppingCartEntity shoppingCartDTOToEntity(ShoppingCartDTO shoppingCartDTO);

}