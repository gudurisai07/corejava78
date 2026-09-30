package com.Constructor;

class Address {

    String city;

    Address(String city) {
        this.city = city;
    }

    Address(Address a) {
        this.city = a.city;
    }
}

class Student {

    String name;
    Address address;

    Student(String name, Address address) {
        this.name = name;
        this.address =address;
    }

    // Deep copy constructor
    Student(Student s) {

        this.name = s.name;

        // Create a new Address object
        this.address = new Address(s.address);
       
        
    }
    void display() {
    	System.out.println("name is : "+name);
    	System.out.println("address is : "+address);
    }
    public static void main(String[] args) {

        Address a1 = new Address("Hyderabad");

        Student s1 = new Student("Sai", a1);

       
        Student s2 = new Student(s1);

        System.out.println("Original");
        s1.display();

        System.out.println("----------------");

        System.out.println("Copied");
        s2.display();
    }
}
