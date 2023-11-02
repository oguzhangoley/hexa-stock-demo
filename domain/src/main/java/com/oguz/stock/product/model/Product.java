package com.oguz.stock.product.model;

import com.oguz.stock.category.model.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private long id;
    private Category category;
    private String ProductName;
    private double price;
    private int stock;
}
