package com.springcore.references;

public class ClassB {
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ClassB(int y) {
        this.y = y;
    }

    public ClassB() {
        super();
    }

    @Override
    public String toString() {
        return "ClassB{" +
                "y=" + y +
                '}';
    }
}
