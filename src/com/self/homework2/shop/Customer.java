package com.self.homework2.shop;

public class Customer {

    private membership membarshipCustomer;
    private int id;
    private String name;

    enum membership{
        GOLD,SILVER,NO_MEMBERSHIP;
    }

    public Customer(int id, String name, membership membershipCustomer) {
        this.id = id;
        this.name = name;
        this.membarshipCustomer = membershipCustomer;
    }

    public membership getMembarshipCustomer() {
        return membarshipCustomer;
    }

    public void setMembarshipCustomer(membership membarshipCustomer) {
        this.membarshipCustomer = membarshipCustomer;
        System.out.println("Your new membership is "+getMembarshipCustomer());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
