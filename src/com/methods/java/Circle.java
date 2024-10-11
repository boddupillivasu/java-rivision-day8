package com.methods.java;

public class Circle {
    // instance variables

    double radius;
    String color;
    double circumference;
    double area;

    public double getArea() {

        return (area = 3.14 * radius * radius);


    }

    public double getCircumference() {

        return (circumference = 2 * 3.14 * radius);

    }

    public void display() {
        System.out.println("color:" + color);
        System.out.println("radius:" + radius);
        System.out.println("area:" + area);
        System.out.println("circumference:" + circumference);


    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color = "black";
        circle.radius = 25.4;
        circle.getArea();
        circle.getCircumference();
        circle.display();
    }
}
