package com.self.homework2.shop;

public class Basket {
    public double totalPrice;
    public Customer customerBasket;

    public Basket(double totalPrice, Customer customerBasket) {
        this.totalPrice = totalPrice;
        this.customerBasket = customerBasket;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Customer getCustomerBasket() {
        return customerBasket;
    }

    public void setCustomerBasket(Customer customerBasket) {
        this.customerBasket = customerBasket;
    }
}
