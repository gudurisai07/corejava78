package com.daliypartice;

public class employees {
	int emid;
	String empname;
	double empsalary;
	void method1() {
		
		emid=1;
		empname="sai";
		empsalary=20000;
		System.out.println("employee id is : "+emid);
		System.out.println("employee name is : "+empname);
		System.out.println("employee salary is ; "+empsalary);
	}
void method2() {
		
		emid=2;
		empname="ganesh";
		empsalary=20000;
		System.out.println("employee id is : "+emid);
		System.out.println("employee name is : "+empname);
		System.out.println("employee salary is ; "+empsalary);
	}
void method3() {
	
	emid=3;
	empname="manohar";
	empsalary=20000;
	System.out.println("employee id is : "+emid);
	System.out.println("employee name is : "+empname);
	System.out.println("employee salary is ; "+empsalary);
}
	

	public static void main(String[] args) {
		employees e1 = new employees();
		employees e2 = new employees();
		employees e3 = new employees();
		e1.method1();
		e2.method2();
		e3.method3();
	}

}
