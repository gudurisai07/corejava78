package com.Constructor;

class vehicle {

	String type;

	vehicle(String type) {

		this.type = type;

		System.out.println("Vehicle class calling");
	}
}

class Car extends vehicle {

	String brand;
	double price;

	Car(String type, String brand, double price) {
		super(type);

		this.brand = brand;

		this.price = price;

		System.out.println("Car constructor called");
	}
}

public class Electriccar extends Car {

	double batterycapacity;

	Electriccar(String type, String brand, double price, double batterycapacity) {

		super(type, brand, price);

		this.batterycapacity = batterycapacity;

		System.out.println("Electric Car constructor called");
	}

	void display() {

		System.out.println("Car Type           : " + type);
		System.out.println("Car Brand          : " + brand);
		System.out.println("Car Price          : " + price);
		System.out.println("Battery Capacity   : " + batterycapacity);
	}

	public static void main(String[] args) {

		Electriccar e = new Electriccar("Electric", "Tesla", 7500000, 100);

		e.display();
	}
}
