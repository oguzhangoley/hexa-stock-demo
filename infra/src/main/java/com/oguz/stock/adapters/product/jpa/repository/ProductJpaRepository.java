package com.oguz.stock.adapters.product.jpa.repository;

import com.oguz.stock.adapters.product.jpa.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository extends JpaRepository<ProductEntity,Long> {
}
