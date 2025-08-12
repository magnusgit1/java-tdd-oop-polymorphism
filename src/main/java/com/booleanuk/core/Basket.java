package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Item> items = new ArrayList<>();

    public void add(Item item) {
        this.items.add(item);
    }

    public int getTotal() {
        int total = 0;

        for (Item item : items){
            total += item.getPrice();
        }

        return total;
    }

    public boolean isInBasket(String name) {
        for (Item item : items){
            if (item.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
