package com.springcore.references;

public class ClassA {
    private int x;
    private ClassB b;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public ClassB getB() {
        return b;
    }

    public void setB(ClassB b) {
        this.b = b;
    }

    public ClassA(int x, ClassB b) {
        this.x = x;
        this.b = b;
    }

    public ClassA() {
        super();
    }

    @Override
    public String toString() {
        return "ClassA{" +
                "x=" + x +
                ", b=" + b +
                '}';
    }
}
