package com.Constructor;

public class bankacc {
	int accno;
	String Name;
	double balance;
	String brach;
	bankacc(){
		
	}
	bankacc(bankacc b1){
		this.accno=b1.accno;
		this.Name=b1.Name;
		this.balance=b1.balance;
		this.brach=b1.brach;
	}
	
	bankacc(bankacc b1, int accno , String Name , double balance){
		this.accno=accno;
		this.Name=Name;
		this.balance=balance;
		this.brach=b1.brach;
	
	}
	
	void display() {
		System.out.println("***************************************");
		System.out.println("account number is "+accno);
		System.out.println("account holder name : "+Name);
		System.out.println("account balance is :"+balance);
		System.out.println("brach of the bank : "+brach);
	}
	

	public static void main(String[] args) {
		bankacc b1 = new bankacc();
		b1.accno=101;
		b1.Name="sai";
		b1.balance=2000.00;
		b1.brach="kphb";
		b1.display();
		
		bankacc b = new bankacc(b1);
		b.display();
		
		bankacc b2 = new bankacc(b1 ,102,"satya",4500);
		b2.display();
		
		
		
		
		

	}

}
