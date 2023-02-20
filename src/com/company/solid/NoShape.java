package com.company.solid;

public class NoShape implements Shape{
    @Override
    // Liskov Substitution rule broken
    public double area() {
        throw new IllegalStateException();
    }
}
