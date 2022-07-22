package com.qcerris.webshop.entity.domain.shoppingCart;

import com.qcerris.webshop.entity.domain.BaseEntity;
import com.qcerris.webshop.entity.domain.item.ItemEntity;
import com.qcerris.webshop.entity.domain.user.UserEntity;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "shopping_cart")
public class ShoppingCartEntity extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private ShoppingCartStatus status;

    @Setter(AccessLevel.NONE)
    @Column(name = "price")
    private Double price;

    @ManyToOne(fetch = FetchType.LAZY)
    private UserEntity user;

    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "shoppingCart",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<ItemEntity> items;

    public ShoppingCartEntity(String name,
                              ShoppingCartStatus status,
                              UserEntity user,
                              List<ItemEntity> items) {
        this.name = name;
        this.status = status;
        this.user = user;
        this.items = items;
        setPrice(items);


    }

    private void setPrice(List<ItemEntity> items) {
        if (items != null && !items.isEmpty()) {
            for (ItemEntity item : items) {
                if (item != null)
                    this.price += item.getPrice();
            }
        }

    }

    public void setItems(List<ItemEntity> items) {
        this.items = items;
        setPrice(items);
    }

    public void addItemToCart(ItemEntity item) {
        if (item != null){
            this.items.add(item);
            this.price+=item.getPrice();
        }
    }

    public void removeItemFromCart(ItemEntity item) {
        if (item != null){
            this.items.remove(item);
            this.price-=item.getPrice();
        }
    }
}
