package com.orderService.product.services.Impl;


import com.orderService.product.entity.Product;
import com.orderService.product.repository.ProductRepository;
import com.orderService.product.services.iProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements iProductService {

    @Autowired
    ProductRepository productRepo;

    public Product getProductOrder(Product product) {

        productRepo.save(product);
        Product fetchedOrderProduct = productRepo.findByName(product.getName());
        return fetchedOrderProduct;
    }
}
