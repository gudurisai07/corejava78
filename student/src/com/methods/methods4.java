package com.methods;

public class methods4 {

	

	    int addition(int a, int b) {
	        return a + b;
	        
	    }

	    int subtraction(int a, int b) {
	        return a - b;
	    }

	    int multiplication(int a, int b) {
	        return a * b;
	    }

	    public static void main(String[] args) {

	        methods4 t = new methods4();

	        int x = t.addition(20, 10);
	        int y = t.subtraction(20, 10);
	        int z = t.multiplication(20, 10);

	        System.out.println("sum of two numbers :"+x);
	        System.out.println("sub of two numbers :"+y);
	        System.out.println("mul of two numbers :"+z);
	    }
	}