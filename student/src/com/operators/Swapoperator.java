package com.operators;

public class Swapoperator {
	static int a = 10;
	static int b = 20;
	static int c;
	public static void main(String[] args) {
		System.out.println("a="+a);
		
		System.out.println("b="+b);
		
	//	int temp = a;
	//	a=b;
	//	b=temp;
		
		a = a^b;
		b = b^a;
		a = a^b;
		
		System.out.println("after  swapping ");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		System.out.println("c="+(c=b));
		

	}

}
