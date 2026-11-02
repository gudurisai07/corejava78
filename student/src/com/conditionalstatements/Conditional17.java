package com.conditionalstatements;

import java.util.Scanner;

//WAP to print factorial of given number using for loop ..?
//input : 4 --> means =--> 4* 3*2*1 = 24
public class Conditional17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number : ");
		int n=sc.nextInt();
		isfactorial(n);
		
	}
	static int isfactorial(int n) {
		int fact=1;
		for(int i=n; i>=1; i--) {
			fact=fact*i;
		}
		System.out.println("Facatorial of a given number is :  "+fact);
		return fact;
		
	}
}
