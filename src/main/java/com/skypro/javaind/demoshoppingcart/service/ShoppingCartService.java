package com.skypro.javaind.demoshoppingcart.service;

import com.skypro.javaind.demoshoppingcart.model.Product;


import java.util.Set;

public interface ShoppingCartService {
    Set<Product> getProducts();

    void addProduct(Set<Integer> productIds);

}
