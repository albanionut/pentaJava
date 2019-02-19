package com.self.homework2.shop;

import java.util.List;

public class Service {

    public void  addToBasketBook(Book  book, Basket basket){
        basket.totalPrice=basket.totalPrice+book.getPrice();
        System.out.println("You added in the basket "+book.getName()+" and your total price is "+ basket.totalPrice+".");
    }
    public void addToBasketCandy(Candy candy, Basket basket ){
        basket.totalPrice=basket.totalPrice+(candy.getPrice()*candy.getQuantity());
        System.out.println("You added in the basket "+candy.getName()+" and your total price is "+ basket.totalPrice+".");
    }

    public void applyDiscount(Basket basket , Customer customer) {
        System.out.println("You have to pay without discount " + basket.getTotalPrice());
        switch (customer.getMembarshipCustomer()) {
            case GOLD:
                basket.setTotalPrice(basket.getTotalPrice() - ((double)20 / 100 * basket.getTotalPrice()));
                System.out.println("Because you have Gold Membership you have 20% discount and the total price is "+basket.getTotalPrice() );
                break;
            case SILVER:
                basket.setTotalPrice(basket.getTotalPrice() - ((double)10 / 100 * basket.getTotalPrice()));
                System.out.println("Because you have Gold Membership you have 10% discount and the total price is "+basket.getTotalPrice() );
                break;
            case NO_MEMBERSHIP:
                System.out.println("Because you dont have a membership you dont have  discount");
                System.out.println("Total price is " + basket.getTotalPrice());
                break;
            default:
                System.out.println("Invalid membership");
                break;
        }
    }

}
