package com.qcerris.webshop.domain.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "category")
public class CategoryEntity extends BaseEntity {

    private String name;

    @ManyToMany(mappedBy = "categories")
    @ToString.Exclude
    private Set<ProductEntity> products;


}
