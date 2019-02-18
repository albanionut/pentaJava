package com.self.homework2.areaAndPerimeter;

import java.util.List;

public class Service {
    public double getBiggestArea(List<Shape> shapes) {
        double max = Integer.MIN_VALUE;
        for (Shape shape : shapes) {
            if (shape.getArea() > max) {
                max = shape.getArea();
            }
        }
        return max;
    }

    public double getBiggestPerimeter(List<Shape> shapes) {
        double max = Integer.MIN_VALUE;
        for (Shape shape : shapes) {
            if (shape.getPerimeter() > max) {
                max = shape.getPerimeter();
            }
        }
        return max;
    }
}
