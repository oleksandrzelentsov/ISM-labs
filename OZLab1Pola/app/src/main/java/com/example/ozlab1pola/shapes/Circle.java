package com.example.ozlab1pola.shapes;

public class Circle implements Shape {
    private double r;

    public Circle(double _r) {
        r = _r;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(r, 2);
    }
}
