package com.bootcamp.msproducts.service;

import com.bootcamp.msproducts.model.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IProductService {

    public Flux<Product> findAll();

    public Mono<Product> findById(Long id);

    /*public Mono<Product> save(CreateProductDto o);

    public Mono<Product> addAccount(String document, CreateEnterpriseClientAccountDto o);

    public Mono<Product> updateAccount(String document, UpdateEnterpriseClientAccountDto o);

    public Mono<Product> deleteAccount(String document, String accountId);

    public Mono<Product> update(UpdateEnterpriseClientDto o);

    public Mono<Product> delete(DeleteEnterpriseClientDto o);*/

}
