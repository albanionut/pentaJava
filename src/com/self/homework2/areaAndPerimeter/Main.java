package com.self.homework2.areaAndPerimeter;

import java.util.ArrayList;
import java.util.List;

public class Main {
     /*
        Create an application that knows how to calculate the perimeter and area for common shapes(circle, square, rectangle, triangle)
     To test it: create few objects of each type and print to the console informations about the object that has the biggest area
     */

    public static void main(String[] args) {
        Shape circle = new Circle(3);
        System.out.println("//Circle");
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Shape circle1= new Circle(4);
        System.out.println("//Circle1");
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

        Shape circle2 = new Circle(5);
        System.out.println("//Circle2");
        System.out.println(circle2.getArea());
        System.out.println(circle2.getPerimeter());

        Shape square = new Square(100);
        System.out.println("//Square");
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        Service service = new Service();
//        List<MyType> myList = new ArrayList<MyType>();
        List<Shape> shapes=new ArrayList<Shape>();
        shapes.add(circle);
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(square);

        System.out.println();
        System.out.println("Biggest Area: ");
        System.out.println(service.getBiggestArea(shapes));
        System.out.println(service.getBiggestArea(shapes));
        System.out.println("Biggest Perimeter: ");
        System.out.println(service.getBiggestPerimeter(shapes));

    }
}
