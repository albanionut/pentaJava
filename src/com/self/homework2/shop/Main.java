package com.self.homework2.shop;

public class Main {
    public static void main(String[] args) {
    Service service = new Service();
    //Customers
    Customer client1 = new Customer(1,"Alban Manfroto", Customer.membership.GOLD);
    //Products
    Product book1 = new Book(1,"Cartea Misterelor",40,"Celine Dion");
    Product candy1 = new Candy(2,"Hubba bubba", 20 ,33);
    //Basket
    Basket basketClient1 = new Basket(0,client1);
    //Adding objects
    service.addToBasketBook((Book) book1,basketClient1);
    service.addToBasketCandy((Candy) candy1,basketClient1);
    service.applyDiscount(basketClient1,client1);
    client1.setMembarshipCustomer(Customer.membership.SILVER);
    service.applyDiscount(basketClient1,client1);

    }
}
