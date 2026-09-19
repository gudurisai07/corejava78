package com.methods;
import java.util.Scanner;
public class Scannerusingmethods {
	
	void display (int rollno , String name , float height , double salary , char gender ) {
		System.out.println("Rollno : "+rollno);
		System.out.println("Name : "+name );
		System.out.println("Height" +height);
		System.out.println("Salary : "+salary);
		System.out.println("Gender ; "+gender);	
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a rollno : ");
		int rollno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a name : ");
		String name = sc.next();
		sc.nextLine();
		System.out.println("Enter a height :");
		float height= sc.nextFloat();
		System.out.println("Enter a salary :");
		double salary = sc.nextDouble();
		System.out.println("Enter  a char");
		char gender = sc.next().charAt(0);
		
		Scannerusingmethods s = new Scannerusingmethods();
		s.display(rollno,name,height,salary,gender);
		
	}

}
