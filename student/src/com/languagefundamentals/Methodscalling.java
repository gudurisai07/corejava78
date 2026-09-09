
// 09-09-26   task  methods calling  in  one  one methods

package com.languagefundamentals;

public class Methodscalling {
	
static {
		Methodscalling  m1= new Methodscalling();
		
		m1.I2();
	
	}
	static void s1(){
	
		System.out.println("static method  1 calling");
	}
	
	static void s2() {
		s1();
		System.out.println("static method 2 calling");
	}
	
	void I1() {
		s2();
		System.out.println("instance method 1 calling ");
	}
	void I2() {
		I1();
		System.out.println("instance method 2 calling ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
