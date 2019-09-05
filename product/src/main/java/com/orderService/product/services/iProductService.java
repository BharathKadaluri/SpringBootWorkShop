package com.orderService.product.services;


import com.orderService.product.entity.Product;

public interface iProductService {
    public Product getProductOrder(String name,String description);
}
