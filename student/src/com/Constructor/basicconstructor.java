package com.Constructor;

public class basicconstructor {
	int rollno;
	String name;
	
	
	
	basicconstructor(int rollno , String name){
		this.rollno=rollno;
		this.name=name;
	}
	basicconstructor(basicconstructor b1){
		this.rollno=b1.rollno;
		this.name=b1.name;
	}
	void display() {
		System.out.println("roll number : "+rollno);
		System.out.println("name  is : "+name);
	}

	public static void main(String[] args) {
		basicconstructor b1 = new basicconstructor(101,"sai");
		basicconstructor b2 = new basicconstructor(b1);
		b1.display();
		System.out.println("_______________________");
		b2.display();
	}

}
