package com.bootcamp.msproducts.repository;

import com.bootcamp.msproducts.model.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IProductRepository extends ReactiveCrudRepository<Product, Long> {

}
