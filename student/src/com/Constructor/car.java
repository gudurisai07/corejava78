
// Constructor chaining calling  mutiple loacal variables 

package com.Constructor;

 class car {
	String model;
	String colour;
	String enginetype;
	String brand;
	Double price;
	car(){
		this("nexon");
	}
	car(String model){
		this(model , "tata");
	}
	car(String model , String brand){
		this(model,brand,"red");
	}
	car(String model, String brand , String colour ){
		this(model,brand,colour,"Eletric");

	}
	car(String model , String brand , String colour , String enginetype ){
		this(model,brand,colour,enginetype,2000000.00);
	}
	
	car(String model, String brand , String colour , String enginetype , Double price){
	
		System.out.println("car model is : "+model);
		System.out.println("car brand is :"+brand);
		System.out.println("car colour is :"+colour);
		System.out.println("car enginetype is :"+enginetype);
		System.out.println("car price is : "+price);
		System.out.println("**************************************");
	}
public static void main(String [] args) {
		car c1 = new car();
		car c2 = new car("thar og","mahindra","red","off-road SUV",1032000.00);
		car c3 = new car("wagon R","maruti suzuki","blue","tall-boy hatchback",500000.00);
		car c4 = new car("punch","tata");
		car c5 =  new car("tiago");
		
	}

}
