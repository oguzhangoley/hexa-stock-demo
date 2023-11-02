package com.oguz.stock.adapters.product.jpa;

import com.oguz.stock.adapters.category.jpa.entity.CategoryEntity;
import com.oguz.stock.adapters.category.jpa.repository.CategoryJpaRepository;
import com.oguz.stock.adapters.product.jpa.entity.ProductEntity;
import com.oguz.stock.adapters.product.jpa.repository.ProductJpaRepository;
import com.oguz.stock.product.model.Product;
import com.oguz.stock.product.port.ProductPort;
import com.oguz.stock.product.usecase.ProductCreate;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductDataAdapter implements ProductPort {
    private final ProductJpaRepository repository;
    private final CategoryJpaRepository categoryJpaRepository;
    private final ModelMapper mapper;
    @Override
    public Product getProduct(long id) {
        return repository.findById(id).map(entity -> mapper.map(entity,Product.class)).orElseThrow();
    }

    @Override
    public List<Product> getAll() {
        return repository.findAll().stream().map(entity -> mapper.map(entity,Product.class)).toList();
    }

    @Override
    public Product createProduct(ProductCreate productCreate) {
        CategoryEntity category = categoryJpaRepository.findById(productCreate.getCategoryId()).orElseThrow();
        ProductEntity entity = ProductEntity.builder()
                .ProductName(productCreate.getProductName())
                .price(productCreate.getPrice())
                .stock(productCreate.getStock())
                .category(category)
                .build();
        ProductEntity savedEntity =  repository.save(entity);
        return mapper.map(savedEntity,Product.class);
    }
}
