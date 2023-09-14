package com.springcore.lifecycle;

public class Food {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting val");
        this.price = price;
    }

    public Food(double price) {
        this.price = price;
    }

    public Food() {
        super();
    }

    @Override
    public String toString() {
        return "Food{" +
                "price=" + price +
                '}';
    }

    public void init() {
        System.out.println("Bean Initialized");
    }

    public void destroy() {
        System.out.println("Bean Destroyed");
    }
}
