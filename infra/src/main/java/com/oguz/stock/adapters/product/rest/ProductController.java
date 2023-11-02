package com.oguz.stock.adapters.product.rest;

import com.oguz.stock.adapters.product.jpa.ProductDataAdapter;
import com.oguz.stock.category.model.Category;
import com.oguz.stock.category.usecase.CategoryCreate;
import com.oguz.stock.product.model.Product;
import com.oguz.stock.product.usecase.ProductCreate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductDataAdapter productDataAdapter;

    @GetMapping
    public ResponseEntity<List<Product>> getList(){
        List<Product> products =  productDataAdapter.getAll();
        return ResponseEntity.ok(products);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> getCategoryById(@RequestParam long id){
        Product product = productDataAdapter.getProduct(id);
        return ResponseEntity.ok(product);
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody ProductCreate productCreate){
        Product product =  productDataAdapter.createProduct(productCreate);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

}
