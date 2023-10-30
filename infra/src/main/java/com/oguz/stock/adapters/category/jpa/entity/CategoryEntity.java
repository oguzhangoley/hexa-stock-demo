package com.oguz.stock.adapters.category.jpa.entity;

import com.oguz.stock.common.entity.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;

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

}
