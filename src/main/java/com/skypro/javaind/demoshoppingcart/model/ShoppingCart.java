package com.skypro.javaind.demoshoppingcart.model;

import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.Set;
@SessionScope
public class ShoppingCart {
    private final Set<Product> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new HashSet<>();
    }
    public void addProduct(Product product){
        shoppingCart.add(product);
        for (Product product1 : shoppingCart) {
            System.out.print(product1.getProductId());

        }
    }

    public Set<Product> getShoppingCart() {
        return shoppingCart;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "shoppingCart=" + shoppingCart +
                '}';
    }
}
