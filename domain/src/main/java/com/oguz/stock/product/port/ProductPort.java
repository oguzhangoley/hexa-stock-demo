package com.oguz.stock.product.port;

import com.oguz.stock.product.model.Product;
import com.oguz.stock.product.usecase.ProductCreate;

import java.util.List;

public interface ProductPort {
    Product getProduct(long id);
    List<Product> getAll();
    Product createProduct(ProductCreate productCreate);

}
