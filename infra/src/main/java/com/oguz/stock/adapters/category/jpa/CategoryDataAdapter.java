package com.oguz.stock.adapters.category.jpa;

import com.oguz.stock.adapters.category.jpa.entity.CategoryEntity;
import com.oguz.stock.adapters.category.jpa.repository.CategoryJpaRepository;
import com.oguz.stock.category.model.Category;
import com.oguz.stock.category.port.CategoryPort;
import com.oguz.stock.category.usecase.CategoryCreate;
import com.oguz.stock.common.model.Status;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryDataAdapter implements CategoryPort {
    private final CategoryJpaRepository categoryJpaRepository;
    private final ModelMapper modelMapper;

    @Override
    public Category getCategory(long categoryId) {
        return categoryJpaRepository.findById(categoryId).map(categoryEntity -> modelMapper.map(categoryEntity, Category.class)).orElseThrow();
    }

    @Override
    public List<Category> getCategories() {
        return categoryJpaRepository.findAll().stream().map(categoryEntity -> modelMapper.map(categoryEntity, Category.class)).toList();
    }

    @Override
    public Category update(Category category) {
        CategoryEntity categoryEntity = modelMapper.map(category, CategoryEntity.class);
        CategoryEntity savedCategory = categoryJpaRepository.save(categoryEntity);
        return modelMapper.map(savedCategory, Category.class);
    }

    @Override
    public void changeStatus(long categoryId) {
        CategoryEntity categoryEntity = categoryJpaRepository.findById(categoryId).orElseThrow();
        categoryEntity.setStatus(Status.PASSIVE);
    }

    @Override
    public Category create(CategoryCreate categoryCreate) {
        CategoryEntity category = new  CategoryEntity();
        category.setCategoryName(categoryCreate.getCategoryName());
        category.setDescription(categoryCreate.getDescription());
        category.setStatus(Status.ACTIVE);
        CategoryEntity savedEntity = categoryJpaRepository.save(category);
        return modelMapper.map(savedEntity, Category.class);
    }
}
