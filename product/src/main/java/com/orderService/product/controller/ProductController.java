package com.orderService.product.controller;

import com.orderService.product.entity.Product;
import com.orderService.product.services.Impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductServiceImpl productServiceImpl;

    @GetMapping("/v1/order")
    private Product productOrder(@RequestParam("name") String name, @RequestParam("description") String description) {
        return productServiceImpl.getProductOrder(name, description);
    }
}
