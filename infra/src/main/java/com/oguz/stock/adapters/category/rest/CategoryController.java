package com.oguz.stock.adapters.category.rest;

import com.oguz.stock.adapters.category.jpa.CategoryDataAdapter;
import com.oguz.stock.adapters.category.rest.dto.CategoryCreateRequest;
import com.oguz.stock.category.model.Category;
import com.oguz.stock.category.usecase.CategoryCreate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    private final CategoryDataAdapter categoryDataAdapter;
    @GetMapping
    public ResponseEntity<List<Category>> getList(){
       List<Category> categories =  categoryDataAdapter.getCategories();
       return ResponseEntity.ok(categories);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@RequestParam long id){
        Category category =  categoryDataAdapter.getCategory(id);
        return ResponseEntity.ok(category);
    }
    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody CategoryCreate categoryCreate){
        Category category =  categoryDataAdapter.create(categoryCreate);
        return new ResponseEntity<>(category, HttpStatus.CREATED);
    }


}
