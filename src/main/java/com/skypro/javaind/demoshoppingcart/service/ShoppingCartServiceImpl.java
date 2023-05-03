package com.skypro.javaind.demoshoppingcart.service;
import com.skypro.javaind.demoshoppingcart.model.Product;
import com.skypro.javaind.demoshoppingcart.model.ShoppingCart;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Service


public class ShoppingCartServiceImpl implements ShoppingCartService {


    @Override
    public void addProduct(Set<Integer> productIds, ShoppingCart shoppingCart) {
        for (Integer productId : productIds) {
            shoppingCart.addProduct(new Product(productId));
        }
    }


}
