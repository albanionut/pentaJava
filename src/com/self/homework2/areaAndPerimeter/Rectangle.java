package com.self.homework2.areaAndPerimeter;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        area = length * width;
        return area;
    }

    public double getPerimeter() {
        perimeter = 2 * (length * width);
        return perimeter;
    }
}
