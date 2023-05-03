package com.skypro.javaind.demoshoppingcart.service;

import com.skypro.javaind.demoshoppingcart.model.Product;
import com.skypro.javaind.demoshoppingcart.model.ShoppingCart;


import java.util.Set;

public interface ShoppingCartService {


    void addProduct(Set<Integer> productIds, ShoppingCart shoppingCart);

}
