package com.orderService.product.repository;


import com.orderService.product.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, UUID> {

    @Query("select * from Demo where name=?0")
    Product findByName(String name);
}
