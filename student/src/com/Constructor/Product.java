package com.Constructor;

public class Product {
	int ProductId;
	String productName;
	double price ;
	int quantity;
	Product(int ProductId ,String productName ,double price , int quantity  ){
		this.ProductId=ProductId;
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
		
		
	}
	Product(Product p1,double cal){
		this.ProductId=p1.ProductId;
		this.productName=p1.productName;
		this.quantity=p1.quantity;
		this.price=cal;
		
		
	}
	double cal() {
		double cal=price*quantity;
		return cal;
		
	}
	void display() {
		
		
		System.out.println("product id is : "+ProductId);
		System.out.println("product name is : "+productName);
		System.out.println("product price : "+price);
		System.out.println("product quantity : "+quantity);
		System.out.println("total calculation : "+cal());
		
	
		
	}
	public static void main(String[] args) {
		Product p1 = new Product(101,"sai",2000,2);
		p1.display();
		
		System.out.println("*********************************");
		
		
		Product p2 = new Product(p1,3500);
		p2.display();
		
			

	}

}
