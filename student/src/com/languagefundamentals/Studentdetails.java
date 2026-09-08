package com.languagefundamentals;

public class Studentdetails {
	String Name="sai";
	int age = 22;
	String college = "swarnandhra";
	 
	void display() {
		System.out.println("student name is: "+Name);
		System.out.println("student age is :"+age);
		System.out.println("student college name is : "+college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentdetails s = new Studentdetails();
		s.display();
		

	}

}
