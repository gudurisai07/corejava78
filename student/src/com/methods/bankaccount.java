
// task   18-09-26  create a java class bankacccount with a static  variables balance intialized to 1000, //

package com.methods;

public class bankaccount {
	static int balance = 1000;
	
	void deposit(int amount) {
		System.out.println("enter the  deposite amount : "+amount);
		
		balance +=amount; 
		
		System.out.println("enter the  total amount : "+balance);
		
		
	}
	void withdraw(int amount) {
		
		 balance -=amount;
		System.out.println("enter the withdraw amount : "+balance);
		
	}

	public static void main(String[] args) {
		bankaccount b = new bankaccount();
		b.deposit(500);
		b.withdraw(300);

	}

}
