package com.oguz.stock.category.usecase;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryCreate {
    private String categoryName;
    private String description;
}
