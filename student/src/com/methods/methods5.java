package com.methods;

import java.util.Scanner;

public class methods5 {
	
	static void getstudentage(int age) {
		System.out.println("student age is :  "+age);
	}
	
	static void  getstudentname(String name) {
		System.out.println("student name is : "+name);
	}
	static void getstudentheight(float height ,  double weight) {
		System.out.println("student height    : "+height);
		System.out.println("student weight is :"+weight);
	}
	static void getstudentphoneno(long phno) {
		System.out.println("student phone number :"+phno);
	}
	static void getstudentgender(char c) {
		System.out.println("student gender is :"+c);
		
	}

	public static void main(String[] args) {
		System.out.println("main method  started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter student name :");
		String name = sc.next();
		
		System.out.println("Enter student height :");
		float h = sc.nextFloat();
		
		System.out.println("Enter student weight :");
		double w = sc.nextFloat();
		
		System.out.println("Enter student gender :");
		char c = sc.next().charAt(0);
		
		getstudentage(age);
		getstudentname(name);
		getstudentheight(h , w);
		getstudentgender(c);
	
		System.out.println("main method ended");

	}

}
