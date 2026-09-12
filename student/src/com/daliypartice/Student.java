package com.daliypartice;

public class Student {

    // Static block
    static {
        // Class load ayye time lo first execute avutundi
        System.out.println("Static Block Executed");
    }

    // Static method
    static void displayCourse() {
        // Static method lo course print chestunnam
        System.out.println("Course: Java Full Stack");
    }

    // Instance method
    void displayName() {
        // Instance method lo name print chestunnam
        System.out.println("Name: Sai");
    }

    public static void main(String[] args) {

        // Main method execution starts
        System.out.println("Main Method Started");

        // Calling static method using class name
        Student.displayCourse();

        // Creating object for Student class
        Student s = new Student();

        // Calling instance method using object
        s.displayName();
    }
}