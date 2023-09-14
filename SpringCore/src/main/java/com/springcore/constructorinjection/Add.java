package com.springcore.constructorinjection;

public class Add {
    private int a;
    private int b;

    public Add(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Constructor {int, int} called");
    }

    public Add(double a, double b) {
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("Constructor {double, double} called");
    }

    public void sum() {
        System.out.println("Number 1: " + this.a);
        System.out.println("Number 2: " + this.b);
        System.out.println("Sum is " + (this.a + this.b));
    }
}
