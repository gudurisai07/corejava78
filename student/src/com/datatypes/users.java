package com.datatypes;

public class users {
	int pencil=100;
	int balance;
	
	int pencilcost=7;
	int count;
	int a;

	
	 void display() {
		 count=pencil/pencilcost;
		 balance=count  * pencilcost;
		 a = pencil-balance;
		
				 
		 System.out.println("how many pencil user buy "+count);
		
	     
		 System.out.println("how many balance are there : "+a);
		 
	}
	

	public static void main(String[] args) {
		users u = new users();
		
		u.display();
		
		// TODO Auto-generated method stub

	}

}
