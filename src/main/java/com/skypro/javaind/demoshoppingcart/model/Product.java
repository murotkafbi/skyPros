package com.skypro.javaind.demoshoppingcart.model;



import java.util.Objects;

public class Product {
    private final int productId;
    public Product(int productId) {
        this.productId = productId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }

    public int getProductId() {
        return productId;
    }
}
