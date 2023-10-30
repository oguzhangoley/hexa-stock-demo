package com.oguz.stock.category.port;

import com.oguz.stock.category.model.Category;
import com.oguz.stock.category.usecase.CategoryCreate;

import java.util.List;

public interface CategoryPort {
    Category getCategory(long categoryId);
    List<Category> getCategories();
    Category update(Category category);
    void changeStatus(long categoryId);
    Category create(CategoryCreate categoryCreate);
}
