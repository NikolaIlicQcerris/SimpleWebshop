package com.qcerris.webshop.entity.domain.product;

import com.qcerris.webshop.entity.domain.BaseEntity;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "product")
public class ProductEntity extends BaseEntity {

    @Column(name = "price")
    private Double price;

    @Column(name = "quantity")
    private Integer quantity;


}
