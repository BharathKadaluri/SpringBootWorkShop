package com.orderService.product.controller;

import com.zorder.orderservice.entity.Product;
import com.zorder.orderservice.services.Impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductServiceImpl productServiceImpl;

    @PostMapping("/v1/getOrder")
    private Product productOrder(@RequestBody Product product) {
        return productServiceImpl.getProductOrder(product);
    }
}
