package com.hdd.service;

import com.hdd.model.Category;
import com.hdd.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<Product> findAll(Pageable pageable);

    void save(Product product);

    void remove(Long e);

    Product findById(Long id);

    Iterable<Product> findAllByCategory(Category category);

    Page<Product> findAllByNameContaining(String name, Pageable pageable);
}
