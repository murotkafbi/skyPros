package com.skypro.javaind.demoshoppingcart.service;

import com.skypro.javaind.demoshoppingcart.model.Product;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Service
@SessionScope

public class ShoppingCartServiceImpl implements ShoppingCartService {

    private final Set<Product> shoppingCart;

    public ShoppingCartServiceImpl() {
        shoppingCart = new HashSet<>();
    }

    @Override
    public void addProduct(int productId) {
        shoppingCart.add(new Product(productId));
    }

    @Override
    public Set<Product> getProducts() {
        return Collections.unmodifiableSet(shoppingCart);
    }
}
