package com.datatypes;

public class Store {
	
	
	
	byte employeeid=1;
	short employeeage=23;
	double salary=20000;
	float grade=7.8f;
	int yearofpassing=2026;
	boolean empactive = true;
	int noofleaves;
	long phoneno=9050770588l;
	
	void display() {
		noofleaves --;
		System.out.println("avaliable leaves :"+noofleaves);
		
		
		System.out.println("employee id is :"+employeeid);
		System.out.println("employee age is :"+employeeage);
		System.out.println("employee salary is :"+salary);
		System.out.println("employee grade is :"+grade);
		System.out.println("employee yearofpassing:"+yearofpassing);
		System.out.println("empactive is :"+empactive);
		System.out.println("noofleaves is :"+noofleaves);
		System.out.println("employee phone no is :"+phoneno);
	}
	
	public static void main(String[] args) {
		Store s = new Store();
		
		s.noofleaves=5;
		s.display();
		s.display();

	}

}
