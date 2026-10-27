package com.Constructor;

public class Employee {
	int id ;
	String name;
	double salary;
	
	
	Employee(int id , String name , double salary){
		this.id = id;
		this.name=name;
		this.salary=salary;
	
	}
	double cal(){
		
		double bonus = salary*10/100;
		
		return bonus;
		
	}
	double calculation() {
		double finalsalary = salary+cal();
		return finalsalary;
		
	}
	void display() {
		System.out.println("employee id is : "+id);
		System.out.println("employee name is : "+name);
		System.out.println("employee salary  is : "+salary);
		System.out.println("employee bonus is : "+calculation());
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(
				101,"sai",10000);
		e1.display();
		System.out.println("**********************************************");
		Employee e2 = new Employee(102,"janu",2000);
		e2.display();
		
		

	}

}
