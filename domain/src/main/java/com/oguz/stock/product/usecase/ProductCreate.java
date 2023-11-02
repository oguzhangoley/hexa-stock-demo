package com.oguz.stock.product.usecase;

import com.oguz.stock.category.model.Category;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductCreate {
    private long categoryId;
    private String ProductName;
    private double price;
    private int stock;
}
