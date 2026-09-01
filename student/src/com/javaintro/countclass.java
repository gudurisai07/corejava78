package com.javaintro;

public class countclass {
	
	//static variable
	static int count=0;
	//constructor 
	countclass(){
		//count increment
		count++;
	}

	public static void main(String[] args) {
		//objects creates
		countclass c1 = new countclass();
		countclass c2 = new countclass();
		countclass c3 = new countclass();
		
		
		System.out.println("how many objects are there in class = "+count);
		
		

	}

}
