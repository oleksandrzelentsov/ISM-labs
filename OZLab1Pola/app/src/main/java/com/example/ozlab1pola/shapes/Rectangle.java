package com.example.ozlab1pola.shapes;

public class Rectangle implements Shape {
    private double a, b;

    public Rectangle(double _a, double _b) {
        a = _a;
        b = _b;
    }

    @Override
    public double perimeter() {
        return (a + b) * 2;
    }

    @Override
    public double area() {
        return a * b;
    }
}
