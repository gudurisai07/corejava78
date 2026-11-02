package com.conditionalstatements;

import java.util.Scanner;

//WAP to print factorial of given number using for loop ...?
//Using the Recursion program;
public class Conditional18 {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a number:");

	        int n = sc.nextInt();

	        int result = factorial(n);

	        System.out.println("Factorial is: " + result);

	        sc.close();
	    }
	    static int factorial(int n) {

	        if (n == 0 || n == 1) {
	            return 1;
	        }

	        return n * factorial(n - 1);
	    }
	}