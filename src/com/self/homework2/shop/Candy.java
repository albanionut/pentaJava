package com.self.homework2.shop;

public class Candy extends Product {
    private int quantity;

    public Candy(int id, String name, int price, int quantity) {
        super(id, name, price);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
