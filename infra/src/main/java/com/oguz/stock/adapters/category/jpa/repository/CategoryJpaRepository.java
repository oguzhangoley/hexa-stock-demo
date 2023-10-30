package com.oguz.stock.adapters.category.jpa.repository;

import com.oguz.stock.adapters.category.jpa.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryJpaRepository extends JpaRepository<CategoryEntity,Long> {
}
