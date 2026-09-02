package com.javaintro;

public class Account {
	int accno;
	String name;
	double salary;
	
	 static int accountnogenertor=1000;
	 {
		 accountnogenertor++;
		 accno=accountnogenertor;
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account s = new Account();
		s.accno=1001;
		s.name="satya";
		s.salary=20000;
		
		
		Account s1= new Account();
	
		s1.name="jeevan";
		s1.salary=30000;
		
		System.out.println("accountnumber is="+s.accno);
		System.out.println("account holder is :" +s.name);
		
		System.out.println("account holder salary ="+ s.salary);
		
		System.out.println("accountnumber is="+s1.accno);
		System.out.println("account holder is :" +s1.name);
		
		System.out.println("account holder salary ="+ s1.salary);
		
		

	}

}
