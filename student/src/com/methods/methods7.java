//Shopping Bill  
//  create a shopping bill program 

package com.methods;

import java.util.Scanner;

public class methods7 {
	static Scanner sc = new Scanner(System.in);
	int moblieprice() {
		System.out.println("Enter moblie price :");
		int moblie = sc.nextInt();
		return moblie;
	}
	int laptopprice() {
		System.out.println("Enter laptop price :");
		int laptop =sc.nextInt();
		return laptop;
		
	}
	int keyboardprice() {
		System.out.println("Enter keyboard price: ");
		int keyboard=sc.nextInt();
		return keyboard;
		
	}
	int mouseprice() {
		System.out.println("Enter mouse price :");
		int mouse =sc.nextInt();
		return mouse;
	}
	int monitorprice() {
		System.out.println("Enter monitor price :");
		int monitor=sc.nextInt();
		return monitor;
	}

	int headphoneprice() {
		System.out.println("Enter headphone price :");
		int headphone=sc.nextInt();
		return headphone;
	}
	int printerprice() {
		
		System.out.println("Enter priter price :");
		int printer=sc.nextInt();
		return printer;
	}
	int usbcableprice() {
		System.out.println("Enter usb cable price :");
		int usbcable=sc.nextInt();
		return usbcable;
		
	}
	int powerbankprice() {
		
		System.out.println("Enter powerbank price :");
		int powerbank=sc.nextInt();
		return powerbank;
		
	}
	int smartwatchprice() {
		
		System.out.println("Enter smart watch price :");
		int smartwatch =sc.nextInt();
		return smartwatch;
		
	}
	public static void main(String[] args) {
		System.out.println("main method started ");
		methods7 m = new methods7();
		int m1 = m.moblieprice();
		int l1=m.laptopprice();
		int k1=m.keyboardprice();
		int m2=m.mouseprice();
		int m3=m.monitorprice();
		int h1=m.headphoneprice();
		int p1=m.printerprice();
		int u1=m.usbcableprice();
		int p2=m.powerbankprice();
		int s1=m.smartwatchprice();
		
		int totalamount = m1+l1+k1+m2+m3+h1+p1+u1+p2+s1;
		int calculateddiscount=totalamount*10/100;
		int calculatefinalbill=totalamount-calculateddiscount;
		
		System.out.println("----------shopping details----------");
		System.out.println("moblie price is :"+m1);
		System.out.println("laptop price is :"+l1);
		System.out.println("moblie price is :"+k1);
		System.out.println("laptop price is :"+m2);
		System.out.println("moblie price is :"+m3);
		System.out.println("laptop price is :"+h1);
		System.out.println("moblie price is :"+p1);
		System.out.println("laptop price is :"+u1);
		System.out.println("moblie price is :"+p2);
		System.out.println("laptop price is :"+s1);
		
		System.out.println("calculate total amounnt :"+totalamount);
		System.out.println("calculate discount amount :"+calculateddiscount);
		System.out.println("calculate final bill :" +calculatefinalbill);
		System.out.println("main method ended ");
	
	}

}
