package com.Constructor;

class animal{
	String breed;
	int age;
	
	
	animal(){
		System.out.println("animal constructor calling ");	
	}
	animal(String breed , int age){
		this.breed=breed;
		this.age=age;
		System.out.println("animal  parametrized constructor calling  ");
		
	}

void doginfo() {

	System.out.println("dog breed is : "+breed);
	System.out.println("dog age is : "+age);

}
	
}
public class dog extends animal  {
	
	dog(){
		
		System.out.println("dog constructor is calling ");
	}
	dog(String breed , int age){
		super(breed ,age);
		super.breed=breed;
		super.age=age;
		System.out.println("dog constructor top  parent class calling ");
		
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		dog d1 = new dog();
		d1.breed="kuka";
		d1.age=4;
		d1.doginfo();
		dog d2 = new dog();
		d2.doginfo();
		System.out.println("main method ended ");
	}

}
