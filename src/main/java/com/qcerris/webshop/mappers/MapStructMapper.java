package com.qcerris.webshop.mappers;

import com.qcerris.webshop.entity.domain.address.Address;
import com.qcerris.webshop.entity.domain.category.CategoryEntity;
import com.qcerris.webshop.entity.domain.dto.*;
import com.qcerris.webshop.entity.domain.item.ItemEntity;
import com.qcerris.webshop.entity.domain.paypalAccount.PaypalAccountEntity;
import com.qcerris.webshop.entity.domain.product.ProductEntity;
import com.qcerris.webshop.entity.domain.shoppingCart.ShoppingCartEntity;
import com.qcerris.webshop.entity.domain.user.UserEntity;
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