package com.bootcamp.msproducts.repository;

import com.bootcamp.msproducts.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepository extends CrudRepository<Product, Long> {

}
