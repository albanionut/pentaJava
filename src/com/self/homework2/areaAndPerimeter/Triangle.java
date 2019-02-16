package com.self.homework2.areaAndPerimeter;

public class Triangle extends Shape {
    private double side;
    private  double base;
    private double secondSide;
    private double height;

    public Triangle(double side, double base, double secondSide, double height) {
        this.side = side;
        this.base = base;
        this.secondSide = secondSide;
        this.height = height;
    }

    public double getArea(){
        area= (base * height)/2;
        return area;
    }

    public double getPerimeter(){
        perimeter= side + secondSide + base;
        return perimeter;
    }
}
