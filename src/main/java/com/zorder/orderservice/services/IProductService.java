package com.zorder.orderservice.services;


import com.zorder.orderservice.dto.ProductDetails;
import com.zorder.orderservice.entities.ProductModel;
import org.springframework.stereotype.Service;


public interface IProductService {
    ProductModel saveProduct(ProductDetails productDetails);
}
