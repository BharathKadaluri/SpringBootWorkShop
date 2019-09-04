package com.zorder.orderservice.controller;


import com.zorder.orderservice.dto.ProductDetails;
import com.zorder.orderservice.entities.ProductModel;
import com.zorder.orderservice.repo.ProductRepo;
import com.zorder.orderservice.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    IProductService productService;


    @PostMapping("/product")
    @ResponseStatus(HttpStatus.CREATED)
    public ProductModel addProduct(@RequestBody ProductDetails productDetails){

        return productService.saveProduct(productDetails);
    }
}
