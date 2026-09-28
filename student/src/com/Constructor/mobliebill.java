package com.Constructor;

 class mobliebill {
	double mobliecost;
	double price;
	int    quntity;
	double finalbill;
	double deliverycharge;
	
	mobliebill(){
		this(20000.00);
		
	}
	mobliebill(double mobliecost){
		
		this(mobliecost,300000.00);		
	}
	mobliebill(double mobliecost , double price){
		this(mobliecost , price , 2);
	}
	mobliebill(double mobliecost , double price , int quntity){
		this(mobliecost , price , quntity , 3500.00);
		
	}
	mobliebill(double mobliecost , double price , int quntity , double deliverycharge){
		
		this.mobliecost=mobliecost;
		this.price=price;
		this.quntity=quntity;
		this.deliverycharge=deliverycharge;
		this.finalbill=finalbill;
		
	}
	void moblie() {
		System.out.println("**************************************");
		mobliecost=price*quntity;
		finalbill=mobliecost+deliverycharge;
		System.out.println("moblie cost is : "+mobliecost);
		System.out.println("moblie price is : "+price);
		System.out.println(" moblie quntity is : "+quntity);
		System.out.println("mobliie delivery charges is "+deliverycharge);
		System.out.println("moblie final bill is "+finalbill);
		
		
	}
	

	 void main(String[] args) {
		mobliebill m1 = new mobliebill();
		m1.moblie();
		mobliebill m2 = new mobliebill();
		m2.moblie();
		
		
		
	 }

}
