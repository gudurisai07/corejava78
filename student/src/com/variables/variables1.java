package com.variables;

public class variables1 {

    // Static variable
    static int count = 0;

    // Instance variables
    String name;
    int age;

    // Static block
    static {
        System.out.println("Static Block Executed");

        // count value ni 1 increase chestundi
        count++;
    }

    // Instance method
    void displayStudent() {

        // Student details print chestunnam
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        // count value ni 1 increase chestunnam
        count++;

        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {

        // Main method started
        System.out.println("Main Method Started");

        // First object create chestunnam
        variables1 s1 = new variables1();

        // First object ki values assign chestunnam
        s1.name = "Sai";
        s1.age = 22;

        // First object method call
        s1.displayStudent();

        // Second object create chestunnam
        variables1 s2 = new variables1();

        // Second object ki values assign chestunnam
        s2.name = "Rahul";
        s2.age = 23;

        // Second object method call
        s2.displayStudent();
    }
}