package com.methods;

public class methodscalling {

	public static void main(String[] args) {
		System.out.println("method one calling");
		methodscalling m = new methodscalling();
		m.addition(10,20);
		
	}
	 void addition(int a , int b) {
		 int sum=a+b;
		System.out.println("addition two numbers :"+sum);
		sub(sum,b);
	
	 }
	 void sub(int a , int b) {
		 int sub =a-b;
		System.out.println("sub two number"+sub);
		mul(sub,b);
		
	}
	 void mul(int a , int b) {
		 int mul = a*b;
		 
			System.out.println("mul two numbers :"+mul);
			division(mul,b);
			
		 }
	 void division(int a , int b) 
	 {
		 int division=a/b;
			System.out.println("division two numbers :"+division);
		modules(division,b);
	 }
	 void modules(int a , int b) 
	 {
		 int modules=a% b;
			System.out.println("modules two numbers :"+modules);

	 }
}
