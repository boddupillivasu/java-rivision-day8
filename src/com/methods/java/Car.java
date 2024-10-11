package com.methods.java;

public class Car {

    // instance variables

    String brand;
    String model;
    int year;
    double price;


    public Car() {
    }

    public void displayInfo(){
        System.out.println("car brand:"+brand);
        System.out.println("car model:"+model);
        System.out.println("car year:"+year);
        System.out.println("car price:"+price);


    }

    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.brand ="volvo";
        myCar.year =2016;
        myCar.price =4000000d;
        myCar.model="7 seeter black";
        myCar.displayInfo();
    }
}
