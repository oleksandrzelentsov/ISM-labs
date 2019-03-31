package com.example.ozlab1pola.shapes;

public class Triangle implements Shape {
    private double a, b, c;

    public Triangle(double _a, double _b, double _c) {
        a = _a;
        b = _b;
        c = _c;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {
        double p = perimeter() / 2.0;
        double w = (p - a) * (p - b) * (p - c) * p;
        return Math.sqrt(w);
    }
}
