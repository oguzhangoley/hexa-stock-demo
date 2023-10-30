package com.oguz.stock.common.mapper;

import com.oguz.stock.adapters.category.jpa.entity.CategoryEntity;
import com.oguz.stock.category.model.Category;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

@RequiredArgsConstructor
public class CategoryMapper {
    private ModelMapper modelMapper;

    public CategoryEntity DtoToEntity(Category category) {

        return null;
    }

    public Category EntityToDto(CategoryEntity categoryEntity) {
        return null;
    }
}
