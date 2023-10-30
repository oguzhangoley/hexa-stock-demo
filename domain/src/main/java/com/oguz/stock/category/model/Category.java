package com.oguz.stock.category.model;

import com.oguz.stock.common.model.Status;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    private long categoryId;
    private String categoryName;
    private String description;
    private Status status;
}
