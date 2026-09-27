package com.Constructor;

public class bankaccountdetails {
	int accountnumber;
	String accountname;
	String accounttype;
	double balance;
	
	bankaccountdetails(){
		this(101);
	}
	bankaccountdetails(int accountnumber){
		this(accountnumber,"sai");
		
	}
	bankaccountdetails(int accountnumber , String accountname){
		this(accountnumber , accountname , "saving");
	}
	bankaccountdetails(int accountnumber , String accountname , String accounttype){
		this(accountnumber , accountname , accounttype , 500000.00);
	}
	bankaccountdetails(int accountnumber , String accountname, String accounttype , Double balance){
		this.accountnumber=accountnumber;
		this.accountname=accountname;
		this.accounttype=accounttype;
		this.balance=balance;
	}
	void display() {
		System.out.println("account number is :"+accountnumber);
		System.out.println("account name is : "+accountname);
		System.out.println("account type is :"+accounttype);
		System.out.println("account balance is :"+balance);
		System.out.println("************************************");
	}

	public static void main(String[] args) {
		bankaccountdetails bank = new bankaccountdetails();
		bank.display();
		bankaccountdetails bank1 = new bankaccountdetails(101,"satya","current",100000.00);
		bank1.display();
		
		

	}

}
