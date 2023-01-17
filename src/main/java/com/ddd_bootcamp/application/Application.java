package com.ddd_bootcamp.application;

import com.ddd_bootcamp.domain.Cart;
import com.ddd_bootcamp.domain.Price;
import com.ddd_bootcamp.domain.Product;

import java.math.BigDecimal;

public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Product product = new Product("Apple Pencil", new Price(BigDecimal.TEN));
        cart.add(product);

        Product product2 = new Product("Apple Pencil", new Price(BigDecimal.TEN));


        Cart cart2 = new Cart();
        cart.add(new Product("Apple Pencil", new Price(BigDecimal.TEN)));


        cart.equals(cart2); // false

        System.out.println("Cart = " + cart);

        System.out.println("----------------------------------------");
        System.out.println(cart);
        System.out.println("----------------------------------------");

        cart.remove(product.getName());

        System.out.println("----------------------------------------");
        System.out.println(cart);
        System.out.println("----------------------------------------");

    }
}
