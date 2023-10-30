package com.oguz.stock.adapters.category.rest.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryCreateRequest {
    private String categoryName;
    private String description;
}
