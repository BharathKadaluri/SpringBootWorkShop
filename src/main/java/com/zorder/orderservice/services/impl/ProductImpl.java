package com.zorder.orderservice.services.impl;

import com.zorder.orderservice.dto.ProductDetails;
import com.zorder.orderservice.entities.ProductModel;
import com.zorder.orderservice.repo.ProductRepo;
import com.zorder.orderservice.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.Column;


@Service
public class ProductImpl implements IProductService {

    @Autowired
    ProductRepo productRepo;


    @Override
    public ProductModel saveProduct(ProductDetails productDetails) {
        ProductModel model = new ProductModel();
        model.setName(productDetails.getName());
        model.setDescription(productDetails.getDescription());

        productRepo.save(model);
        return model;
    }
}
