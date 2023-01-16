package com.ddd_bootcamp.domain;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Cart {
    private final List<Item> items = new ArrayList<>();
    private final List<String> deletedItemNames = new ArrayList<>();

    public void add(Product product) {
        items.add(new Item(product, 1));
    }

    public void add(Product product, int quantity) {
        items.add(new Item(product, quantity));
    }

    public void remove(String productName) {
        var removed = items.removeIf(productInCart -> productInCart.getProduct().getName().equals(productName));
        if (removed) deletedItemNames.add(productName);
    }

    public List<Product> getProducts() {
        return items.stream()
                .map(Item::getProduct)
                .collect(toList());
    }

    public List<String> getDeletedItemNames() {
        return deletedItemNames;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                ", deletedItemNames=" + deletedItemNames +
                '}';
    }
}