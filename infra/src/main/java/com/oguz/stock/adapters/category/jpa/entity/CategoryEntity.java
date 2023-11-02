package com.oguz.stock.adapters.category.jpa.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.oguz.stock.adapters.product.jpa.entity.ProductEntity;
import com.oguz.stock.common.entity.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "categories")

public class CategoryEntity extends AbstractEntity {

    private String categoryName;
    private String description;

    @OneToMany(mappedBy = "category")
    @JsonManagedReference
    private List<ProductEntity> products;

}
