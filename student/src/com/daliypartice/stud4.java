package com.daliypartice;

public class stud4 {
	void method1() {
		method2();
		System.out.println("method 1 is calling");
	}
	void method2() {
		System.out.println("method 2 is calling ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stud4 s = new stud4();
		s.method1();

	}

}
