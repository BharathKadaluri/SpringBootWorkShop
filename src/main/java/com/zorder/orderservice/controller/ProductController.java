package com.zorder.orderservice.controller;


import com.zorder.orderservice.dto.ProductDetails;
import com.zorder.orderservice.entities.ProductModel;
import com.zorder.orderservice.repo.ProductRepo;
import com.zorder.orderservice.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    IProductService productService;


    @PostMapping("/product")
    public ResponseEntity<ProductModel> addProduct(@RequestBody ProductDetails productDetails){

        return new ResponseEntity<ProductModel>(productService.saveinfo(productDetails), HttpStatus.CREATED);
    }
}
