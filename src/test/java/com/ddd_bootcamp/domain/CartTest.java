package com.ddd_bootcamp.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void shouldAddProductToCart() {
        Cart cart = new Cart();
        Product product = new Product("Some test product", new Price(BigDecimal.TEN));
        cart.add(product);

        List<Product> actual = cart.getProducts();

        assertEquals(1, actual.size());
        assertEquals("Some test product", actual.get(0).getName());
    }

    @Test
    void shouldRemoveProductFromCart() {
        Cart cart = new Cart();
        Product applePencil = new Product("Apple Pencil", new Price(BigDecimal.TEN));
        var anyRandomQuantity = 20;
        cart.add(applePencil, anyRandomQuantity);

        assertEquals(1, cart.getProducts().size());

        cart.remove(applePencil.getName());

        assertEquals(0, cart.getProducts().size());

        assertTrue(cart.getDeletedItemNames().contains(applePencil.getName()));
    }

    @Test
    void cartsAreNotTheSameAndYouKnowIt() {
        Cart cart1 = new Cart();
        Cart cart2 = new Cart();
        cart1.add(new Product("Something", new Price(BigDecimal.TEN)), 5);
        cart2.add(new Product("Something", new Price(BigDecimal.TEN)), 5);
        assertFalse(cart1.equals(cart2));
    }
}