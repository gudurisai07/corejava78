package com.conditionalstatements;

import java.util.Scanner;
// Calculate an electricity bill using sample rates.

public class Conditional4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Electricity  units : ");
		int units = sc.nextInt();
		
		int bill;
		
		if(units < 0) {
			System.out.println("invalid units ");
		}else if(units <= 100) {
			bill = units * 2;
			System.out.println("Eletricity bill : Rs = "+bill);
		}else if(units <=200) {
			bill=200+(units-100)*3;
			System.out.println("Eletricity bill : Rs = "+bill);
		}
		else {
			bill = 500+(units - 200)*5;
			System.out.println("Electricity bill : Rs = "+bill);
			
			sc.close();
			
			
		}

	}

}
