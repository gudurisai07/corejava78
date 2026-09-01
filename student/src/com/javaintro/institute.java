package com.javaintro;

public class institute {
	static String trainername1="ganesh";
	static String trainername2="jeevan";
	
	
	// instance variable 
	int empid=101;
	String empname="sai";
	String empdesignation="buleprint";
	
	

	public static void main(String[] args) {
		System.out.println("starts");
		
		
		
		
		 institute mca = new institute();
		
		 institute bca = new institute();
		
	     institute mba = new institute();
		
		 institute cse = new institute();
		
	      institute ece = new institute();
	      
		System.out.println("empid is ="+mca.empid);
		System.out.println("empname is ="+mca.empname);
		System.out.println("empdesignation is ="+mca.empdesignation);
		System.out.println("tarinername is ="+trainername1);
		System.out.println("tarinername is ="+trainername2);
		
		bca.empid=102;
		bca.empname="satya";
		

		System.out.println("empid is ="+bca.empid);
		System.out.println("empname is ="+bca.empname);
		System.out.println("empdesignation is ="+bca.empdesignation);
		System.out.println("tarinername is ="+trainername1);
		System.out.println("tarinername is ="+trainername2);
		
		
		
	
		// TODO Auto-generated method stub

	}

}
