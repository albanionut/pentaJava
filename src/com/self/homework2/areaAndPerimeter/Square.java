package com.self.homework2.areaAndPerimeter;

public class Square extends Shape {
    private double side;

    public Square(int side) {
        this.side = side;
    }

    public double getArea() {
        area = side * side;
        return area;
    }

    public double getPerimeter() {
        perimeter = 4 * side;
        return perimeter;
    }
}
