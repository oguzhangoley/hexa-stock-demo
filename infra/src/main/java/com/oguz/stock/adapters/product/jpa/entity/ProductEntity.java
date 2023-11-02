package com.oguz.stock.adapters.product.jpa.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.oguz.stock.adapters.category.jpa.entity.CategoryEntity;
import com.oguz.stock.common.entity.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "products")
public class ProductEntity extends AbstractEntity {
    private String ProductName;
    private double price;
    private int stock;
    @ManyToOne
    @JoinColumn(name = "categoryId", referencedColumnName = "id")
    @JsonBackReference
    private CategoryEntity category;
}
