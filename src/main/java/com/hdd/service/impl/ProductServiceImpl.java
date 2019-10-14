package com.hdd.service.impl;

import com.hdd.model.Category;
import com.hdd.model.Product;
import com.hdd.repository.ProductRepository;
import com.hdd.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product findById(Long id) {
        return productRepository.findOne(id);
    }

    @Override
    public Iterable<Product> findAllByCategory(Category category) {
        return productRepository.findAllByCategory(category);
    }

    @Override
    public Page<Product> findAllByNameContaining(String name, Pageable pageable) {
        return productRepository.findAllByNameContaining(name,pageable);
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void remove(Long e) {
        productRepository.delete(e);
    }
}