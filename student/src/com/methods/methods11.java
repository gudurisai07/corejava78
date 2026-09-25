package com.methods;

public class methods11 {
	int accountnumber;
	String accountname;
	String accounttype;
	double balance;
	
	methods11(int accountnumber, String accountname, String accounttype , double balance){
		this.accountnumber=accountnumber;
		this.accountname=accountname;
		this.accounttype=accounttype;
		this.balance=balance;
		
	}
	void display() {
		System.out.println("account number is : "+accountnumber);
		System.out.println("account name is : "+accountname);
		System.out.println("account type is :"+accounttype);
		System.out.println("account balanace is :"+balance);
	}
	

	public static void main(String[] args) {
		methods11 m1 = new methods11(1,"sai","saving",100000);
		m1.display();
		methods11 m2 = new methods11(2,"satya","current",20000);
		m2.display();
	
	}

}
