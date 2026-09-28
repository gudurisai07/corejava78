package com.Constructor;

class bike {

    // Instance variables
    int brand;
    String model;
    double price;

    // Parent class constructor
    bike() {
    	super();
        System.out.println("Vehicle class constructor called");
    }
}

 class Vehicle extends bike {

    // Child class constructor
    Vehicle() {
        // Calling parent constructor
        super();

        System.out.println("Bike class constructor called");
    }

    // Instance method
    void bikeInfo() {
        System.out.println("Brand  : " + brand);
        System.out.println("Model  : " + model);
        System.out.println("Price  : " + price);
    }

    // Main method
    public static void main(String[] args) {

        System.out.println("Main method started");

        // Creating Bike object
        Vehicle b1 = new Vehicle();

        // Assigning values using object reference
        b1.brand = 101;
        b1.model = "Royal Enfield";
        b1.price = 250000;

        // Calling instance method
        b1.bikeInfo();

        System.out.println("Main method ended");
    }
}