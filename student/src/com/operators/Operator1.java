package com.operators;

import java.util.Scanner;

public class Operator1 {
	

	public static void main(String[] args) {
		System.out.println("Main Method Ended");
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value : ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the value : ");
		int b = sc.nextInt();
		sc.nextLine();
		
		System.out.println("sum of the  number : "+(a%b));
		System.out.println(+a);
		System.out.println(+b);
		System.out.println(++a);
		System.out.println(--a);
		System.out.println(a++);
		System.out.println(a--);
		System.out.println(++b);
		System.out.println(b++);
		System.out.println(b--);
		System.out.println(--b);
		System.out.println(a*b);
		System.out.println(b*b);
		
		System.out.println(a++ + b++);
		System.out.println(+a);
		System.out.println(+b);
		System.out.println("display the final value : "+(a+b));		
		

	}

}
