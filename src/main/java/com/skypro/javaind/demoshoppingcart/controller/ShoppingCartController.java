package com.skypro.javaind.demoshoppingcart.controller;

import com.skypro.javaind.demoshoppingcart.model.Product;
import com.skypro.javaind.demoshoppingcart.model.ShoppingCart;
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
    public void addProductIds(@RequestParam("productId") Set<Integer> productIds, ShoppingCart shoppingCart) {
            shoppingCartService.addProduct(productIds, shoppingCart);
    }

    @GetMapping("/get")
    public Set<Product> getProductIds(ShoppingCart shoppingCart) {
        return shoppingCart.getShoppingCart();
    }

}
