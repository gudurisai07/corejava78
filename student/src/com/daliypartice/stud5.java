package com.daliypartice;

public class stud5 {
	static void m1() {
		System.out.println("method 1 is calling");
	}
	static void m2() {
		System.out.println("method 2 is calling ");
	}
	void method3() {
		System.out.println("method 3 is calling");
		
	}
	void method4() {
		System.out.println("method 3 is calling");
	}
	static void start(){
		m1();
		m2();
		
		stud5 s = new stud5();
		
		s.method3();
		s.method4();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start();
		

	}

}
