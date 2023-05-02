package com.skypro.javaind.demoshoppingcart.controller;

import com.skypro.javaind.demoshoppingcart.model.Product;

import com.skypro.javaind.demoshoppingcart.service.ShoppingCartService;
import org.springframework.web.bind.annotation.*;


import java.util.Set;

@RestController

@RequestMapping("/order")
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/add")
    public void addProductIds(@RequestParam("productId") Set<Integer> productIds) {
        for (Integer productId : productIds) {
            shoppingCartService.addProduct(productId);
        }
    }

    @GetMapping("/get")
    public Set<Product> getProductIds() {
        return shoppingCartService.getProducts();
    }

}
