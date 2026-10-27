package com.conditionalstatements;

import java.util.Scanner;

// A customer enters a PIN and requests a cash withdrawal.
public class Conditional5 {

	public static void main(String[] args) {
		
		int correctpin = 7204;
		double balance = 10000.00;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  ATM pin : ");
		int pin = sc.nextInt();
		
		if(pin == correctpin) {
			System.out.println("Enter  withdraw amount : ");
			double amount = sc.nextDouble();
			
			if(amount <=0) {
				System.out.println("insufficient balance ");
			}else if(amount % 100 !=0) {
				System.out.println("Enter amount in multiples of 100");
				
			}else {
				balance = balance - amount;
				System.out.println("withdraw successfully ");
				System.out.println("remaining balance : "+balance);	
			}
			
		}else {
				System.out.println("invalid pin ");
			}
			sc.close();
	
	}
	}