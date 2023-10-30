package com.oguz.stock.common.mapper;

import com.oguz.stock.adapters.category.jpa.entity.CategoryEntity;
import com.oguz.stock.category.model.Category;
import com.oguz.stock.common.entity.AbstractEntity;

public interface IBaseMapper<R extends AbstractEntity,T> {
    public R DtoToEntity(T dto);
    public T EntityToDto(R categoryEntity);
}
