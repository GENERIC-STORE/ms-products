package com.bootcamp.msproducts.service;

import com.bootcamp.msproducts.model.Product;
import com.bootcamp.msproducts.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service()
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductRepository repository;

    @Override
    @Transactional(readOnly = true)
    public Flux<Product> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Mono<Product> findById(Long id) {
        return repository.findById(id);
    }
}
